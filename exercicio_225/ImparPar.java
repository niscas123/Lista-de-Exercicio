package exercicio_225;

import javax.swing.JOptionPane;

public class ImparPar {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		
		if(num1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, num1+" � um n�mero par");
			
		} else {
			JOptionPane.showMessageDialog(null, num1+" � um n�mero impar");
			
		}
		
	}
		
}
	
