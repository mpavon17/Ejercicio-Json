package Ordenador;

public class Procesador {
	
	private String modelo;
	private String marca;
	private String velocidad;

	public Procesador(String modelo, String marca, String velocidad) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.velocidad = velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getResolution() {
		return velocidad;
	}

	public void setResolution(String velocidad) {
		this.velocidad = velocidad;
	}


}
