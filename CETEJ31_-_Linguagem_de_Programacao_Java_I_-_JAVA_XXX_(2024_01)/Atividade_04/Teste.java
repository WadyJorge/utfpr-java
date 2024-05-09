import java.util.ArrayList;
import java.util.List;

public class Teste {

    private static List<Passeio> passeioLista = new ArrayList<>();
    private static List<Carga> cargaLista = new ArrayList<>();
    private static Leitura leitura = new Leitura();

    public static void main(String[] args) {

        int opcao = 0;

        do {
            try {

                System.out.println("\n============================================================");
                System.out.println("\n--------------------------------------------");
                System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
                System.out.println("--------------------------------------------\n");
                System.out.println("1 - Cadastrar Veiculo de Passeio");
                System.out.println("2 - Cadastrar Veículo de Carga");
                System.out.println("3 - Imprimir Todos os Veículos de Passeio");
                System.out.println("4 - Imprimir Todos os Veículos de Carga");
                System.out.println("5 - Imprimir Veículo de Passeio pela Placa");
                System.out.println("6 - Imprimir Veículo de Carga pela Placa");
                System.out.println("7 - Sair do Sistema");
                System.out.println("\n============================================================");
                opcao = Integer.parseInt(leitura.entDados("Selecione uma das opções acima: "));

                switch (opcao) {

                    case 1:
                        for (int i = 0; i < 5; i++) {
                            if (passeioLista.size() == 5) {
                                leitura.entDados("\nLimite máximo de 05 Veiculos de Passeio atingido! Pressione <Enter>");
                                break;
                            }

                            System.out.println("============== CADASTRO DE VEÍCULO DE PASSEIO ==============");
                            if (!cadastrarVeiculoPasseio()) {
                                leitura.entDados("\nPlaca já cadastrada em um Veículo de Passeio! Pressione <Enter>");
                                break;
                            } else {
                                String sair = "";

                                while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                                    sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)ão>");
                                }

                                if (sair.equalsIgnoreCase("n"))
                                    break;
                            }
                        }
                        break;

                    case 2:
                        for (int i = 0; i < 5; i++) {
                            if (cargaLista.size() == 5) {
                                leitura.entDados("\nLimite máximo de 05 Veiculos de Carga atingido! Pressione <Enter>");
                                break;
                            }

                            System.out.println("=============== CADASTRO DE VEÍCULO DE CARGA ===============");
                            if (!cadastrarVeiculoCarga()) {
                                leitura.entDados("\nPlaca já cadastrada em um Veículo de Carga! Pressione <Enter>");
                                break;
                            }

                            String sair = "";

                            while (!sair.equalsIgnoreCase("n") && !sair.equalsIgnoreCase("s")) {
                                sair = leitura.entDados("\nDeseja realizar um novo cadastro? (S)im/(N)ão>");
                            }

                            if (sair.equalsIgnoreCase("n"))
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("\n");
                        System.out.println("========== LISTA DE TODOS OS VEÍCULOS DE PASSEIO: ==========");
                        listarTodosVeiculosPasseio();
                        System.out.println("\n");
                        break;

                    case 4:
                        System.out.println("\n");
                        System.out.println("=========== LISTA DE TODOS OS VEÍCULOS DE CARGA: ===========");
                        listarTodosVeiculosCarga();
                        System.out.println("\n");
                        break;

                    case 5:
                        System.out.println("\n========== CONSULTAR VEÍCULO DE PASSEIO PELA PLACA =========");
                        System.out.println("Insira os dados solicitados abaixo:");
                        System.out.println("============================================================");
                        procurarVeiculosPasseioPorPlaca(leitura.entDados("\nDigite a placa para realizar a busca: "));
                        break;

                    case 6:
                        System.out.println("\n=== CONSULTAR VEÍCULO DE CARGA PELA PLACA ===");
                        procurarVeiculosCargaPorPlaca(leitura.entDados("\nDigite a placa para realizar a busca: "));
                        break;

                    case 7:
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

    public static boolean cadastrarVeiculoPasseio() {

        Passeio novoPasseio = new Passeio();

        System.out.println("Insira os dados e valores solicitados abaixo:");
        System.out.println("============================================================");
        novoPasseio.setPlaca(leitura.entDados("\nPlaca do Veículo: "));
        novoPasseio.setMarca(leitura.entDados("\nMarca do Veículo: "));
        novoPasseio.setModelo(leitura.entDados("\nModelo do Veículo: "));
        novoPasseio.setCor(leitura.entDados("\nCor do Veículo: "));
        novoPasseio.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Máxima do Veículo: ")));
        novoPasseio.setQtdRodas(Integer.parseInt(leitura.entDados("\nQuantidade de Rodas do Veículo: ")));
        novoPasseio.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de Pistões do Motor: ")));
        novoPasseio.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do Motor: ")));
        novoPasseio.setQtdPassageiros(Integer.parseInt(leitura.entDados("\nQuantidade de Passageiros do Veículo: ")));

        if (passeioLista.stream().filter(i -> i.getPlaca().equalsIgnoreCase(novoPasseio.getPlaca())).findAny()
                .isPresent()) {
            return false;
        }

        return passeioLista.add(novoPasseio);
    }

    public static boolean cadastrarVeiculoCarga() {

        Carga novaCarga = new Carga();

        System.out.println("Insira os dados e valores solicitados abaixo:");
        System.out.println("============================================================");
        novaCarga.setPlaca(leitura.entDados("\nPlaca do Veículo: "));
        novaCarga.setMarca(leitura.entDados("\nMarca do Veículo: "));
        novaCarga.setModelo(leitura.entDados("\nModelo do Veículo: "));
        novaCarga.setCor(leitura.entDados("\nCor do Veículo: "));
        novaCarga.setVelocMax(Integer.parseInt(leitura.entDados("\nVelocidade Máxima do Veículo: ")));
        novaCarga.setQtdRodas(Integer.parseInt(leitura.entDados("\nQuantidade de Rodas do Veículo: ")));
        novaCarga.getMotor().setQtdPist(Integer.parseInt(leitura.entDados("\nQuantidade de Pistões do Motor: ")));
        novaCarga.getMotor().setPotencia(Integer.parseInt(leitura.entDados("\nPotência do Motor: ")));
        novaCarga.setCargaMax(Integer.parseInt(leitura.entDados("\nCarga Máxima do Veículo: ")));
        novaCarga.setTara(Integer.parseInt(leitura.entDados("\nTara do Veículo: ")));

        if (cargaLista.stream().filter(i -> i.getPlaca().equalsIgnoreCase(novaCarga.getPlaca())).findAny().isPresent()) {
            return false;
        }

        return cargaLista.add(novaCarga);
    }

    public static void listarTodosVeiculosPasseio() {

        for (Passeio passeio : passeioLista) {
            System.out.println("\n============ Veículo de Passeio nº: " + (passeioLista.indexOf(passeio) + 1) + " ============");
            System.out.println(passeio.toString());
            System.out.println("\nSoma das quantidades de letras existentes em todos os atributos do tipo String: " + passeio.calcular());
        }
    }
    
    public static void listarTodosVeiculosCarga() {

        for (Carga carga : cargaLista) {
            System.out.println("\n============ Veículo de Carga nº: " + (cargaLista.indexOf(carga) + 1) + " ============");
            System.out.println(carga.toString());
            System.out.println("\nSoma de todos os valores de atributos númericos: " + carga.calcular());
        }
    }

    public static void procurarVeiculosPasseioPorPlaca(String placa) {

        System.out.println("\n=== PLACA BUSCADA NA LISTA DE VEÍCULOS DE PASSEIO: " + placa + " ===");

        for (Passeio passeio : passeioLista) {

            if (passeio.getPlaca().equals(placa)) {

                System.out.println("\n===== Veículo de Passeio nº: " + passeioLista.indexOf(passeio) + " ======");
                System.out.println(passeio.toString());
                System.out.println("\nSoma das quantidades de caracteres existentes em todos os atributos do tipo String: " + passeio.calcular());
            }
        }
    }

    public static void procurarVeiculosCargaPorPlaca(String placa) {

        System.out.println("\n=== PLACA BUSCADA NA LISTA DE VEÍCULOS DE CARGA: " + placa + " ===");

        for (Carga carga : cargaLista) {
            if (carga.getPlaca().equals(placa)) {
                System.out.println(carga.toString());
                System.out.println("\nSoma de todos os valores de atributos numéricos: " + carga.calcular());
            }
        }
    }

}