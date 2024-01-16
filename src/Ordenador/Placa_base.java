package Ordenador;

public class Placa_base {
	
	private String modelo;
	private String marca;
	private String slots_ram;

	public Placa_base(String modelo, String marca, String slots_ram) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.slots_ram = slots_ram;
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

	public String getSlots_ram() {
		return slots_ram;
	}

	public void setSlots_ram(String slots_ram) {
		this.slots_ram= slots_ram;
	}


}
