public class Restaurante {
	
	public static Pratos prato1 = new Pratos("\nL�men",30," Macarr�o com caudo"
			                                             + " de carne e legumes.",
			                                  "Carne","Macarr�o","Legumes");
	public static Pratos prato2 = new Pratos("\nPor��o de Takoyaki",10," 6 bolinhos"
			                                                  + " de carne de polvo.",
			                                                   "Polvo","Ovo","Farinha");
	public static Pratos prato3 = new Pratos("\nPor��o de Gyoza",15," 12 pasteizinhos"
			                        + " recheados com carne moida e selados na press�o.",
			                                           "Carne","Ovo","Farinha");
	
	public void mostrarCardapio(){
		System.out.println(prato1.getNome()+": R$"+prato1.getPreco()
				                       +"\n"+prato1.getDescricao());
		System.out.println("Ingredientes: Carne, macarr�o, legumes.");
		System.out.println(prato2.getNome()+": R$"+prato2.getPreco()
		                               +"\n"+prato2.getDescricao());
		System.out.println("Ingredientes: Carne de polvo, ovo, farinha.");
		System.out.println(prato3.getNome()+": R$"+prato3.getPreco()
		                               +"\n"+prato3.getDescricao());
		System.out.println("Ingredientes: Carne mo�da, ovo, farinha."); 
	}
}