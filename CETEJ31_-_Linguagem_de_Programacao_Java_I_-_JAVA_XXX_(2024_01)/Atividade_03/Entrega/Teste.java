public class Teste {

    public static void main(String[] args) {
        Passeio veiculoPasseio01 = new Passeio();
        Passeio veiculoPasseio02 = new Passeio();
        Passeio veiculoPasseio03 = new Passeio();
        Passeio veiculoPasseio04 = new Passeio();
        Passeio veiculoPasseio05 = new Passeio();

        veiculoPasseio01.setPlaca("ABC-1213");
        veiculoPasseio01.setMarca("Honda");
        veiculoPasseio01.setModelo("Civic");
        veiculoPasseio01.setCor("Branco");
        veiculoPasseio01.setVelocMax(180);
        veiculoPasseio01.setQtdRodas(4);
        veiculoPasseio01.getMotor().setQtdPist(4);
        veiculoPasseio01.getMotor().setPotencia(128);
        veiculoPasseio01.setQtdPassageiros(5);

        veiculoPasseio02.setPlaca("DEF-1234");
        veiculoPasseio02.setMarca("Chevrolet");
        veiculoPasseio02.setModelo("Onix");
        veiculoPasseio02.setCor("Preto");
        veiculoPasseio02.setVelocMax(170);
        veiculoPasseio02.setQtdRodas(4);
        veiculoPasseio02.getMotor().setQtdPist(4);
        veiculoPasseio02.getMotor().setPotencia(116);
        veiculoPasseio02.setQtdPassageiros(5);

        veiculoPasseio03.setPlaca("GHI-9101");
        veiculoPasseio03.setMarca("Volkswagen");
        veiculoPasseio03.setModelo("Gol");
        veiculoPasseio03.setCor("Prata");
        veiculoPasseio03.setVelocMax(160);
        veiculoPasseio03.setQtdRodas(4);
        veiculoPasseio03.getMotor().setQtdPist(3);
        veiculoPasseio03.getMotor().setPotencia(100);
        veiculoPasseio03.setQtdPassageiros(5);

        veiculoPasseio04.setPlaca("JKL-5678");
        veiculoPasseio04.setMarca("Hyundai");
        veiculoPasseio04.setModelo("Creta");
        veiculoPasseio04.setCor("Vermelho");
        veiculoPasseio04.setVelocMax(200);
        veiculoPasseio04.setQtdRodas(4);
        veiculoPasseio04.getMotor().setQtdPist(4);
        veiculoPasseio04.getMotor().setPotencia(150);
        veiculoPasseio04.setQtdPassageiros(5);

        veiculoPasseio05.setPlaca("MNO-1415");
        veiculoPasseio05.setMarca("Toyota");
        veiculoPasseio05.setModelo("Corolla");
        veiculoPasseio05.setCor("Azul");
        veiculoPasseio05.setVelocMax(190);
        veiculoPasseio05.setQtdRodas(4);
        veiculoPasseio05.getMotor().setQtdPist(4);
        veiculoPasseio05.getMotor().setPotencia(140);
        veiculoPasseio05.setQtdPassageiros(5);

        System.out.println(veiculoPasseio01.toString());
        System.out.println(veiculoPasseio02.toString());
        System.out.println(veiculoPasseio03.toString());
        System.out.println(veiculoPasseio04.toString());
        System.out.println(veiculoPasseio05.toString());

        Carga veiculoCarga01 = new Carga();
        Carga veiculoCarga02 = new Carga();
        Carga veiculoCarga03 = new Carga();
        Carga veiculoCarga04 = new Carga();
        Carga veiculoCarga05 = new Carga();

        veiculoCarga01.setPlaca("ABC-1313");
        veiculoCarga01.setMarca("Chevrolet");
        veiculoCarga01.setModelo("S10");
        veiculoCarga01.setCor("Branco");
        veiculoCarga01.setVelocMax(180);
        veiculoCarga01.setQtdRodas(4);
        veiculoCarga01.getMotor().setQtdPist(8);
        veiculoCarga01.getMotor().setPotencia(200);
        veiculoCarga01.setCargaMax(1061);
        veiculoCarga01.setTara(2750);

        veiculoCarga02.setPlaca("DEF-3456");
        veiculoCarga02.setMarca("Mercedes-Benz");
        veiculoCarga02.setModelo("Actros");
        veiculoCarga02.setCor("Prata");
        veiculoCarga02.setVelocMax(180);
        veiculoCarga02.setQtdRodas(6);
        veiculoCarga02.getMotor().setQtdPist(8);
        veiculoCarga02.getMotor().setPotencia(450);
        veiculoCarga02.setCargaMax(28000);
        veiculoCarga02.setTara(9200);

        veiculoCarga03.setPlaca("GHI-4567");
        veiculoCarga03.setMarca("Scania");
        veiculoCarga03.setModelo("R 450");
        veiculoCarga03.setCor("Azul");
        veiculoCarga03.setVelocMax(170);
        veiculoCarga03.setQtdRodas(6);
        veiculoCarga03.getMotor().setQtdPist(8);
        veiculoCarga03.getMotor().setPotencia(450);
        veiculoCarga03.setCargaMax(27000);
        veiculoCarga03.setTara(8900);

        veiculoCarga04.setPlaca("JKL-5693");
        veiculoCarga04.setMarca("Iveco");
        veiculoCarga04.setModelo("Stralis");
        veiculoCarga04.setCor("Vermelho");
        veiculoCarga04.setVelocMax(160);
        veiculoCarga04.setQtdRodas(6);
        veiculoCarga04.getMotor().setQtdPist(6);
        veiculoCarga04.getMotor().setPotencia(420);
        veiculoCarga04.setCargaMax(26000);
        veiculoCarga04.setTara(8800);

        veiculoCarga05.setPlaca("JKL-5693");
        veiculoCarga05.setMarca("MAN");
        veiculoCarga05.setModelo("TGX");
        veiculoCarga05.setCor("Branco");
        veiculoCarga05.setVelocMax(175);
        veiculoCarga05.setQtdRodas(6);
        veiculoCarga05.getMotor().setQtdPist(8);
        veiculoCarga05.getMotor().setPotencia(460);
        veiculoCarga05.setCargaMax(29000);
        veiculoCarga05.setTara(9300);

        System.out.println(veiculoCarga01.toString());
        System.out.println(veiculoCarga02.toString());
        System.out.println(veiculoCarga03.toString());
        System.out.println(veiculoCarga04.toString());
        System.out.println(veiculoCarga05.toString());
    }

}