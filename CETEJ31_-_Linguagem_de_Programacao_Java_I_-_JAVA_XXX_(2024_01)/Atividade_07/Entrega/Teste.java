public class Teste {

    private static BDVeiculos bdVeiculos = new BDVeiculos();
    private static Leitura leitura = new Leitura();

    public static void main(String[] args) throws VeicExistException, VelocException {

        int opcao = 0;

        do {
            try {

                System.out.println("\n============================================================");
                System.out.println("\n--------------------------------------------");
                System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
                System.out.println("--------------------------------------------\n");
                System.out.println("1 - Cadastrar Veículo de Passeio");
                System.out.println("2 - Cadastrar Veículo de Carga");
                System.out.println("3 - Imprimir Todos os Veículos de Passeio");
                System.out.println("4 - Imprimir Todos os Veículos de Carga");
                System.out.println("5 - Imprimir Veículo de Passeio pela Placa");
                System.out.println("6 - Imprimir Veículo de Carga pela Placa");
                System.out.println("7 - Excluir Veículo de Passeio pela Placa");
                System.out.println("8 - Excluir Veículo de Carga pela Placa");
                System.out.println("9 - Sair do Sistema");
                System.out.println("\n============================================================");
                opcao = Integer.parseInt(leitura.entDados("Selecione uma das opções acima: "));

                switch (opcao) {
                case 1:
                    cadastrarVeiculoPasseio();
                    break;
                case 2:
                    cadastrarVeiculoCarga();
                    break;
                case 3:
                    listarTodosVeiculosPasseio();
                    break;
                case 4:
                    listarTodosVeiculosCarga();
                    break;
                case 5:
                    procurarVeiculoPasseioPorPlaca();
                    break;
                case 6:
                    procurarVeiculoCargaPorPlaca();
                    break;
                case 7:
                    excluirVeiculoPasseioPorPlaca();
                    break;
                case 8:
                    excluirVeiculoCargaPorPlaca();
                    break;
                case 9:
                    System.out.println("Você saiu do sistema!");
                    break;
                default:
                    System.out.println("Opção não encontrada! Escolha um número entre 1 e 7!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Opção inválida, tente novamente! Pressione <Enter>");
                leitura.entDados("");
                System.out.println("\n");
            }

        } while (opcao != 7);
    }

    // Método que realiza o cadastro de um Veículo de Passeio
    public static void cadastrarVeiculoPasseio() throws VeicExistException, VelocException {
        String sair = " ";

        do {
            try {
                System.out.println("============== CADASTRO DE VEÍCULO DE PASSEIO ==============");
                System.out.println("============================================================");
                String placa = leitura.entDados("\nPlaca do Veículo: ");

                if (bdVeiculos.placaExistsInListaPasseio(placa)) {
                    throw new VeicExistException();
                }

                Passeio novoPasseio = new Passeio();
                novoPasseio.setPlaca(placa);
                novoPasseio.setMarca(leitura.entDados("\nMarca do Veículo: "));
                novoPasseio.setModelo(leitura.entDados("\nModelo do Veículo: "));
                novoPasseio.setCor(leitura.entDados("\nCor do Veículo: "));

                try {
                    novoPasseio.setVelocMax(setVelocMaxPasseio(Integer.parseInt(leitura.entDados("\nVelocidade Máxima do Veículo: "))));
                } catch (VelocException e) {
                    System.out.println(e.getMessage());
                    novoPasseio.setVelocMax(100);
                }

                novoPasseio.setQtdRodas(Integer.parseInt(leitura.entDados("\nQuantidade de Rodas do Veículo: ")));
                novoPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de Pistões do Motor: ")));
                novoPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do Motor: ")));
                novoPasseio.setQtdPassageiros(Integer.parseInt(leitura.entDados("\nQuantidade de Passageiros do Veículo: ")));

                bdVeiculos.getListaPasseio().add(novoPasseio);

            } catch (VeicExistException e) {
                System.out.println(e.getMessage());
            }

            sair = " ";

            while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                sair = leitura.entDados("\nDeseja realizar um novo cadastro? <(S)im/(N)ão>");
            }

        } while (sair.equalsIgnoreCase("s"));
    }

    // Método que realiza o cadastro de um Veículo de Carga
    public static void cadastrarVeiculoCarga() throws VeicExistException, VelocException {
        String sair = " ";

        do {
            try {
                System.out.println("=============== CADASTRO DE VEÍCULO DE CARGA ===============");
                System.out.println("============================================================");
                String placa = leitura.entDados("\nPlaca do Veículo: ");

                if (bdVeiculos.placaExistsInListaCarga(placa)) {
                    throw new VeicExistException();
                }

                Carga novaCarga = new Carga();
                novaCarga.setPlaca(placa);
                novaCarga.setMarca(leitura.entDados("\nMarca do Veículo: "));
                novaCarga.setModelo(leitura.entDados("\nModelo do Veículo: "));
                novaCarga.setCor(leitura.entDados("\nCor do Veículo: "));

                try {
                    novaCarga.setVelocMax(setVelocMaxCarga(Integer.parseInt(leitura.entDados("\nVelocidade Máxima do Veículo: "))));
                } catch (VelocException e) {
                    System.out.println(e.getMessage());
                    novaCarga.setVelocMax(90);
                }

                novaCarga.setQtdRodas(Integer.parseInt(leitura.entDados("\nQuantidade de Rodas do Veículo: ")));
                novaCarga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de Pistões do Motor: ")));
                novaCarga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do Motor: ")));
                novaCarga.setCargaMax(Integer.parseInt(leitura.entDados("\nCarga Máxima do Veículo: ")));
                novaCarga.setTara(Integer.parseInt(leitura.entDados("\nTara do Veículo: ")));

                bdVeiculos.getListaCarga().add(novaCarga);

            } catch (VeicExistException e) {
                System.out.println(e.getMessage());
            }

            sair = " ";

            while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                sair = leitura.entDados("\nDeseja realizar um novo cadastro? <(S)im/(N)ão>");
            }

        } while (sair.equalsIgnoreCase("s"));
    }

    // Método que lista todos os Veículos do tipo Passeio
    public static void listarTodosVeiculosPasseio() {
        if (bdVeiculos.getListaPasseio() != null && bdVeiculos.getListaPasseio().size() > 0) {
            int posicaoVeiculo = 1;

            System.out.println("============== LISTA DE VEÍCULOS DE PASSEIO: ==============");

            for (Passeio passeio : bdVeiculos.getListaPasseio()) {
                if (passeio != null) {
                    int posicao = posicaoVeiculo++;
                    System.out.println("\n============ Veículo de Passeio nº: " + posicao + " ============");
                    System.out.println(passeio.toString());
                    System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: \n" + passeio.calcular());
                }
            }
        } else {
            System.out.println("\n********************************************\n === Lista de Veículos de Passeio vazia! === \n********************************************");
        }
    }

    // Método que lista todos os Veículos do tipo Carga
    public static void listarTodosVeiculosCarga() {
        if (bdVeiculos.getListaCarga() != null && bdVeiculos.getListaCarga().size() > 0) {
            int posicaoVeiculo = 1;

            System.out.println("=========== LISTA DE TODOS OS VEÍCULOS DE CARGA: ===========");

            for (Carga carga : bdVeiculos.getListaCarga()) {
                if (carga != null) {
                    int posicao = posicaoVeiculo++;
                    System.out.println("\n============ Veículo de Carga nº: " + posicao + " ============\n");
                    System.out.println(carga.toString());
                    System.out.println("\nSoma de todos os valores de atributos númericos: " + carga.calcular());
                }
            }
        } else {
            System.out.println("\n******************************************\n === Lista de Veículos de Carga vazia! === \n******************************************");
        }
    }

    // Método que consulta Veículos de Passeio pela Placa
    public static void procurarVeiculoPasseioPorPlaca() {
        System.out.println("\n========== IMPRIMIR VEÍCULO DE PASSEIO PELA PLACA: =========");
        System.out.println("============================================================");

        String placa = leitura.entDados("\n========== Digite a placa para realizar a busca: ===========");
        Passeio veiculoPasseio = bdVeiculos.searchPlacaInListaPasseio(placa);

        if (veiculoPasseio != null) {
            System.out.println("\n===== Placa Pesquisada na lista de Veículos de Passeio: " + placa + " ======");
            System.out.println(veiculoPasseio.toString());
            System.out.println("\nSoma das quantidades de caracteres existentes em todos os atributos do tipo String: " + veiculoPasseio.calcular());
        } else {
            System.out.println("\n\n****************************************************************\n === Veículo de Passeio com a placa '" + placa + "' não encontrado! === \n****************************************************************");
        }
    }

    // Método que consulta Veículos de Carga pela Placa
    public static void procurarVeiculoCargaPorPlaca() {
        System.out.println("\n=========== IMPRIMIR VEÍCULO DE CARGA PELA PLACA: ==========");
        System.out.println("============================================================");

        String placa = leitura.entDados("\n========== Digite a placa para realizar a busca: ===========");
        Carga veiculoCarga = bdVeiculos.searchPlacaInListaCarga(placa);

        if (veiculoCarga != null) {
            System.out.println("\n===== Placa Pesquisada na lista de Veículos de Carga: " + placa + " ======");
            System.out.println(veiculoCarga.toString());
            System.out.println("\nSoma de todos os valores de atributos numéricos: " + veiculoCarga.calcular());
        } else {
            System.out.println("\n\n****************************************************************\n === Veículo de Carga com a placa '" + placa + "' não encontrado! === \n****************************************************************");
        }
    }

    // Método que exclui Veículos de Passeio pela Placa
    public static void excluirVeiculoPasseioPorPlaca() {
        System.out.println("\n========== EXCLUIR VEÍCULO DE PASSEIO PELA PLACA: ==========");
        System.out.println("============================================================");

        String placa = leitura.entDados("\n============ Digite a placa que deseja excluir: ============");
        Passeio veiculoPasseio = bdVeiculos.searchPlacaInListaPasseio(placa);

        if (veiculoPasseio != null) {
            bdVeiculos.getListaPasseio().remove(veiculoPasseio);
            System.out.println("\n\n*****************************************************\n === Veículo de Passeio excluído com sucesso! === \n*****************************************************");
        } else {
            System.out.println("\n\n****************************************************************\n === Veículo de Passeio com a placa '" + placa + "' não encontrado! === \n****************************************************************");
        }
    }

    // Método que exclui Veículos de Carga pela Placa
    public static void excluirVeiculoCargaPorPlaca() {
        System.out.println("\n========== EXCLUIR VEÍCULO DE CARGA PELA PLACA: ==========");
        System.out.println("==========================================================");

        String placa = leitura.entDados("\n=========== Digite a placa que deseja excluir: ===========");
        Carga veiculoCarga = bdVeiculos.searchPlacaInListaCarga(placa);

        if (veiculoCarga != null) {
            bdVeiculos.getListaCarga().remove(veiculoCarga);
            System.out.println("\n\n*****************************************************\n === Veículo de Carga excluído com sucesso! === \n*****************************************************");
        } else {
            System.out.println("\n\n****************************************************************\n === Veículo de Carga com a placa '" + placa + "' não encontrado! === \n****************************************************************");
        }
    }

    // Método que verifica se a velocidade máxima de um Veículo de Passeio está adequada aos limites brasileiros
    public static int setVelocMaxPasseio(int velocMax) throws VelocException {
        if (velocMax > 80 && velocMax < 110) {
            return velocMax;
        }
        throw new VelocException();
    }

    // Método que verifica se a velocidade máxima de um Veículo de Carga está adequada aos limites brasileiros
    public static int setVelocMaxCarga(int velocMax) throws VelocException {
        if (velocMax > 80 && velocMax < 110) {
            return velocMax;
        }
        throw new VelocException();
    }

}