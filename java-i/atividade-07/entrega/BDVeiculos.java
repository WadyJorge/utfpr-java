import java.util.ArrayList;
import java.util.List;

public final class BDVeiculos {

    private List<Passeio> listaPasseio;
    private List<Carga> listaCarga;

    // Construtor que inicializa as listas de Veículos de Passeio e de Carga
    public BDVeiculos() {
        this.listaPasseio = new ArrayList<>();
        this.listaCarga = new ArrayList<>();
    }

    // Getters e Setters
    public List<Passeio> getListaPasseio() {
        return listaPasseio;
    }

    public void setListaPasseio(List<Passeio> listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(List<Carga> listaCarga) {
        this.listaCarga = listaCarga;
    }

    // Método para verificar se uma placa já existe na lista de Veículos de Passeio
    public boolean placaExistsInListaPasseio(String placa) {
        for (Passeio passeio : listaPasseio) {
            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar se uma placa já existe na lista de Veículos de Carga
    public boolean placaExistsInListaCarga(String placa) {
        for (Carga carga : listaCarga) {
            if (carga != null && carga.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    // Método para buscar um Veículo de Passeio pela placa
    public Passeio searchPlacaInListaPasseio(String placa) {
        for (Passeio passeio : listaPasseio) {
            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placa)) {
                return passeio;
            }
        }
        return null;
    }

    // Método para buscar um Veículo de Carga pela placa
    public Carga searchPlacaInListaCarga(String placa) {
        for (Carga carga : listaCarga) {
            if (carga != null && carga.getPlaca().equalsIgnoreCase(placa)) {
                return carga;
            }
        }
        return null;
    }

}