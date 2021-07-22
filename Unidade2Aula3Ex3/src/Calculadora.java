/*
 * Sintese
 * Objetivo: Criar uma calculadora que efetue as seguintes operação: Adição, subtração, divisão, multiplicação e expoente
 * Entrada: Dois valores e um operador.
 * Saída: O resultado da operação
 */

public class Calculadora {
	
	
	public static void main(String[] args){
		
		double valor1 = Leitor.lerDouble("Informe o primeiro valor: ");	
		char operador = Leitor.lerCaracter("Informe o operador: ");	
		double valor2 = Leitor.lerDouble("Informe o segundo valor: ");	
		double resultado = Matematica.calcular(valor1, operador, valor2);
		Impressora.printPane(valor1, operador, valor2, resultado);
	}
}
