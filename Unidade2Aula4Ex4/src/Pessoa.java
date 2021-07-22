
public class Pessoa {
	private String nome;
	private String cpf;
	
/*	public Pessoa() {
		System.out.println("Criando um objeto pessoa...");
		
	}
*/	
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
		
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
