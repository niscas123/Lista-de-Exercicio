package exercicio_313;

public class Invoice {
	private String numero, descricao;
	private int quantidadeComprada;
	private double preco;
	
	public Invoice(String numero, String descricao, int quantidadeComprada, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.preco = preco;	
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}
	public void setQuantidadeComprada(int quantidadeComprada) {
		if(quantidadeComprada <= 0) {
			this.quantidadeComprada = 0;
		}else {
			this.quantidadeComprada = quantidadeComprada;
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco <= 0) {
			this.preco = 0;
		}else{ 
			this.preco = preco;
		}
	}
	public double getInvoiceAmount() {
		return quantidadeComprada * preco;
	}
}