
public class Professor extends Funcionario {
	private String titulacao;
	
	public double getImpostoDeRenda() {
		return getSalario()*0.2;
	}
	
	public double getGratificao() {
		if(getTitulacao().equalsIgnoreCase("ESPECIALISTA")) 
			return getSalario() * 0.1;
		else if(getTitulacao().equalsIgnoreCase("MESTRE"))
			return getSalario() * 0.12;
		else if(getTitulacao().equalsIgnoreCase("DOUTOR"))
			return getSalario() * 0.15;
		else
			return 0;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
}
