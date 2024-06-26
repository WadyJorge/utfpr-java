// @author Wady Jorge Souza Beliche
public class TstConta {
    
    public static void main(String[] args) {
        
        PessoaJuridica empresa = new PessoaJuridica();
        
        // Entrada de dados
        try {
            empresa.setNumeroConta(22);
        } catch (NumException e) {
            e.impMsg();
        }
        
        empresa.getEnder().setRua("Rua Salgado Filho");
        empresa.setCnpj(17);
        empresa.getResponsavel().setCpf(18);
        empresa.getResponsavel().setNome("Wady Jorge");
        
        // Saída de dados
        System.out.println("===== Pessoa Jurídica ====="); 
        System.out.println("Número da Conta: " + empresa.getNumeroConta());
        new TstConta().validar(empresa.getNumeroConta());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("Rua: " + empresa.getEnder().getRua());
        System.out.println("\n====== Pessoa Física ======"); 
        System.out.println("CPF do Responsável: " + empresa.getResponsavel().getCpf());
        empresa.getResponsavel().verifDoc();
        System.out.println("Nome do Responsável: " + empresa.getResponsavel().getNome());
        empresa.verifDoc();
    }
    
    public void validar(int numeroConta) {
        if (numeroConta % 2 == 0) {
            System.out.println("Número da conta é par");
        } else {
            System.out.println("Número da conta é ímpar");
        }
    }
}