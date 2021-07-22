/*
 * Receba do usuário os dados de uma pessoa e apresente todas as informações da pessoa, 
 * inclusive a classe por meio do método toString. Atenção! O método toString não deve fazer 
 * o cálculo de classe da pessoa.
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
