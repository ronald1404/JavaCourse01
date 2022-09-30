package Unidade3;

import javax.swing.JOptionPane;

class FormaPagamento {

	public static void main(String[] args) {
		
		double produto, totalProduto;
		int codigo;
		
		produto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto"));
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de pagamento"
				+ "\n[1 - 10% desconto a vista]\n[2 - 5% de desconto no cartao]"
				+ "\n[3 - 2x sem juros]\n[4 - 3x com juros de 10%]"));
		
		switch(codigo)
		{
			case 1:
			{
				totalProduto = produto*0.9;
				JOptionPane.showMessageDialog(null, "Desconto de 10% Aplicado, produto =  "+totalProduto);
			    break;
			}
			case 2:
			{
				totalProduto = produto*0.95;
				JOptionPane.showMessageDialog(null, "O valor final com desconto de 5% ser� de "+totalProduto);
			    break; 
			}
			case 3:
			{
				totalProduto = produto;
				JOptionPane.showMessageDialog(null, "O valor em 2x sem juros ser� de "+totalProduto/2);
			    break;
			}
			case 4:
			{
				totalProduto = produto*1.1;
				JOptionPane.showMessageDialog(null, "O valor em 3x com juros de 10% ser� de "+totalProduto/3);
			    break;
			}			
			default:
			{
				JOptionPane.showMessageDialog(null, "Opçao digitada incorreta");
				FormaPagamento.main(null);
			}
		}
	}
}
