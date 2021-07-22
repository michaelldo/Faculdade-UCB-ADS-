import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		double num = lerDouble("Informe um salário","Ops! Valor invalido!", 0, 1000);
		System.out.println("O valor lido foi: "+num);
		
		
		double nota = lerDouble("Informe a nota: ", "Nota inválida!", 0, 10);
		System.out.println("A nota informada foi: "+ nota);
		
	}
	
	
	
	//metodos
	
	public static double lerDouble(String mensagem, String msgErro, double min, double max) {
		double retorno;
		do {
			retorno = lerDouble(mensagem);
			if(retorno < min || retorno > max) {
				System.out.println(msgErro);
			}
		}while(retorno < 0 || retorno > max);
		
		return retorno;
	}
	
	public static double lerDouble(String mensagem) {
		System.out.println(mensagem);
		return lerDoube();
	}
	
	public static double lerDoube() {
		return new Scanner(System.in).nextDouble();
	}
}
