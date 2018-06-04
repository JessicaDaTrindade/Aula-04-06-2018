package exemplo02;

public class Notas {
	
	//Atributos
	private double nota1, nota2, nota3;
	
	//Construtor
	public Notas(double nota1, double nota2, double nota3) {
		
		//Inicializar valores dos atributos da classe
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;		
	}
	
	//Método para retornar a media
	protected double media() {
		
		double media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	
}

