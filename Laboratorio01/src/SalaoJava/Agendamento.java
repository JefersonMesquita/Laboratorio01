package SalaoJava;

import java.util.Calendar;

public class Agendamento {
	public int id;
	public Cliente cliente;
	public Calendar data;
	public int hora;
	public int minuto;
	public Cabelereiro cabelereiro;
	
	public Agendamento(int id, Cliente cliente, int hora, int minuto, Cabelereiro cabelereiro) {
		this.id = id;
		this.cliente = cliente;
		this.hora = hora;
		this.minuto = minuto;
		this.cabelereiro = cabelereiro;
		this.data = Calendar.getInstance();
	}
	
	public void marcarHorario() {
		
	}
	
}
