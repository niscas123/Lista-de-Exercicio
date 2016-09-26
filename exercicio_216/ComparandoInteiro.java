package exercicio_216;

import javax.swing.JOptionPane;

public class ComparandoInteiro {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
		
		if(num1 > num2) {
			JOptionPane.showMessageDialog(null, +num1+" > "+num2+", is larger "+num1);
		}else if(num1 == num2) {
			JOptionPane.showMessageDialog(null, num1+" == "+num2+", These numbers are qual");
		}else if(num1 < num2) {
			JOptionPane.showMessageDialog(null, num1+" < "+num2+", is larger "+num2);
		}

	}

}