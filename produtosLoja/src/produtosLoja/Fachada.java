package produtosLoja;

public class Fachada {
	
	private Service service;
	
	public Fachada() {
		service = new Service();
	}
	
	public int criarProduto(String nome, float preco, String fabricante) {
		return service.criarProduto(nome, preco, fabricante);
	}
	
	public String consultaProduto(int codigo) {
		return service.consultaProduto(codigo);
	}
}
