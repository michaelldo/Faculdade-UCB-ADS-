import java.util.Scanner;

/*
 * Sintese
 * Entrada
 * Sa�da 
 * Objetivo
 */

@SuppressWarnings("all")

public class Programa {
	public static void main(String args[]) {
		int [] nums = new int[5]; // inicializa��o
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Informe o "+(i+1)+" valor");
			nums[i] = new Scanner(System.in).nextInt();
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.println();
		}
	}
}
