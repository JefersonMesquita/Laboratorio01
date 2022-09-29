package SalaoJava;

public class Servicos {
	public int id;
	public String nome;
	public float valor;
	public String descricao;
	
	public Servicos(int id, String nome, float valor, String descricao) {
		setId(id);
		setNome(nome);
		setValor(valor);
		setDescricao(descricao);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0)
			this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>5)
			this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		if(valor>0)	
			this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length()>10)
			this.descricao = descricao;
	}
	
}
