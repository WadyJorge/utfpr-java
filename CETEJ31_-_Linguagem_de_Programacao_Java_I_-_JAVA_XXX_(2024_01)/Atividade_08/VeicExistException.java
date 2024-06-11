public class VeicExistException extends Exception {

    public String mensagemErro() {
		return "ATENÇÃO: Já existe um veículo cadastrado com esta placa!";
	}
    
}