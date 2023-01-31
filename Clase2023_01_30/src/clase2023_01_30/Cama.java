package clase2023_01_30;

import java.awt.Color;

public class Cama {
    private String marca, size;
    private Color color;

    public Cama() {
    }

    public Cama(String marca, String size, Color color) {
        this.marca = marca;
        this.size = size;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cama{" + "marca=" + marca + ", size=" + size + ", color=" + color + '}';
    }
    
    
    
}
