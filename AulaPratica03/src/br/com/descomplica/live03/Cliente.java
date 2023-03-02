package br.com.descomplica.live03;

public class Cliente extends Pessoa implements Validacao {
	private int codigo;
	private String cpf;
	private String endereco;
	
	
	//getters e setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (!validaCpf(cpf))
			System.out.println("CPF inválido");
		else
		this.cpf = cpf;
	}
	
	
	@Override
	public void mostraLocalizacao() {
		System.out.println("Endereço: " + endereco);
		
		
		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public boolean validaCpf(String cpf) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
