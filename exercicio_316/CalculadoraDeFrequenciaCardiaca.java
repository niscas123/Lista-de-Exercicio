package exercicio_316;

import javax.swing.JOptionPane;

public class CalculadoraDeFrequenciaCardiaca {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "CALCULADORA DE FREQU�NCIA CARDIACA");
		String nome = JOptionPane.showInputDialog("DIGITE O SEU NOME: ");
		String sobreNome = JOptionPane.showInputDialog("DIGITE O SEU SOBRENOME: ");
		JOptionPane.showMessageDialog(null, "DIGITE A DATA DO SEU NASCIMENTO");
		int dia = Integer.parseInt(JOptionPane.showInputDialog("DIA DO NASCIMENTO: "));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("M�S DO NASCIMENTO: "));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("ANO DO NASCIMENTO: "));
		
		HeartRates frequencia = new HeartRates(nome, sobreNome, dia, mes, ano);
		int idade = HeartRates.calculoIdade(ano);
		int frequenciaMaxima = HeartRates.frequenciaMaxima(idade);
		double[] frequenciaAlvo = HeartRates.frequenciaAlvo(frequenciaMaxima);
		
		
		JOptionPane.showMessageDialog(null, "NOME: "+frequencia.getNome()+
				"\nSOBRENOME: "+frequencia.getSobreNome()+
				"\nDATA DE NASCIMENTO:"+frequencia.getDia()+"/"+frequencia.getMes()+"/"+frequencia.getAno()+
				"\nIDADE: "+idade+"\nFREQU�NCIA CARDIACA: "+frequenciaMaxima+"\nFREQU�NCIA ALVO: "+"["+frequenciaAlvo[0]+"] ["+frequenciaAlvo[1]+"]");
	}

}
