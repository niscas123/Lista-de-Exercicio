package exercicio_314;

public class Employee {
	private String nome, sobreNome;
	private double salarioMensal;
	
	public Employee(String nome, String sobreNome, double salarioMensal) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioMensal = salarioMensal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal <= 0) {
			this.salarioMensal = 0.0;	
		}else {
			this.salarioMensal = salarioMensal;
		}
		
	}
	
}
