package Ordenador;

import java.util.HashMap;

public class Componentes {

	private Monitor monitor;
	private Procesador procesador;
	private Placa_base placa_base;
	private Ram ram;
	private DiscoDuro disco;
	private TarjetaGrafica tarjeta;

	public Componentes() {
		super();
		this.ram = new Ram();
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Placa_base getPlaca_base() {
		return placa_base;
	}

	public void setPlaca_base(Placa_base placa_base) {
		this.placa_base = placa_base;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public void setDiscoDuro(DiscoDuro disco1) {
		this.disco = disco1;
	}

	public DiscoDuro getDisco() {
		return disco;
	}

	public TarjetaGrafica getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaGrafica tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Componentes [monitor=" + monitor + ", procesador=" + procesador + ", placa_base=" + placa_base
				+ ", ram=" + ram + "]";
	}

}
