package clase2023_01_30;

import java.util.ArrayList;

public class Cocina {
    private int size;
    private ArrayList<String> utensilios = new ArrayList();
    private Refri refrigerador;
    private Micro microondas;

    public Cocina() {
    }

    public Cocina(int size, Refri refrigerador, Micro microondas) {
        this.size = size;
        this.refrigerador = refrigerador;
        this.microondas = microondas;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(ArrayList<String> utensilios) {
        this.utensilios = utensilios;
    }

    public Refri getRefrigerador() {
        return refrigerador;
    }

    public void setRefrigerador(Refri refrigerador) {
        this.refrigerador = refrigerador;
    }

    public Micro getMicroondas() {
        return microondas;
    }

    public void setMicroondas(Micro microondas) {
        this.microondas = microondas;
    }

    @Override
    public String toString() {
        return "Cocina{" + "size=" + size + ", utensilios=" + utensilios + ", refrigerador=" + refrigerador + ", microondas=" + microondas + '}';
    }
    
    
    
}
