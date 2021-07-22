package br.ucb.trabalhoFinal.entidades;

public class Funcionario {
	private String nome;
	private int matricula;
	private String cpf;
	private double salario;
	private String funcao;	

	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\tMatricula: "+getMatricula()+"\tCPF: "+getCpf()+"\tSalario: "+getSalario()+"\tFuncao: "+getFuncao();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor) {
			Professor temp = (Professor) obj;
			if(getCpf().equalsIgnoreCase(temp.getCpf())) {
				return true;
			}else {
				return false;
			}
		}else if(obj instanceof Diretor) {
			Diretor temp = (Diretor) obj;
			if(getCpf().equalsIgnoreCase(temp.getCpf())) {
				return true;
			}else {
				return false;
			}
		}
		return super.equals(obj);
	}
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, int matricula, String cpf, double salario, String funcao) {
		setNome(nome);
		setMatricula(matricula);
		setCpf(cpf);
		setSalario(salario);
		setFuncao(funcao);
	}

	public double getImpostoDeRenda() {
		return 0;
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
