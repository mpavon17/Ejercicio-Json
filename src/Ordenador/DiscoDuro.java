package Ordenador;

import java.util.ArrayList;
import java.util.List;

public class DiscoDuro {

	private List<DiscosDuro> disco;

	public DiscoDuro() {

		this.disco = new ArrayList<>();

		setModulo();
	}

	public List<DiscosDuro> getModulo() {
		return disco;
	}

	public void setModulo() {
		DiscosDuro d1 = new DiscosDuro();
		d1.setId("1");
		d1.setMarca("Manker");
		d1.setTipo("HDD");
		d1.setCapacidad("500GB");

		DiscosDuro d2 = new DiscosDuro();
		d2.setId("2");
		d2.setMarca("Ragger");
		d2.setTipo("SSD");
		d2.setCapacidad("500GB");

		this.disco.add(d1);
		this.disco.add(d2);
	}

}
