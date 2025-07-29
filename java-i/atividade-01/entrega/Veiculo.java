public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    // Construtor padrão (sem parâmetros)
    public Veiculo() {
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.velocMax = 0;
        this.qtdRodas = 0;
        this.motor = new Motor();
    }

    /*
     * Construtor recebendo parâmetros para o objeto Veiculo e instanciando o objeto motor sem parâmetros
     */
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor();
    }

    /*
     * Construtor recebendo parâmetros para o objeto Veiculo e instanciando o objeto motor com parâmetros
     */
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
    }

    // Getters
    public String getPlaca() {
        return this.placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public float getVelocMax() {
        return this.velocMax;
    }

    public int getQtdRodas() {
        return this.qtdRodas;
    }

    public Motor getMotor() {
        return this.motor;
    }

    // Setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Sobrescrita do método toString para imprimir o objeto
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Placa: ").append(this.placa).append("\n");
        builder.append("Marca: ").append(this.marca).append("\n");
        builder.append("Modelo: ").append(this.modelo).append("\n");
        builder.append("Cor: ").append(this.cor).append("\n");
        builder.append("Velocidade Máxima: ").append(this.velocMax).append(" km/h").append("\n");
        builder.append("Quantidade de Rodas: ").append(this.qtdRodas).append("\n");
        builder.append("Quantidade de Pistões: ").append(this.motor.getQtdPist()).append("\n");
        builder.append("Potência: ").append(this.motor.getPotencia()).append(" cv").append("\n");
        builder.append("---------------------------------------------");
        return builder.toString();
    }

}