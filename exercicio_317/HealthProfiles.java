package exercicio_317;

import java.util.Calendar;

public class HealthProfiles {
	static Calendar cal = Calendar.getInstance();
	static int anoAtual = cal.get(Calendar.YEAR);
	static int mesAtual = cal.get(Calendar.MONTH);
	static int diaAtual = cal.getMaximum(Calendar.DAY_OF_MONTH);
	
	private String nome, sobreNome, sexo;
	private int altura, peso, dia, mes, ano;
	
	public HealthProfiles(String nome, String sobreNome, String sexo, int altura, int peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public static int calculoIdade(int ano) {
		int idade = anoAtual - ano;
		return idade;	
	}
	public static int frequenciaMaxima(int idade) {
		int frequencia = 220 - idade;
		return frequencia;
	}
	public static double[] frequenciaAlvo(int frequencia) {
		double[] calculo = new double[2];
		calculo[0] = (frequencia * 50) / 100;
		calculo[1] = (frequencia * 85) / 100;
		return calculo;
	}
	public static double calculoImc(double altura, double peso) {
		double converterAltura = altura * 0.0254;
		double converterPeso = peso * 0.453592;
		double imc =  converterPeso / (converterAltura * converterAltura);
		return imc;
	}

}
