package exercicio_317;

import javax.swing.JOptionPane;

import exercicio_317.HealthProfiles;

public class RegistroDeSaude {

		public static void main(String[] args) {
			
			JOptionPane.showMessageDialog(null, "REGISTRO DE SAÚDE");
			String nome = JOptionPane.showInputDialog("DIGITE O SEU NOME: ");
			String sobreNome = JOptionPane.showInputDialog("DIGITE O SEU SOBRENOME: ");
			String sexo = JOptionPane.showInputDialog("DIGITE SEU SEXO: ");
			int altura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A SUA ALTURA [EM POLEGADAS]: "));
			int peso = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O SEU PESO [EM LIBRAS]:"));
			JOptionPane.showMessageDialog(null, "DIGITE A DATA DO SEU NASCIMENTO");
			int dia = Integer.parseInt(JOptionPane.showInputDialog("DIA DO NASCIMENTO: "));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("MÊS DO NASCIMENTO: "));
			int ano = Integer.parseInt(JOptionPane.showInputDialog("ANO DO NASCIMENTO: "));
			
			HealthProfiles registro = new HealthProfiles(nome, sobreNome, sexo, altura, peso, dia, mes, ano);
			int idade = HealthProfiles.calculoIdade(ano);
			int frequenciaMaxima = HealthProfiles.frequenciaMaxima(idade);
			double[] frequenciaAlvo = HealthProfiles.frequenciaAlvo(frequenciaMaxima);
			double imc = HealthProfiles.calculoImc(altura, peso);
			
			JOptionPane.showMessageDialog(null, "NOME: "+registro.getNome()+
					"\nSOBRENOME: "+registro.getSobreNome()+
					"\nDATA DE NASCIMENTO:"+registro.getDia()+"/"+registro.getMes()+"/"+registro.getAno()+
					"\nSEXO: "+registro.getSexo()+"\nALTURA: "+registro.getAltura()+"\nPESO: "+registro.getPeso()+
					"\nIDADE: "+idade+"\nFREQUÊNCIA CARDIACA: "+frequenciaMaxima+
					"\nFREQUÊNCIA ALVO: "+"["+frequenciaAlvo[0]+"] - ["+frequenciaAlvo[1]+"]"+"\nIMC: "+imc);

	}

}
