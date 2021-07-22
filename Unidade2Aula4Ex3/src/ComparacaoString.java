import java.util.Scanner;

public class ComparacaoString {
	public static void main(String[] args) {
		//String a = "Java";
		System.out.println("Informe a primeira String: ");
		String a = new Scanner(System.in).nextLine();
		
		//String b = ".Net";
		
		System.out.println("Informe a segunda String: ");
		String b = new Scanner(System.in).nextLine();
		
		String upper = a.toUpperCase();
		System.out.println(a);
		System.out.println(upper);
		
		if(a.equals(b)) { //essa é a forma errada de se comparar uma string
			System.out.println("As strings são iguais");
		}else {
			System.out.println("As Strings são diferentes");
		}
	}
}
