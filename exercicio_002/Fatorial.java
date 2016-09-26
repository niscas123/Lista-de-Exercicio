package exercicio_002;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fatoriar"));
		
		for(int i = 2; i <= valor; i++) {
			fatorial *= i;
		}
		JOptionPane.showMessageDialog(null, valor+"! = "+fatorial);

	}

}
