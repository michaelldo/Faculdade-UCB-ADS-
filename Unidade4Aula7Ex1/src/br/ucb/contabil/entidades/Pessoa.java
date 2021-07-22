package br.ucb.contabil.entidades;

public class Pessoa {
	private String nome;
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getImposto() {
		return 0;
	}
	
}
