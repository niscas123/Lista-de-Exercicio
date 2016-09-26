package exercicio_224;

import javax.swing.JOptionPane;

public class Comparando {

	public static void main(String[] args) {
		int maior = 0, menor = 999;
		
		for(int i = 0; i < 5; i++) {
			String numero = JOptionPane.showInputDialog("Digite o número");
			int num = Integer.parseInt(numero);
			if(num > 0) {
				maior = num;
				
			} else if(num < 0) {
				menor = num;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "O maior número é "+maior+"\nO menor número é "+menor);

	}

}