package Ordenador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ordenador {

	private String nombre;
	private String precio;
	private Perifericos perifericos;
	private Componentes componentes;

	public Ordenador(String nombre, String precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.perifericos = new Perifericos();
		this.componentes = new Componentes();
	}

	public void setPerifericos(Perifericos perifericos) {
		this.perifericos = perifericos;
	}

	public void setComponentes(Componentes componentes) {
		this.componentes = componentes;
	}

	public void agregarTeclado(String nombreTeclado, String marcaTeclado) {
		Teclado teclado = new Teclado(nombreTeclado, marcaTeclado);
		this.perifericos.setTeclado(teclado);
	}

	public void agregarRaton(String nombreRaton, String marcaRaton) {
		Raton raton = new Raton(nombreRaton, marcaRaton);
		this.perifericos.setRaton(raton);
	}

	public void agregarMonitor(String nombre, String marca, String resolution) {
		Monitor m = new Monitor(nombre, marca, resolution);
		this.componentes.setMonitor(m);
	}

	public void agregarPlaca_base(String nombre, String marca, String slots_ram) {
		Placa_base pb = new Placa_base(nombre, marca, slots_ram);
		this.componentes.setPlaca_base(pb);
	}

	public void agregarProcesador(String nombre, String marca, String velocidad) {
		Procesador p = new Procesador(nombre, marca, velocidad);
		this.componentes.setProcesador(p);
	}

	public void agregarRam() {
		Ram ram = new Ram();
		this.componentes.setRam(ram);
	}
	
	public void agregarDiscos () {
		DiscoDuro disco = new DiscoDuro();
		this.componentes.setDiscoDuro(disco);
	}
	
	public void agregarTarjetaGrafica (String marca, String modelo, String precio, String potencia ) {
		TarjetaGrafica tarjeta = new TarjetaGrafica(marca, modelo, precio, potencia);
		this.componentes.setTarjeta(tarjeta);
	}
	

}
