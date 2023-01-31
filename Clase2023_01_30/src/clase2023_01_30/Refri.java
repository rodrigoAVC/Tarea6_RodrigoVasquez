package clase2023_01_30;

import java.awt.Color;

public class Refri {
    private String marca, modelo;
    private int size;
    private Color color;

    public Refri(String marca, String modelo, int size, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.size = size;
        this.color = color;
    }

    public Refri() {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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
        return "Refri{" + "marca=" + marca + ", modelo=" + modelo + ", size=" + size + ", color=" + color + '}';
    }
    
    
    
}
