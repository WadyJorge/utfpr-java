public final class Passeio extends Veiculo implements Calcular {

  private int qtdPassageiros;

  // Construtor padrão (sem parâmetros)
  public Passeio() {
    this.qtdPassageiros = 0;
  }

  // Construtor recebendo parâmetros
  public Passeio(int qtdPassageiros) {
    this.qtdPassageiros = qtdPassageiros;
  }

  // Construtor para inicializar um objeto da classe Passeio com todos os atributos
  public Passeio(int qtdePassageiros, String placa, String marca, String modelo, String cor, int velocMax, int qtdeRodas, int qtdPist, int potencia) {
    super(placa, marca, modelo, cor, velocMax, qtdeRodas, qtdPist, potencia);
    this.qtdPassageiros = qtdePassageiros;
  }

  // Getters e Setters
  public int getQtdPassageiros() {
    return qtdPassageiros;
  }

  public void setQtdPassageiros(int qtdPassageiros) {
    this.qtdPassageiros = qtdPassageiros;
  }

  // Sobrescrita do método presente na superclasse Veiculo (usado no cálculo de velocidade)
  @Override
  public float calcVel(float velocMax) {
    float velocidade = (velocMax * 1000);
    return velocidade;
  }

  // Sobrescrita do método presente na interface Calcular (usado na soma da quantidade de caracteres)
  @Override
  public int calcular() {
    int somaLetras = 0;

    somaLetras += getPlaca().length();
    somaLetras += getMarca().length();
    somaLetras += getModelo().length();
    somaLetras += getCor().length();

    return somaLetras;
  }

  // Método que verifica se a velocidade máxima de um Veículo de Carga está adequada aos limites brasileiros
  public int setVelocMaxPasseio(int velocMax) throws VelocException {
    if (velocMax > 80 && velocMax < 110) {
      return velocMax;
    }
    throw new VelocException();
  }

  // Sobrescrita do método toString para imprimir o objeto Veiculo Passeio
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("--------------- VEÍCULO PASSEIO: ---------------\n");
    builder.append("Placa: ").append(this.getPlaca()).append("\n");
    builder.append("Marca: ").append(this.getMarca()).append("\n");
    builder.append("Modelo: ").append(this.getModelo()).append("\n");
    builder.append("Cor: ").append(this.getCor()).append("\n");
    builder.append("Velocidade Máxima (km/h): ").append(getVelocMax()).append(" km/h").append("\n");
    builder.append("Velocidade Máxima (m/h): ").append(String.format("%.3f", this.calcVel(this.getVelocMax()))).append(" m/h").append("\n");
    builder.append("Quantidade de Rodas: ").append(this.getQtdRodas()).append("\n");
    builder.append("Quantidade de Pistões: ").append(this.getMotor().getQtdPist()).append("\n");
    builder.append("Potência: ").append(this.getMotor().getPotencia()).append(" cv").append("\n");
    builder.append("Quantidade de Passageiros: ").append(this.getQtdPassageiros()).append("\n");
    builder.append("------------------------------------------------");
    return builder.toString();
  }

}