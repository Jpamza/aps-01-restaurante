public class Pedido {
	
	static Pratos pedido[] = new Pratos[3];
	static double total;
	
	public void montarPedido(){
		pedido[0] = Restaurante.prato1;
		pedido[1] = Restaurante.prato2;
		pedido[2] = Restaurante.prato3;
		total = pedido[0].getPreco() + pedido[1].getPreco() + pedido[2].getPreco();
	}
	public void mostrarPedido(){
		System.out.print("=========================="
				         + "\n   Pedido do cliente"
				         + "\n1:"+pedido[0].getNome()
				         + "\n2:"+pedido[1].getNome()
				         + "\n3:"+pedido[2].getNome()
				         + "\n       Total           "
				         + "\nPreço a pagar-----R$"+total+"0"
				         + "\nValor Pago--------R$"+(total+5)+"0"
				         + "\nTroco-------------R$5,00"
				         + "\nMuito obrigado, volte sempre"
				         + "\nlakoza.com.br");
		
	}
}
