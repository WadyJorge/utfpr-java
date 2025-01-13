package br.edu.utfpr.sistemarquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public enum Command {

    LIST() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("LIST") || commands[0].startsWith("list");
        }

        @Override
        Path execute(Path path) throws IOException {

            File directory = path.toFile();
            if (directory.isDirectory()) {
                String[] contents = directory.list();
                if (contents != null) {
                    for (String item : contents) {
                        System.out.println(item);
                    }
                }
            } else {
                throw new UnsupportedOperationException("O caminho especificado não é um diretório válido.");
            }
            return path;
        }
    },
    SHOW() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("SHOW") || commands[0].startsWith("show");
        }

        @Override
        Path execute(Path path) throws IOException {
            if (parameters.length < 2) {
                throw new UnsupportedOperationException("Parâmetro de nome do arquivo faltando para o comando SHOW.");
            }

            Path filePath = path.resolve(parameters[1]);
            File file = filePath.toFile();

            if (file.isFile() && file.getName().endsWith(".txt")) {
                FileReader fileReader = new FileReader();
                fileReader.read(filePath);
            } else if (file.isDirectory()) {
                throw new UnsupportedOperationException("O comando SHOW não pode ser usado em diretórios, apenas em arquivos.");
            } else {
                throw new UnsupportedOperationException("O arquivo não é um arquivo de texto ou não existe.");
            }

            return path;
        }
    },
    BACK() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("BACK") || commands[0].startsWith("back");
        }

        @Override
        Path execute(Path path) throws IOException {
            Path parentPath = path.getParent();
            Path hdPath = Paths.get(Application.ROOT).normalize().toAbsolutePath();

            if (parentPath != null && isSubDirectory(parentPath.toAbsolutePath(), hdPath)) {
                return parentPath;
            } else {
                throw new UnsupportedOperationException("Não é possível voltar além do diretório raiz do sistema de arquivos.");
            }
        }

        // Método auxiliar para verificar se um diretório é subdiretório de outro
        private boolean isSubDirectory(Path parent, Path child) throws IOException {
            return parent.normalize().toRealPath().startsWith(child.normalize().toRealPath());
        }
    },
    OPEN() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("OPEN") || commands[0].startsWith("open");
        }

        @Override
        Path execute(Path path) throws IOException {

            if (parameters.length < 2) {
                throw new UnsupportedOperationException("Parâmetro de nome do diretório faltando para o comando OPEN.");
            }

            Path newPath = path.resolve(parameters[1]);
            File directory = newPath.toFile();

            if (directory.isDirectory()) {
                return newPath;
            } else {
                throw new UnsupportedOperationException("O caminho não é um diretório ou não existe.");
            }
        }
    },
    DETAIL() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("DETAIL") || commands[0].startsWith("detail");
        }

        @Override
        Path execute(Path path) throws IOException {

            if (parameters.length < 2) {
                throw new UnsupportedOperationException("Parâmetro de nome de arquivo ou diretório faltando para o comando DETAIL.");
            }

            Path filePath = path.resolve(parameters[1]);
            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);

            System.out.println("Tamanho: " + attrs.size());
            System.out.println("Data de Criação: " + attrs.creationTime());
            System.out.println("Último Acesso: " + attrs.lastAccessTime());
            System.out.println("Última Modificação: " + attrs.lastModifiedTime());
            System.out.println("É Diretório: " + attrs.isDirectory());
            System.out.println("É Arquivo Regular: " + attrs.isRegularFile());

            return path;
        }
    },
    EXIT() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("EXIT") || commands[0].startsWith("exit");
        }

        @Override
        Path execute(Path path) {
            System.out.print("Saindo...");
            return path;
        }

        @Override
        boolean shouldStop() {
            return true;
        }
    };

    abstract Path execute(Path path) throws IOException;

    abstract boolean accept(String command);

    void setParameters(String[] parameters) {
    }

    boolean shouldStop() {
        return false;
    }

    public static Command parseCommand(String commandToParse) {

        if (commandToParse.isBlank()) {
            throw new UnsupportedOperationException("Digite algo...");
        }

        final var possibleCommands = values();

        for (Command possibleCommand : possibleCommands) {
            if (possibleCommand.accept(commandToParse)) {
                possibleCommand.setParameters(commandToParse.split(" "));
                return possibleCommand;
            }
        }

        throw new UnsupportedOperationException("Não foi possível interpretar o comando [%s]".formatted(commandToParse));
    }
}