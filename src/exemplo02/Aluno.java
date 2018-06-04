package exemplo02;

import javax.swing.JOptionPane;

public class Aluno extends Notas {
	
	//Atributos
	private String nome, materia;
	
	//Construtor
	public Aluno(String nome, String materia, double nota1, double nota2, double nota3) {
				
		//Chamar o construtor da classe notas
		super(nota1, nota2, nota3);
		
		//Atribui os valores aos atributos da classe Aluno
		this.nome = nome;
		this.materia = materia;
		
		//Chamar o m�todo de mensagem
		mensagem();
	}
	
	//M�todo para exibir uma mensagem
	private void mensagem() {
		
		String  mensagem = "Aluno: "+nome;
				mensagem+= "\nMat�ria: "+materia;
				mensagem+= "\nM�dia: "+media();
				
				JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
