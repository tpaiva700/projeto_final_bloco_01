package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	//CRUD do Projeto: Produto 
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void visualizar();
	public void deletar(int cod );
	public void retirar(int quanti);

}
