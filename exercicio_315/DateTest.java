package exercicio_315;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		Date data;
	 
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual o dia do m�s? "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Qual o m�s do ano? "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano? "));
		
		data = new Date(dia, mes, ano);
		
		JOptionPane.showMessageDialog(null, data.displayDate(dia,mes,ano));
	}

}
