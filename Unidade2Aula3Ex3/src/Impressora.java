import javax.swing.JOptionPane;

public class Impressora {
	public static void print(double valor1, char operador, double valor2, double resultado) {
		System.out.println("["+valor1+"] "+operador+" ["+valor2+"] = "+resultado);
	}
	
	public static void printPane(double valor1, char operador, double valor2, double resultado) {
		JOptionPane.showMessageDialog(null, "["+valor1+"] "+operador+" ["+valor2+"] = "+resultado);
	}
}
