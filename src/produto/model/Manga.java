package produto.model;

public class Manga extends Produto {
	
	String sinopse;
	
	//Construtor
	public Manga(int codigo, int faixaEtaria, int quantidade, String nome, String genero, String autor, String sinopse) {
		super(codigo, faixaEtaria, quantidade, nome, genero, autor);
		this.sinopse = sinopse;
	}


	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Sinopse: " + this.sinopse);
	}
	
	
}
