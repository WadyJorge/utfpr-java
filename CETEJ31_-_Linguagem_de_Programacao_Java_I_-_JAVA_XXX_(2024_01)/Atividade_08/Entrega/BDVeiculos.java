import java.util.ArrayList;
import java.util.List;

public final class BDVeiculos {

    // Lista de Veículos de Passeio
    private static final List<Passeio> listaPasseio = new ArrayList<>();
    // Lista de Veículos de Carga
    private static final List<Carga> listaCarga = new ArrayList<>();

    // Construtor que inicializa as listas de Veículos de Passeio e de Carga com alguns exemplos
    public BDVeiculos() {

        listaPasseio.add(new Passeio(4, "CHE1201", "Chevrolet", "Cruze", "Verde", 197, 4, 150, 5));
        listaPasseio.add(new Passeio(4, "FOR1201", "Ford", "Fiesta", "Azul", 210, 4, 154, 5));
        listaPasseio.add(new Passeio(4, "HON1201", "Honda", "Civic", "Branco", 202, 4, 155, 5));
        listaPasseio.add(new Passeio(4, "TOY1201", "Toyota", "Corolla", "Vermelho", 210, 4, 154, 5));
        listaPasseio.add(new Passeio(4, "VOL1201", "Volkswagen", "Jetta", "Amarelo", 210, 4, 211, 5));

        listaCarga.add(new Carga(9000, 25000, "FOR1201", "Ford", "F-250", "Vermelho", 160, 6, 180, 0));
        listaCarga.add(new Carga(7000, 15000, "IVE1201", "Iveco", "Tector", "Prata", 130, 6, 140, 0));
        listaCarga.add(new Carga(4000, 9000, "MER1201", "Mercedes-Benz", "L-312", "Azul", 100, 6, 112, 0));
        listaCarga.add(new Carga(9000, 28000, "SCA1201", "Scania", "P360", "Amarelo", 160, 8, 200, 0));
        listaCarga.add(new Carga(9000, 47000, "VOL1201", "Volkswagen", "Constellation 19.320", "Black Piano", 150, 12, 320, 0));

    }

    // Método para cadastrar um novo Veículo de Passeio
    public boolean cadastrarPasseio(Passeio novoPasseio) {
        return listaPasseio.add(novoPasseio);
    }

    // Método para cadastrar um novo Veículo de Carga
    public boolean cadastrarCarga(Carga novoCarga) {
        return listaCarga.add(novoCarga);
    }

    // Método para listar todos os Veículos de Passeio
    public List<Passeio> listarTodosVeiculosPasseio() {
        return listaPasseio;
    }

    // Método para listar todos os Veículos de Carga
    public List<Carga> listarTodosVeiculosCarga() {
        return listaCarga;
    }

    // Método para excluir um Veículo de Passeio
    public boolean excluirVeiculoPasseio(Passeio passeio) {
        return listaPasseio.remove(passeio);
    }

    // Método para excluir um Veículo de Carga
    public boolean excluirVeiculoCarga(Carga carga) {
        return listaCarga.remove(carga);
    }

    // Método para excluir todos os Veículos de Passeio presentes na lista
    public boolean excluirTodosVeiculosPasseio(List<Passeio> passeioRemoverLista) {
        return listaPasseio.removeAll(passeioRemoverLista);
    }

    // Método para excluir todos os Veículos de Carga presentes na lista
    public boolean excluirTodosVeiculosCarga(List<Carga> cargaRemoverLista) {
        return listaCarga.removeAll(cargaRemoverLista);
    }

}