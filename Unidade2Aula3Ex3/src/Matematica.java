
public class Matematica {
	
	public static double calcular(double valor1, char operador, double valor2) {
		double resultado;
		switch(operador) {
		case '+': resultado = Matematica.somar(valor1, valor2);
			break;
		case '-': resultado = Matematica.subtrair(valor1, valor2);
			break;
		case '*': resultado = Matematica.multiplicar(valor1, valor2);
			break;
		case '/': resultado = Matematica.dividir(valor1, valor2);
			break;
		case 'e': resultado = Matematica.expoente(valor1, valor2);
			break;
		default: resultado = -1;
			break;
		}
		return resultado;
	}
	
	public static double expoente(double base, double expoenteFlutuante) {
		int expoente = (int)expoenteFlutuante; //casting
		double resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		
		return resultado;
	}
	
	public static double dividir(double valor1, double valor2) {
		if(valor2 == 0)
			return -1;
		return valor1 / valor2;
	}
	
	public static double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public static double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public static double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
}
