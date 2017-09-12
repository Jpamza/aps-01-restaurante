public class Restaurante {
	
	public static Pratos prato1 = new Pratos("\nLámen",30," Macarrão com caudo"
			                                             + " de carne e legumes.",
			                                  "Carne","Macarrão","Legumes");
	public static Pratos prato2 = new Pratos("\nPorção de Takoyaki",10," 6 bolinhos"
			                                                  + " de carne de polvo.",
			                                                   "Polvo","Ovo","Farinha");
	public static Pratos prato3 = new Pratos("\nPorção de Gyoza",15," 12 pasteizinhos"
			                        + " recheados com carne moida e selados na pressão.",
			                                           "Carne","Ovo","Farinha");
	
	public void mostrarCardapio(){
		System.out.println(prato1.getNome()+": R$"+prato1.getPreco()
				                       +"\n"+prato1.getDescricao());
		System.out.println("Ingredientes: Carne, macarrão, legumes.");
		System.out.println(prato2.getNome()+": R$"+prato2.getPreco()
		                               +"\n"+prato2.getDescricao());
		System.out.println("Ingredientes: Carne de polvo, ovo, farinha.");
		System.out.println(prato3.getNome()+": R$"+prato3.getPreco()
		                               +"\n"+prato3.getDescricao());
		System.out.println("Ingredientes: Carne moída, ovo, farinha."); 
	}
}