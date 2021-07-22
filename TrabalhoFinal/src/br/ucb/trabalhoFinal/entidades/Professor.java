package br.ucb.trabalhoFinal.entidades;
/**
 * 
 * @author mic_o
 *
 */
public class Professor extends Funcionario {
	private String anoAdmissao;

	@Override
	public String toString() {
		return super.toString()+"\tAno de Admissão: "+getAnoAdmissao();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public double getImpostoDeRenda() {
		return getSalario()*0.20;
	}
	
	public String getAnoAdmissao() {
		return anoAdmissao;
	}

	public void setAnoAdmissao(String anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
}
