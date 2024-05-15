import java.util.Arrays;
import java.util.Objects;

public final class BDVeiculos {

    private Passeio[] listaPasseio;
    private Carga[] listaCarga;

    // Construtor que inicializa as listas de Veículos de Passeio e de Carga
    public BDVeiculos() {
        this.listaPasseio = new Passeio[5];
        this.listaCarga = new Carga[5];
    }

    // Getters
    public Passeio[] getListaPasseio() {
        return this.listaPasseio;
    }

    public Carga[] getListaCarga() {
        return this.listaCarga;
    }

    // Setters
    public void setListaPasseio(Passeio[] listaPasseio) {
        this.listaPasseio = listaPasseio;
    }

    public void setListaCarga(Carga[] listaCarga) {
        this.listaCarga = listaCarga;
    }


    // Método para verificar se uma placa já existe na lista de Veículos de Passeio
    public boolean placaExistsInListaPasseio(String placa) throws VeicExistException {
        for (Passeio passeio : listaPasseio) {
            if (passeio != null && passeio.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            } 
        }
        return false;
    }

    // Método para verificar se uma placa já existe na lista de Veículos de Carga
    public boolean placaExistsInListaCarga(String placa) throws VeicExistException {
        for (Carga carga : listaCarga) {
            if (carga != null && carga.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar se a lista de Veículos de Passeio está cheia
    public boolean listaCheiaPasseio() {
        return Arrays.stream(listaPasseio).allMatch(Objects::nonNull);
    }

    // Método para verificar se a lista de Veículos de Carga está cheia
    public boolean listaCheiaCarga() {
        return Arrays.stream(listaCarga).allMatch(Objects::nonNull);
    }

}