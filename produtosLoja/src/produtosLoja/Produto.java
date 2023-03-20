package produtosLoja;

public class Produto {
	private String nome;
	private float preco;
	private String fabricante;
	
	public Produto(String nome, float preco, String fabricante) {
		this.nome = nome;
		this.preco = preco;
		this.fabricante = fabricante;
	}
	
	public String toString() {
		String texto = "Nome: " + nome + "\n"
				+ "Preco: " + preco + "\n"
				+ "Fabricante: " + fabricante;
		return texto;		
	}
}
