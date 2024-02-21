package Model;

public class CadastroDeProdutos extends EntidadeRelacional {
	
	private String nome;
	private String descricao;
	private String cor;
	private String caracteristica;
	private String tipo;
	public CadastroDeProdutos(int id, String nome, String descricao, String cor, String caracteristica, String tipo) {
		super(id);
		this.nome = nome;
		this.descricao = descricao;
		this.cor = cor;
		this.caracteristica = caracteristica;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
		
	

}
