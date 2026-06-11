package lista07.exercicio3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimento {

	private double valor;
	private TipoMovimento tipoMovimento;
	private LocalDate data;
	private LocalTime hora;
	
	
	public Movimento(double valor, TipoMovimento tipoMovimento) {
		this.valor = valor;
		this.tipoMovimento = tipoMovimento;
		this.data = LocalDate.now();
		this.hora = LocalTime.now();
	}
	
	public double getValor() {
		return valor;
	}
	public TipoMovimento getTipoMovimento() {
		return tipoMovimento;
	}
	public LocalDate getData() {
		return data;
	}
	public LocalTime getHora() {
		return hora;
	}
	
	
	
}
