package produto.model;

public abstract class Produto {
	private int codigo, faixaEtaria, quantidade;
	private String nome, genero, autor;
	
	
	//Método construtor
	public Produto(int codigo, int faixaEtaria, int quantidade, String nome, String genero, String autor) {
		this.codigo = codigo;
		this.faixaEtaria = faixaEtaria;
		this.quantidade = quantidade;
		this.nome = nome;
		this.genero = genero;
		this.autor = autor;
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	//Getters an Setters
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getFaixaEtaria() {
		return faixaEtaria;
	}


	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	//Métodos
	public boolean retirar(int quant) {
		if(this.getQuantidade() < quant) {
			System.out.println("\nVocê não possuí essa quantidade de produto, melhor atualizar o estoque!!");
			return false;
		}else {
			this.setQuantidade(this.getQuantidade() - quant);
			return true;
		}
	}
	
	public void visualizar() {
		System.out.println("Dados do Produto: ");
		System.out.println("Código do Produto: " + this.codigo);
		System.out.println("Nome " + this.nome);
		System.out.println("Gênero: " + this.genero);
		System.out.println("Autor(a): " + this.autor);
		System.out.println("Faixa etária: " + this.faixaEtaria);
		System.out.println("Quantidade em Estoque: " + this.quantidade);
		
	}
	
	
	
}
