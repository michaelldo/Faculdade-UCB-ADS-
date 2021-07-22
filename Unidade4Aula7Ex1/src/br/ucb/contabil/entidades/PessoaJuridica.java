package br.ucb.contabil.entidades;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private double lucroBruto;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public double getLucroBruto() {
		return lucroBruto;
	}
	public void setLucroBruto(double lucroBruto) {
		this.lucroBruto = lucroBruto;
	}
	
	@Override
	public double getImposto() {
		return getLucroBruto()*0.13;
	}
	
}
