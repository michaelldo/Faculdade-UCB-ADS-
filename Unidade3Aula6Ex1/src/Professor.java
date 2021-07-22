
public class Professor {
	private String nome;
	private String titulacao;
	private double salario;
	private String matricula;
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor) {// é um
			Professor temp = (Professor) obj;
			if(getMatricula().equalsIgnoreCase(temp.getMatricula())) {
				return true;
			}else
				return false;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "\nNome: "+getNome()+"\tTitulação: "+getTitulacao()+"\tSalario: "+getSalario()+"\tMatricula: "+getMatricula();
	}
	
	public Professor() {
	}
	
	public Professor(String nome, String titulacao, double salario, String matricula) {
		setNome(nome);
		setTitulacao(titulacao);
		setSalario(salario);
		setMatricula(matricula);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
