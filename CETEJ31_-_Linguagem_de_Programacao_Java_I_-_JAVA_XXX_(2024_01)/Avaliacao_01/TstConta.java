package com.wadyjorge.avaliacao_01;

// @author Wady Jorge Souza Beliche
public class TstConta implements Verifica {
    
    public static void main(String[] args) {
        
        PessoaFisica responsavel = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
        Endereco endereco = new Endereco();
        
        // Entrada de dados
        try {
            empresa.setNumeroConta(22);
        } catch (NumException e) {
            e.impMsg();
        }
        
        empresa.setCnpj(123456);
        endereco.setRua("Rua Salgado Filho");
        responsavel.setCpf(17);
        responsavel.setNome("Wady Jorge");
        empresa.setResponsavel(responsavel);
        empresa.setEnder(endereco);
        
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
    
    @Override
    public void validar() {
    }
    
    public void validar(int numeroConta) {
        if (numeroConta % 2 == 0) {
            System.out.println("Número da conta é par");
        } else {
            System.out.println("Número da conta é ímpar");
        }
    }
}