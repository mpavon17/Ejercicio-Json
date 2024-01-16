package Ordenador;

public class TarjetaGrafica {

	private String marca;
	private String modelo;
	private String precio;
	private String potencia;

	public TarjetaGrafica(String marca, String modelo, String precio, String potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", potencia=" + potencia
				+ "]";
	}

}
