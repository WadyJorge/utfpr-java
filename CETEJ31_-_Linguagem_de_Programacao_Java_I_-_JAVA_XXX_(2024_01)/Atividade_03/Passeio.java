public final class Passeio extends Veiculo {

  private int qtdPassageiros;

  // Construtor padrão (sem parâmetros)
  public Passeio() {
    this.qtdPassageiros = 0;
  }

  // Construtor recebendo parâmetros
  public Passeio(int qtdPassageiros) {
    this.qtdPassageiros = qtdPassageiros;
  }

  // Getters e Setters
  public int getQtdPassageiros() {
    return this.qtdPassageiros;
  }

  public void setQtdPassageiros(int qtdPassageiros) {
    this.qtdPassageiros = qtdPassageiros;
  }

  /// Método usado no cálculo de velocidade da subclasse Passeio
  public float calcVel(float velocMax) {
    float velocidade = (velocMax * 1000);
    return velocidade;
  }

  // Sobrecarga do método toString para imprimir o objeto Veiculo Passeio
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("--------------- VEÍCULO PASSEIO: ---------------\n");
    builder.append("Placa: ").append(this.getPlaca()).append("\n");
    builder.append("Marca: ").append(this.getMarca()).append("\n");
    builder.append("Modelo: ").append(this.getModelo()).append("\n");
    builder.append("Cor: ").append(this.getCor()).append("\n");
    builder.append("Velocidade Máx: ").append(String.format("%.3f", this.calcVel(this.getVelocMax()))).append(" m/h").append("\n");
    builder.append("Quantidade de Rodas: ").append(this.getQtdRodas()).append("\n");
    builder.append("Quantidade de Pistões: ").append(this.getMotor().getQtdPist()).append("\n");
    builder.append("Potência: ").append(this.getMotor().getPotencia()).append(" cv").append("\n");
    builder.append("Quantidade de Passageiros: ").append(this.getQtdPassageiros()).append("\n");
    builder.append("------------------------------------------------");
    return builder.toString();
  }

}