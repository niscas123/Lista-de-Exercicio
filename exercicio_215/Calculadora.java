package exercicio_215;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE \n'1' para Soma; \n'2' para Subtração; \n'3' para Divisão; \n'4' para Multiplicação.", "CALCULADORA", JOptionPane.PLAIN_MESSAGE));
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número"));

		while(opcao != 0) {
			if(opcao == 1) {
				JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+Operador.soma(num1,num2));
				break;
			}else if(opcao == 2) {
				JOptionPane.showMessageDialog(null, num1+" - "+num2+" = "+Operador.subtracao(num1,num2));
				break;
			}else if(opcao == 3) {
				JOptionPane.showMessageDialog(null, num1+" / "+num2+" = "+Operador.divisao(num1, num2));
				break;
			}else if(opcao == 4) {
				JOptionPane.showMessageDialog(null, num1+" X "+num2+" = "+Operador.multiplicacao(num1, num2));
				break;	
			}else {
				JOptionPane.showMessageDialog(null, "Valor Inválido!");
				}
			
		}

	}
		
}