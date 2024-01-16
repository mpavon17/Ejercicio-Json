package Ordenador;

public class Monitor {

	private String modelo;
	private String marca;
	private String resolution;

	public Monitor(String modelo, String marca, String resolution) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.resolution = resolution;
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
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "Monitor [modelo=" + modelo + ", marca=" + marca + ", resolution=" + resolution + "]";
	}

}
