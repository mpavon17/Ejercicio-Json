package Main;

import java.util.HashMap;

import com.google.gson.Gson;

import Ordenador.Componentes;
import Ordenador.Ordenador;
import Ordenador.Ram;

public class Main {

	public static void main(String[] args) {
		
		Ordenador o2 = new Ordenador ("Flameador 2024", "1900");
		o2.agregarTeclado("Flaming pro eco 2", "flamer Gaming SL");
		o2.agregarRaton("Insultating pro 1", "Flamer Gamming SL");
		o2.agregarMonitor("4k feeder pro-max", "Rager", "2160p");
		o2.agregarPlaca_base("B470", "¡Amanoob", "4");
		o2.agregarRam();
		o2.agregarProcesador("Manker", "¡9.5", "5Ghz");
		o2.agregarDiscos();
		o2.agregarTarjetaGrafica("iAmanoob", "4080", "2 bitcoins","Trillon cudas");

		Gson gson = new Gson();
		String json = gson.toJson(o2);
		System.out.println(json);

	}

}
