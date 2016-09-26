package exercicio_230;

import javax.swing.JOptionPane;

public class SeparandoDigitos {

	public static void main(String[] args) {
		String espaco = "   ";
		
		String primeiroNum = JOptionPane.showInputDialog("Digite o primeiro número");
		int num1 = Integer.parseInt(primeiroNum);
		String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número");
		int num2 = Integer.parseInt(segundoNumero);
		String terceiroNum = JOptionPane.showInputDialog("Digite o terceiro número");
		int num3 = Integer.parseInt(terceiroNum);
		String quartoNum = JOptionPane.showInputDialog("Digite o quarto número");
		int num4 = Integer.parseInt(quartoNum);
		String quintoNum = JOptionPane.showInputDialog("Digite o quinto número");
		int num5 = Integer.parseInt(quintoNum);
		
		for(int i = 0; i < espaco.length(); i++) {
			
		}
		JOptionPane.showMessageDialog(null, num1+espaco+num2+espaco+num3+espaco+num4+espaco+num5);
		
	}

}