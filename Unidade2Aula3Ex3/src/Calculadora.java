/*
 * Sintese
 * Objetivo: Criar uma calculadora que efetue as seguintes opera��o: Adi��o, subtra��o, divis�o, multiplica��o e expoente
 * Entrada: Dois valores e um operador.
 * Sa�da: O resultado da opera��o
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
