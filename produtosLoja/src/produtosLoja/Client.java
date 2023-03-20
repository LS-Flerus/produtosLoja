package produtosLoja;

import java.util.Scanner;

public class Client {
	
	private static Fachada fachada = new Fachada();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("Deseja:\n"
					+ "1: Criar Produto;\n"
					+ "2: Consultar Produto;\n"
					+ "3: Sair");
			int opcao = sc.nextInt();
			sc.nextLine();
			if(opcao == 1) {
				criaProduto();
			} else if(opcao == 2) {
				consultaProduto();
			} else if(opcao == 3) {
				break;
			}
		}
	}
	
	public static void criaProduto() {
		System.out.println("Qual o nome?");
		String nome = sc.nextLine();
		System.out.println("Qual o preco?");
		float preco = sc.nextFloat();
		sc.nextLine();
		System.out.println("Qual o fabricante?");
		String fabricante = sc.nextLine();
		System.out.println(fachada.criarProduto(nome, preco, fabricante));
	}
	
	public static void consultaProduto() {
		System.out.println("Qual o codigo?");
		int codigo = sc.nextInt();
		System.out.println(fachada.consultaProduto(codigo));
	}
	
}
