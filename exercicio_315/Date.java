package exercicio_315;

public class Date {
	private int dia, mes, ano;
	
	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void getDia(int dia) {
		this.dia = dia;
	}
	public int setDia() {
		return dia;
	}
	public void getMes(int mes) {
		this.mes = mes;
	}
	public int setMes() {
		return mes;
	}
	public void getAno(int ano) {
		this.ano = ano;
	}
	public int setAno() {
		return ano;
	}
	public String displayDate(int dia,int mes, int ano) {
		return (dia+"/"+mes+"/"+ano);
	}
}