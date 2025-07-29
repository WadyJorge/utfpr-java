public class Motor {

    private int qtdPist;
    private int potencia;

    // Construtor padrão (sem parâmetros)
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    // Construtor recebendo parâmetros
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // Getters
    public int getQtdPist() {
        return this.qtdPist;
    }

    public int getPotencia() {
        return this.potencia;
    }

    // Setters
    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}