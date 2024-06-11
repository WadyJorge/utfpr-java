public class VeicExistException extends Exception {

    public VeicExistException(){
        super("========================= ATENÇÃO! ========================= \n Já existe um veículo cadastrado com esta placa!");
    }

}