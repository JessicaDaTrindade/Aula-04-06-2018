package exemplo01;

public class Pessoa {
	
	//protected - só irá aparecer em uma classe pessoa ou na classe que extende
	
	//Atributos
	protected String nome;
	protected int idade;
	
	//Método para retornar se é maior de idade ou não
	protected String condicaoIdade() {
		String condicao = idade >= 18 ? "Maior de idade" : "Menor de idade";
		return condicao;
	}
	
	

}
