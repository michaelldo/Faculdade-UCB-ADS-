import java.util.Calendar;

public class Administrativo extends Funcionario {
	private int dependentes;
	private Calendar dtAdimissao;

	/**
	 * Metodo para ver a quantidade de dias por milissegundos
	 * @return Data por  Admissõa
	 */
	public int getDiasTrabalhados() {
		Calendar dtAtual = Calendar.getInstance();
		int MILLIS_IN_DAY = 86400000;//MILISSEGUNDOS EM DIA
		return (int) ((dtAtual.getTimeInMillis() - getDtAdimissao().getTimeInMillis()) / MILLIS_IN_DAY);
	}
	
	@Override
	public double getGratificao() {
		return getDiasTrabalhados() *0.30;
	}
	public double getContribuicaoSindical() {
		return getSalario() * 0.01;
	}
	
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public Calendar getDtAdimissao() {
		return dtAdimissao;
	}
	public void setDtAdimissao(Calendar dtAdimissao) {
		this.dtAdimissao = dtAdimissao;
	}
	
	
}
