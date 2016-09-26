package exercicio_225;

import javax.swing.JOptionPane;

public class ImparPar {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		
		if(num1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, num1+" é um número par");
			
		} else {
			JOptionPane.showMessageDialog(null, num1+" é um número impar");
			
		}
		
	}
		
}
	
