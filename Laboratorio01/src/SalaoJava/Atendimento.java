package SalaoJava;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {
	public Cliente cliente;
	public String servico;
	public String cabelereiro;
	public Calendar data;
	public ArrayList<Servicos> listaServicos;
	
	public Atendimento(Cliente cliente, String servico, String cabelereiro, Calendar data) {
		setCliente(cliente);
		setServico(servico);
		setCabelereiro(cabelereiro);
		this.data = (Calendar.getInstance());
	}
	
	public Cliente getCliente() {
		if(cliente.atendido==false)
			cliente.atendido=true;
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public String getCabelereiro() {
		return cabelereiro;
	}
	public void setCabelereiro(String cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

}

