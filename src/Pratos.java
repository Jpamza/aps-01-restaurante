public class Pratos {
	
	private String nome;
	private String descricao;
	private double preco;
	
	public Pratos(String nome, double preco, String descricao,String ing1,String ing2,String ing3){
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		Ingredientes.ing1 = ing1;
		Ingredientes.ing2 = ing2;
		Ingredientes.ing3 = ing3;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	
}
