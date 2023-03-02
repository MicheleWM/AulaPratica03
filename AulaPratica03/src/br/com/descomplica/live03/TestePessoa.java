package br.com.descomplica.live03;

public class TestePessoa { //Essa é a classe principal

	public static void main(String[] args) {
		//instanciando a classe Pessoa:
		Pessoa pessoa = new Cliente();
		pessoa.setNome("João da Silva");
		pessoa.setIdade(16);
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
//		System.out.println("Maior de idade? " + pessoa.verificaIdade());
		System.out.println("Maior de idade? " + (pessoa.verificaIdade()?"Sim" : "Não"));//usando operador ternário
		

	}

}
