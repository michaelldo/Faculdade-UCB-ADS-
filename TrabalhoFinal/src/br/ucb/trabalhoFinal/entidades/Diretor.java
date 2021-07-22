package br.ucb.trabalhoFinal.entidades;
public class Diretor extends Funcionario {
	private String tempoCasa;
	
	
	@Override
	public String toString() {
		return super.toString()+ "\tTempo de Casa: "+getTempoCasa();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public double getImpostoDeRenda() {
		return getSalario()*0.23;
	}
	
	public String getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(String tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	
	
}
