package exemplo01;

public class Pessoa {
	
	//protected - s� ir� aparecer em uma classe pessoa ou na classe que extende
	
	//Atributos
	protected String nome;
	protected int idade;
	
	//M�todo para retornar se � maior de idade ou n�o
	protected String condicaoIdade() {
		String condicao = idade >= 18 ? "Maior de idade" : "Menor de idade";
		return condicao;
	}
	
	

}
