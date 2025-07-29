public class TesteWrappers {

    public static void main(String[] args) {

        // Exemplo de uso da classe Integer
        Integer quantidadeProdutos = 50;
        Integer quantidadeVendida = 20;
        Integer estoqueRestante = quantidadeProdutos - quantidadeVendida;
        System.out.println("Estoque restante: " + estoqueRestante);

        // Exemplo de uso da classe Boolean
        Boolean temEstoque = estoqueRestante > 0;
        System.out.println("Tem estoque disponível? " + temEstoque);

        // Exemplo de uso da classe Character
        Character letra = 'A';
        System.out.println("Letra: " + letra);

        // Exemplo de uso da classe Double
        Double precoProduto = 99.99;
        Double desconto = 0.15;
        Double precoComDesconto = precoProduto * (1 - desconto);
        System.out.println("Preço com desconto: " + precoComDesconto);

        // Exemplo de uso da classe Byte
        Byte byteValor = 100;
        System.out.println("Valor em byte: " + byteValor);
        
        // Exemplo de uso da classe Long
        Long distancia = 1000000L;
        System.out.println("Distância: " + distancia);
    }

}