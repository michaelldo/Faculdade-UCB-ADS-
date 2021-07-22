/**
 * Crie uma classe pessoa com nome, código inteiro e salário e classe social.
 * Classe Pessoa
 * @author mic_o
 *
 */
public class Pessoa {
	private String nome;
	private int codigo;
	private double salario;
	
/**
 * 	
 * @param nome
 * @param codigo
 * @param salario
 */
	public Pessoa(String nome, int codigo, double salario) {
			setNome(nome);
			setCodigo(codigo);
			setSalario(salario);		
		}
/**
 * 	metodo para verificar a classe social.
 * @return retorna a classe social do usuária baseado no salário
 */
	public String classeSocial() {
		if(getSalario() < 950) {
			return "Classe social: F";
		}else if(getSalario() < 1400){
			return "classe social: E";
		}else if(getSalario() < 2300) {
			return "classe social: D";
		}else if(getSalario() < 4600) {
			return "classe social: C";
		}else if(getSalario() < 8100) {
			return "classe social: B";
		}else if(getSalario() <= 14400) {
			return "classe social: A2";
		}else {
			return "classe social: A1";
		}
	}
/**
 * 
 * @return Menssagem de texto para usuári@
 */
	public String toString() {
		return "Nome: "+getNome()+"\tCodigo: "+getCodigo()+"\tSalário: "+getSalario()+"\t"+classeSocial();
	}
	
/**
 * gets e sets da classe pessoa
 * @return os gets e os sets dos atributos
 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
