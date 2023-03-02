package br.com.descomplica.live03;

public abstract class Pessoa {
	//atributos:
	private String nome; 
	private int idade;
	//o private é um modificador de acesso, quando eu uso o private
	//eu faço um encapsulamento dos atributos da classe Pessoa
	

	//métodos:
	public boolean verificaIdade() {
		if (idade>=18)
			return true;
		else
			return false;
	}

	
	//método abstrato
	public abstract void mostraLocalizacao();//método abstrato não tem chaves tem que ser ponto e vírgula
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;//o this se refere ao atributo da classe
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
