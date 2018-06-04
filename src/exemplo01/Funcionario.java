package exemplo01;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	//Atributos
	private String cargo;
	private double salario;
	
	//M�todo Construtor
	public Funcionario(String nome, int idade, String cargo, double salario) {
		
		//Adicionar valores aos atributos de cada classe
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		
		//Chamando m�todo mensagem
		mensagem();
		
	}
	
	//M�todo para retornar uma menssagem
	private void mensagem() {
		
		String  mensagem = "Nome: "+nome;
				mensagem+= "\nIdade: "+idade;
				mensagem+= "\nCondi��o idade: "+condicaoIdade();
				mensagem+= "\nCargo: "+cargo;
				mensagem+= "\nSal�rio: "+salario;
				
				JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
