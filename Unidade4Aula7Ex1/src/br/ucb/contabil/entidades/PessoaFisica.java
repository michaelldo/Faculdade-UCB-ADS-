package br.ucb.contabil.entidades;

public class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double getImposto() {
		return getSalario()*0.1;
	}
}
