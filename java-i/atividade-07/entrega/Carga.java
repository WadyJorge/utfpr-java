public final class Carga extends Veiculo implements Calcular {

    private int cargaMax;
    private int tara;

    // Construtor padrão (sem parâmetros)
    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    // Construtor recebendo parâmetros
    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    // Getters e Setters
    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    // Sobrescrita do método presente na superclasse Veiculo (usado no cálculo de velocidade)
    @Override
    public float calcVel(float velocMax) {
        float velocidade = (velocMax * 100000);
        return velocidade;
    }

    // Sobrescrita do método presente na interface Calcular (usado na soma dos valores contidos nos atributos numéricos)
    @Override
    public int calcular() {
        int somaNumeros = 0;

        somaNumeros += getVelocMax();
        somaNumeros += getQtdRodas();
        somaNumeros += getMotor().getQtdPist();
        somaNumeros += getMotor().getPotencia();
        somaNumeros += getCargaMax();
        somaNumeros += getTara();

        return somaNumeros;
    }

    // Sobrescrita do método toString para imprimir o objeto Veiculo Carga
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("--------------- VEÍCULO CARGA: ---------------\n");
        builder.append("Placa: ").append(this.getPlaca()).append("\n");
        builder.append("Marca: ").append(this.getMarca()).append("\n");
        builder.append("Modelo: ").append(this.getModelo()).append("\n");
        builder.append("Cor: ").append(this.getCor()).append("\n");
        builder.append("Velocidade Máxima (km/h): ").append(getVelocMax()).append(" km/h").append("\n");
        builder.append("Velocidade Máxima (cm/h): ").append(String.format("%.3f", this.calcVel(this.getVelocMax()))).append(" cm/h").append("\n");
        builder.append("Quantidade de Rodas: ").append(this.getQtdRodas()).append("\n");
        builder.append("Quantidade de Pistões: ").append(this.getMotor().getQtdPist()).append("\n");
        builder.append("Potência: ").append(this.getMotor().getPotencia()).append(" cv").append("\n");
        builder.append("Carga Máxima: ").append(this.getCargaMax()).append(" kg").append("\n");
        builder.append("Tara: ").append(this.getTara()).append(" kg").append("\n");
        builder.append("----------------------------------------------");
        return builder.toString();
    }

}