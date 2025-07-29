public class Teste {

    public static void main(String[] args) {
        Veiculo veiculo01 = new Veiculo("JKL-1213", "Honda", "Civic", "Branco", 180, 4, 4, 128);
        Veiculo veiculo02 = new Veiculo("ABC-1234", "Chevrolet", "Onix", "Preto", 170, 4, 4, 116);
        Veiculo veiculo03 = new Veiculo("GHI-9101", "Volkswagen", "Gol", "Prata", 160, 4, 3, 100);
        Veiculo veiculo04 = new Veiculo("DEF-5678", "Hyundai", "Creta", "Vermelho", 200, 4, 4, 150);
        Veiculo veiculo05 = new Veiculo("MNO-1415", "Toyota", "Corolla", "Azul", 190, 4, 4, 140);

        System.out.println(veiculo01.toString());
        System.out.println(veiculo02.toString());
        System.out.println(veiculo03.toString());
        System.out.println(veiculo04.toString());
        System.out.println(veiculo05.toString());
    }
    
}