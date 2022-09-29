package SalaoJava;

public class Cabelereiro {
	public int id;
	public String nome;
	public int CPF;
	
	public Cabelereiro(int id, String nome, int cPF) {
		setId(id);
		setNome(nome);
		setCPF(cPF);
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
		if(nome.length()>3)
		this.nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		if(cPF>0)
			CPF = cPF;
	}
}
