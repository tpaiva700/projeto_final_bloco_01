package sistema;

import java.util.InputMismatchException;
import java.util.Scanner;

import cor.Colors;
import produto.controller.ProdutoController;
import produto.model.Manga;
import produto.model.Produto;

public class Menu {

	public static void main(String[] args) {
		//Menu - Loja de Mangás 
		Scanner sc = new Scanner(System.in);
		
		ProdutoController produtos = new ProdutoController();
		
		int opcao, codigo, faixaEtaria, quantidade, quantRetirada; 
		String nome, genero, autor, sinopse;
		
		while (true) {
		//Menu para o Usuário Administrador 
		System.out.println(Colors.TEXT_GREEN + Colors.ANSI_BLACK_BACKGROUND + 
				"*--------------------------------------------------*");
		System.out.println("*					           *");
		System.out.println("*		The Mangás Store!	   	   * ");
		System.out.println("*					           *");
		System.out.println("*--------------------------------------------------*");
		System.out.println("     1 - Cadastrar Produto 			   *");
		System.out.println("     2 - Listar Produtos 			   *");
		System.out.println("     3 - Atualizar Produto 			   *");
		System.out.println("     4 - Excluir Produto 			   *");
		System.out.println("     5 - Retirar Produto 			   *");
		System.out.println("     6 - Sair do Menu 			   	   *");
		System.out.println("*--------------------------------------------------*");
		System.out.println("  Informe o que deseja fazer: 			   *");
		System.out.println("*--------------------------------------------------*");
		//opcao = sc.nextInt();	
		
		//Exceptions
		try {
			opcao = sc.nextInt();
		} catch (InputMismatchException erro) {
			System.out.println("\nDigite valores inteiros!!");
			sc.nextLine();
			opcao = 0;
		}
		
		
		if(opcao == 6) {
			System.out.println(Colors.TEXT_GREEN_BOLD +"A Liberdade bem perto de sua Casa!!");
			rodape();
			sc.close();	
			System.exit(opcao);
			}
		
		
		//Case
		switch (opcao) {
		case 1: 
			System.out.println("Cadastrar um Produto");
			
			System.out.println("Informe a faixa etária: ");
			faixaEtaria = sc.nextInt();
			
			System.out.println("Informe a quantidade em estoque: ");
			sc.skip("\\R?");
			quantidade = sc.nextInt();
			
			System.out.println("Informe o nome do Produto: " );
			sc.skip("\\R?");
			nome = sc.nextLine();
			
			System.out.println("Informe o Gênero: " );
			sc.skip("\\R?");
			genero = sc.nextLine();
			
			System.out.println("Informe o Autor(a): " );
			sc.skip("\\R?");
			autor = sc.nextLine();
			
			System.out.println("Informe a Sinopse: " );
			sinopse = sc.nextLine();
			
			produtos.cadastrar(new Manga(produtos.gerarCodigo(), faixaEtaria, quantidade, nome, genero, autor, sinopse));
			
			break;
			
		case 2: 
			System.out.println("Listar Produtos");
			produtos.visualizar();
		break;
		
		case 3:
			System.out.println("Atualizar Dados de um Produto");
			
			System.out.println("Informe o código do produto: ");
			codigo = sc.nextInt();
			
			var buscarProd = produtos.buscarProduto(codigo);
			
			if(buscarProd != null) {
				System.out.println(" ");
				System.out.println("Informe a faixa etária: ");
				faixaEtaria = sc.nextInt();
				
				System.out.println("Informe a quantidade em estoque: ");
				sc.skip("\\R?");
				quantidade = sc.nextInt();
				
				System.out.println("Informe o nome do Produto: " );
				sc.skip("\\R?");
				nome = sc.nextLine();
				
				System.out.println("Informe o Gênero: " );
				sc.skip("\\R?");
				genero = sc.nextLine();
				
				System.out.println("Informe o Autor(a): " );
				sc.skip("\\R?");
				autor = sc.nextLine();
				
				System.out.println("Informe a Sinopse: " );
				sinopse = sc.nextLine();
				
				produtos.atualizar(new Manga(codigo, faixaEtaria, quantidade, nome, genero, autor, sinopse));
			}else {
				System.out.println("Produto não encontrado!! ");
			}
			
			break;
			
		case 4 : 
			System.out.println("Excluir Produto");
			
			System.out.println("Informe o código do produto: ");
			codigo = sc.nextInt();
			
			produtos.deletar(codigo);
			break;
			
		case 5 : 
			System.out.println("Retirar Produto");
			System.out.println("Informe o código do produto: ");
			codigo = sc.nextInt();
			
			do {
				System.out.println("Informe qual a quantidade que você deseja retirar: "); 
				quantRetirada = sc.nextInt();
			}while(quantRetirada <= 0); 
			
			break;
			
			default: 
				System.out.println("Por favor, informe uma opção válida!!");
				break;
		}
		
		
		
		
		}
	
	
	}
	
	public static void rodape() {
		System.out.println("\n*-------------------------------------------------------*");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Thaís Paiva ");
		System.out.println("https://github.com/tpaiva700");
		System.out.println("*-------------------------------------------------------*");
	}

}
