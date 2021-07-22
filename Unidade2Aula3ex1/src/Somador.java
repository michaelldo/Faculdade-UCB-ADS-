import java.util.Scanner;

public class Somador {
	public static void main(String[] args) {
		
		double valor1 = 10;
		double valor2 = 4.0;
		double retorno = somar(valor1, valor2);
		
		System.out.println("O valor retornado pelo metodo é: "+ retorno);
	}
	
	
	/*
	 * Objetivo do metodo: receber dois valores
	 * retorno: a soma dos dois valores
	 */
	public static double somar(double paramUm, double paramDois) {
		return paramUm + paramDois;
	}
}
