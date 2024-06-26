// @author Wady Jorge Souza Beliche
public abstract class ClienteBanco {
    
    private int numeroConta = 0;
    private String nome = " ";
    Endereco ender = new Endereco();
    
    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta < 0) {
            throw new NumException();
        }
        this.numeroConta = numeroConta;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) { 
        this.nome = nome;
    }
    
    public Endereco getEnder() {
        return ender;
    }
    
    public void setEnder(Endereco ender) {
        this.ender = ender;
    }
    
    public abstract void verifDoc();
}
