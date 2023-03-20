package produtosLoja;

public class Service {
	
	private Repositorio repositorio;
	
	public Service() {
		repositorio = new Repositorio();
	}
	
	public int criarProduto(String nome, float preco, String fabricante) {
		Produto produto = new Produto(nome, preco, fabricante);
		return repositorio.armazenarProduto(produto);
	}
	
	public String consultaProduto(int codigo) {
		return repositorio.consultaProduto(codigo);
	}
}
