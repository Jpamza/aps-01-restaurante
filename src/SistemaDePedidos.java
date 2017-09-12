public class SistemaDePedidos {
	static Pedido pedido = new Pedido();
	static Restaurante restaurante = new Restaurante();
	public static void main(String[] args) {
		System.out.println("LAKOZA");
		restaurante.mostrarCardapio();
		pedido.montarPedido();
		pedido.mostrarPedido();
	}

}
