/*
 * sintese
 * Entrada
 * Sa�da
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
			
			// estrutura de repeti��o n�o haver problema com notas invalidas. estrutura faca/Enquanto.
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
			
			
			//calculo da m�dia.
			media =  (nota1 + nota2)/2;
			
			
			//Sa�da de dados.
			if(media >= 7.0) {
				System.out.println("O Estudante "+nome+" est� aprovado com m�dia: "+ media);
			}else {
				System.out.println("O Estudante "+nome+" est� reprovado com m�dia: "+ media);
			}
			
			System.out.println("Deseja continua? s - sim e n - n�o");
			opcao = new Scanner(System.in).next().charAt(0);
			
		}while(opcao == 'S' || opcao == 's');
	
	}
}
