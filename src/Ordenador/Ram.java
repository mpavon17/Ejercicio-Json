package Ordenador;

import java.util.ArrayList;
import java.util.List;

public class Ram {

    private List<RamModulo> modulo;

    public Ram() {
      
        this.modulo = new ArrayList<>();
        
        setModulo();
    }

    @Override
    public String toString() {
        return "Ram [modulo=" + modulo + "]";
    }

    public List<RamModulo> getModulo() {
        return modulo;
    }

    public void setModulo() {
        RamModulo modulo1 = new RamModulo();
        modulo1.setId("1");
        modulo1.setMarca("Flaming");
        modulo1.setTipo("DDR4");
        modulo1.setCapacidad("8GB");

        RamModulo modulo2 = new RamModulo();
        modulo2.setId("2");
        modulo2.setMarca("Flaming");
        modulo2.setTipo("DDR4");
        modulo2.setCapacidad("8GB");

        // Agregar los módulos a la lista
        this.modulo.add(modulo1);
        this.modulo.add(modulo2);
    }
}

