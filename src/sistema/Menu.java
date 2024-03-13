package sistema;

import java.util.Scanner;

import cor.Colors;
import produto.model.Manga;
import produto.model.Produto;

public class Menu {

	public static void main(String[] args) {
		//Menu - Loja de Mangás 
		Scanner sc = new Scanner(System.in);
		
		int opcao; 
		
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
		opcao = sc.nextInt();	
		
		if(opcao == 6) {
			System.out.println(Colors.TEXT_GREEN_BOLD +"A Liberdade bem perto de sua Casa!!");
			rodape();
			sc.close();	
			System.exit(opcao);
			}
		
		
		//Case
		switch (opcao) {
		case 1: 
			System.out.println("Criar um Produto");
			break;
			
		case 2: System.out.println("Listar Produtos");
		break;
		
		case 3:
			System.out.println("Atualizar Dados de um Produto");
			break;
			
		case 4 : 
			System.out.println("Excluir Produto");
			break;
			
		case 5 : 
			System.out.println("Retirar Produto");
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
