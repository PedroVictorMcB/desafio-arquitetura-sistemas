package Model;


public class Produto extends CadastroDeProdutos {

	private int quantidade;

	public Produto(int id, String nome, String descricao, String cor, String caracteristica, String tipo,
			int quantidade) {
		super(id, nome, descricao, cor, caracteristica, tipo);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
}
