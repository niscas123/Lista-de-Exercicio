package exercicio_314;

import javax.swing.JOptionPane;

public class EmployeeTest {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String sobreNome = JOptionPane.showInputDialog("Digite o seu sobrenome");
		double salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário mensal"));
		
		Employee objeto1 = new Employee(nome, sobreNome, salarioMensal);
		Employee objeto2 = new Employee(nome, sobreNome, salarioMensal);
		
		JOptionPane.showMessageDialog(null,"Nome: "+objeto1.getNome()+"\nSalário Anual: R$"+objeto1.getSalarioMensal() * 12);
		JOptionPane.showMessageDialog(null,"Nome: "+objeto2.getNome()+"\nSalário Anual: R$"+objeto2.getSalarioMensal() * 12);

		double aumento = 0;
		aumento += objeto1.getSalarioMensal() + objeto1.getSalarioMensal() / 0.10;
		objeto1.setSalarioMensal(aumento);

		double aumento2 = 0;
		aumento2 += objeto2.getSalarioMensal() + objeto2.getSalarioMensal() / 0.10;
		objeto2.setSalarioMensal(aumento2);
		
		JOptionPane.showMessageDialog(null,"Nome: "+objeto1.getNome()+"\nSalário Anual: R$"+objeto1.getSalarioMensal() * 12);
		JOptionPane.showMessageDialog(null,"Nome: "+objeto2.getNome()+"\nSalário Anual: R$"+objeto2.getSalarioMensal() * 12);
		}
	
}