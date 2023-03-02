package br.com.descomplica.live03;

public class TesteCliente {

	public static void main(String[] args) {
		//instanciar cliente:
		Cliente cliente = new Cliente();
		cliente.setNome("Maria de Souza");
		cliente.setIdade(23);
		cliente.setCodigo(1);
		cliente.setCpf("003343345-44");
		System.out.println("Código: " + cliente.getCodigo());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Maior de idade? " + (cliente.verificaIdade()?"Sim" : "Não"));

	}

}
