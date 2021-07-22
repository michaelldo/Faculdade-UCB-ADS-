/*
 * sintese
 * Entrada
 * Saída
 * Objetivo
 */

import java.util.Scanner;

@SuppressWarnings("all")
public class Programa {
	public static void main(String args[]) {
		char opcao ='N';
		do {
		
			double nota1, nota2, media;
			
					
			System.out.println("Informe o seu nome");
			String nome = new Scanner(System.in).nextLine();
			
			// estrutura de repetição não haver problema com notas invalidas. estrutura faca/Enquanto.
			do {
				
				System.out.println("Informa a nota 1");
				nota1 = new Scanner(System.in).nextDouble();
				
				if(nota1 < 0 || nota1 > 10) {
					System.out.println("Por favor digite um valor de 0 ate 10");
				}
				
			}while(nota1 < 0 || nota1 > 10);
			
			
			do {
				
				System.out.println("Informa a nota 1");
				nota2 = new Scanner(System.in).nextDouble();
				
				if(nota2 < 0 || nota2 > 10) {
					System.out.println("Por favor digite um valor de 0 ate 10");
				}
				
			}while(nota2 < 0 || nota2 > 10);
			
			
			//calculo da média.
			media =  (nota1 + nota2)/2;
			
			
			//Saída de dados.
			if(media >= 7.0) {
				System.out.println("O Estudante "+nome+" está aprovado com média: "+ media);
			}else {
				System.out.println("O Estudante "+nome+" está reprovado com média: "+ media);
			}
			
			System.out.println("Deseja continua? s - sim e n - não");
			opcao = new Scanner(System.in).next().charAt(0);
			
		}while(opcao == 'S' || opcao == 's');
	
	}
}
