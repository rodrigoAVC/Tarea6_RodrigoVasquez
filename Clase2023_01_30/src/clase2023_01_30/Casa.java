package clase2023_01_30;

import java.awt.Color;
import java.util.ArrayList;

public class Casa {
    private Color color;
    private Cocina cocina;
    private Sala sala;
    private ArrayList<Dormitorio> dormitorios = new ArrayList();

    public Casa() {
    }

    public Casa(Color color, Cocina cocina, Sala sala) {
        this.color = color;
        this.cocina = cocina;
        this.sala = sala;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Cocina getCocina() {
        return cocina;
    }

    public void setCocina(Cocina cocina) {
        this.cocina = cocina;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Dormitorio> getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(ArrayList<Dormitorio> dormitorios) {
        this.dormitorios = dormitorios;
    }

    @Override
    public String toString() {
        return "Casa{" + "color=" + color + ", cocina=" + cocina + ", sala=" + sala + ", dormitorios=" + dormitorios + '}';
    }
    
    
    
}
