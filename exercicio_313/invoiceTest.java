package exercicio_313;

import javax.swing.JOptionPane;

public class invoiceTest {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("N�mero do item comprado");
		String descricao = JOptionPane.showInputDialog("Descri��o do item comprado");
		int quantidadeComprada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de item comprado"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco do item vendido"));

		Invoice fatura = new Invoice(numero, descricao, quantidadeComprada, preco);
		
		JOptionPane.showMessageDialog(null, "\nN�mero do item: "+fatura.getNumero()+
					"\nDescri��o do item: "+fatura.getDescricao()+
					"\nQuantidade de item comprado: "+fatura.getQuantidadeComprada()+
					"\nPre�o do item: R$"+fatura.getPreco()+
					"\nFatura da compra: R$"+fatura.getInvoiceAmount());
		}
	
}