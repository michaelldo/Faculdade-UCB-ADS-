
public class Programa {
	public static void main(String[] args) {
		Aluno a =  new Aluno();
		
		a.nome = "Michael";
		a.nota1 = 10;
		a.nota2 = 6;
		
		
		System.out.println(a.getMedia());
		System.out.println(a.isAprovado());
	}
}
