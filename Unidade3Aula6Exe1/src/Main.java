/*
 * Receba do usu�rio os dados de uma pessoa e apresente todas as informa��es da pessoa, 
 * inclusive a classe por meio do m�todo toString. Aten��o! O m�todo toString n�o deve fazer 
 * o c�lculo de classe da pessoa.
 */
public class Main {
/**
 * Classe main
 * @param args
 */
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Fulando 1", 1, 14401.00);
		
		System.out.println(p.toString());
				
	}
}
