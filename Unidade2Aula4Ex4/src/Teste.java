
public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Michael", "123");// inicializar os atribuitos na contrução do objeto pessoa
		
		Pessoa p2 = new Pessoa();
		
		System.out.println(p2.getNome());
		System.out.println(p.getNome());
	}

}
