package exercicio_232;

import javax.swing.JOptionPane;

public class Valores {

	public static void main(String[] args) { 
		int maior = 0, igual = 0, menor = 0;
		
		for(int i = 0; i < 5; i++) {
			String numero = JOptionPane.showInputDialog("Digite o n�mero");
			int num = Integer.parseInt(numero);
			if(num > 0) {
				maior++;
			} else if(num == 0) {
				igual++;
			} else if(num < 0) {
				menor++;
			}

		}
		JOptionPane.showMessageDialog(null, maior+" n�mero maior que 0\n"+igual+" n�mero igual a 0\n"+menor+" n�mero menor que 0");		
	}
	
}