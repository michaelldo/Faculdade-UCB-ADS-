import java.util.Scanner;

@SuppressWarnings("all")
public class Leitor {
	
	public static int lerInt(String msg) {
		System.out.println(msg);
		return lerInt();
	}
	
	public static int lerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static char lerCaracter(String msg){
		System.out.println(msg);
		return lerCaracter();
	}
	
	public static char lerCaracter(){
		return new Scanner(System.in).next().charAt(0);
	}
	
	public static double lerDouble(String msg){
		System.out.println(msg);
		return lerDouble();
	}
	
	public static double lerDouble(){
		return new Scanner(System.in).nextDouble();
	}
}
