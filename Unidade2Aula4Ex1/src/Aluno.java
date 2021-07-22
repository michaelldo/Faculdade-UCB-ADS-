
public class Aluno {
	
	//Caracteristicas
	String nome;
	double nota1;
	double nota2;
	
	//Ações
	public double getMedia() {
		return (nota1+nota2)/2;
	}
	
	public boolean isAprovado() {
		return getMedia() > 7.0; //return true or false
	}
}
