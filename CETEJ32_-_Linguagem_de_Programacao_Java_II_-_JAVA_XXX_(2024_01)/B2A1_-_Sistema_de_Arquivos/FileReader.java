package br.edu.utfpr.sistemarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    public void read(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            throw new UnsupportedOperationException("O caminho especificado é um diretório, não um arquivo.");
        }

        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}