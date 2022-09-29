package SalaoJava;

public class Cliente {
	private int id;
	private String nome;
	private int CPF;
	public boolean atendido;
	
	public Cliente(int id, String nome, int cPF, boolean atendido) {
		setId(id);
		setNome(nome);
		setCPF(cPF);
		this.atendido = atendido;
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
		CPF = cPF;
	}
		
}
