package produtosLoja;

import java.util.Map;
import java.util.HashMap;

public class Repositorio {
	private Map<Integer, Produto> armazemProduto;
	
	public Repositorio() {
		armazemProduto = new HashMap<Integer, Produto>();
	}
	
	public int armazenarProduto(Produto produto) {
		armazemProduto.put(produto.hashCode(), produto);
		return produto.hashCode();
	}
	
	public String consultaProduto(int codigo) {
		return armazemProduto.get(codigo).toString();
	}
}
