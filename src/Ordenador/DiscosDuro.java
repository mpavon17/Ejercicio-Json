package Ordenador;

import java.util.HashMap;

public class DiscosDuro {

	private String id;
	private String marca;
	private String tipo;
	private String capacidad;

	public DiscosDuro() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "DiscoDuro [id=" + id + ", marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + "]";
	}
}
