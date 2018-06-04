package exemplo01;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	
	//Atributos
	private String cargo;
	private double salario;
	
	//Método Construtor
	public Funcionario(String nome, int idade, String cargo, double salario) {
		
		//Adicionar valores aos atributos de cada classe
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		
		//Chamando método mensagem
		mensagem();
		
	}
	
	//Método para retornar uma menssagem
	private void mensagem() {
		
		String  mensagem = "Nome: "+nome;
				mensagem+= "\nIdade: "+idade;
				mensagem+= "\nCondição idade: "+condicaoIdade();
				mensagem+= "\nCargo: "+cargo;
				mensagem+= "\nSalário: "+salario;
				
				JOptionPane.showMessageDialog(null, mensagem);
		
	}

}
