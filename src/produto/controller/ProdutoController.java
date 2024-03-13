package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	//Collection 
	private ArrayList<Produto> listaProd = new ArrayList<Produto>();
	int codigo = 0;
	
	@Override
	public void cadastrar(Produto produto) {
		listaProd.add(produto);
		System.out.println("Produto cadastrado com sucesso! " + "código: " + produto.getCodigo());
	}

	@Override
	public void atualizar(Produto produto) {
		var buscarProd = buscarProduto(produto.getCodigo());
		
		if(buscarProd != null) {
			listaProd.set(listaProd.indexOf(buscarProd), produto);
			System.out.println("O produto " + produto.getCodigo()  + " foi atualizado");
		}else {
			System.out.println("O produto " + produto.getCodigo()  + " não existe");
		}
		
		
	}

	@Override
	public void visualizar() {
		for (var produto : listaProd) {
			produto.visualizar();
		}
		
	}

	@Override
	public void deletar(int cod) {
		var produto = buscarProduto(codigo);
		
		if(produto != null) {
			if(listaProd.remove(produto) == true) {
				System.out.println("O produto " + codigo + " foi removido!");
			}else {
				System.out.println("O produto " + codigo + " não existe!");
			}
		}
		
	}

	@Override
	public void retirar(int quanti) {
		var produto = buscarProduto(codigo);
		
		if(produto != null) {
			if(produto.retirar(quanti) == true) {
				System.out.println("Você retirou " + quanti + " mangás do estoque! ");
			}else {
				System.out.println("Produto não encontrado! ");
			}
		}
		
	}
	
	public Produto buscarProduto(int codigo) {
		for(var produto : listaProd) {
			if(produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}
	
	public int gerarCodigo() {
		return ++ codigo;
	}

}
