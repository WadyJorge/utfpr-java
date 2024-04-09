public class Teste{

	public static void main(String[] args){
		Pai p = new Pai();

		p.nome = "Peter Parker";
		p.idade = 18;
		p.salario = 1240.00;

		p.cadPai("Barry Allen", 25, 1240);
		p.calcSalario();
		p.impPai();
	
	}
}