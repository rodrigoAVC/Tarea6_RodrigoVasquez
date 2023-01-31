package clase2023_01_30;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Clase2023_01_30 {

    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in);
        Casa c = new Casa();
//        c.setColor(Color.yellow);
//        c.getCocina().setSize(10);
//        c.getCocina().getUtensilios().add("Olla de presion");
//        c.getCocina().getUtensilios().add("Cucharon");
//        c.getCocina().getUtensilios().set(0, "Cacerola");
//        c.getDormitorios().add(new Dormitorio());
//        c.getDormitorios().get(0).getCama().setMarca("Olympia");
        /*Con la jerarquia crear un programa que administre n casas en una colonia; para cada casa 
        debera programar 10 opciones de menu (modificar), imprimir la colonia
         */
        Casa casa1 = new Casa();
        Casa casa2 = new Casa();
        Casa casa3 = new Casa();

        int opcion;
        int subOpcion;
        do {
            System.out.println("----------------------");
            System.out.println("     < M E N U >");
            System.out.println("----------------------");
            System.out.println(" || C O L O N I A ||");
            System.out.print("""
                           [1] Casa #1
                           [2] Casa #2
                           [3] Casa #3
                           [4] Imprimir
                           """);
            System.out.println("----------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("""
                                   [1] Obtener cuadro de sala
                                   [2] Incrementar la potencia del microondas
                                   [3] Cambiar tamaño de la refrigeradora
                                   [4] Cambiar el color de la cama
                                   [5] Añadir sillon a la sala
                                   [6] Añadir utensilios de cocina
                                   [7] Cambiar el color de la casa
                                   [8] Conseguir el modelo de la refri
                                   [9] Cuatos cuadros hay en sala
                                   [10] Incrementar el tamaño de la cama
                                   """);
                    System.out.print("Eliga que realizar: ");
                    subOpcion = scMain.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println(casa1.getSala().getCuadros());
                            break;
                        case 2:
                            casa1.getCocina().getMicroondas().setPotencia(500);
                            break;
                        case 3:
                            casa1.getCocina().getRefrigerador().setSize(300);
                            break;
                        case 4:
                            casa1.getDormitorios().get(0).getCama().setColor(JColorChooser.showDialog(null,  "Choose color", Color.yellow));
                            break;
                        case 5:
                            casa1.getSala().getSillones().add("Sillon");
                            break;
                        case 6:
                            casa1.getCocina().getUtensilios().add("Sarten");
                            break;
                        case 7:
                            casa1.setColor(JColorChooser.showDialog(null,  "Choose color", Color.yellow));
                            break;
                        case 8:
                            casa1.getCocina().getRefrigerador().getModelo();
                            break;
                        case 9:
                            System.out.println(casa1.getSala().getCuadros());
                            break;
                        case 10:
                            casa1.getDormitorios().get(0).getCama().setSize("King");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("""
                                   [1] Añadir sillones a la sala
                                   [2] Conseguir el color de la refri 
                                   [3] Cambiar la marca del microondas
                                   [4] Cambiar el color de la cama
                                   [5] Cuantos cuadros hay
                                   [6] Incrementar tamaño de cocina
                                   [7] Contar los utencilios 
                                   [8] Contar los dormitorios
                                   [9] Potencia del microondas
                                   [10] Disminuir potencia
                                   """);
                    System.out.print("Eliga que realizar: ");
                    subOpcion = scMain.nextInt();
                    switch (subOpcion) {
                        case 1:
                            casa2.getSala().getSillones().add("Sillon");
                            break;
                        case 2:
                            System.out.println(casa2.getCocina().getRefrigerador().getColor());
                            break;
                        case 3:
                            casa2.getCocina().getMicroondas().setMarca("Pato");
                            break;
                        case 4:
                            casa2.getDormitorios().get(0).getCama().setColor(JColorChooser.showDialog(null,  "Choose color", Color.yellow));
                            break;
                        case 5:
                            System.out.println(casa2.getSala().getCuadros());
                            break;
                        case 6:
                            casa2.getCocina().setSize(200);
                            break;
                        case 7:
                            System.out.println(casa2.getCocina().getUtensilios());
                            break;
                        case 8:
                            System.out.println(casa2.getDormitorios());
                            break;
                        case 9:
                            casa2.getCocina().getMicroondas().setPotencia(200);
                            break;
                        case 10:
                            casa2.getCocina().getMicroondas().setPotencia(50);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("""
                                   [1] Cambiar tamaño de refri
                                   [2] Conseguir marca y modelo de refri
                                   [3] Conseguir color de refri
                                   [4] Cambiar marca de microondas 
                                   [5] Disminuir tamaño de la cama
                                   [6] Cambiar color de cama
                                   [7] Conseguir marca de cama
                                   [8] Contar los sillones 
                                   [9] Eliminar utensilio
                                   [10] Eliminar dormitorio
                                   """);
                    System.out.print("Eliga que realizar: ");
                    subOpcion = scMain.nextInt();
                    switch (subOpcion) {
                        case 1:
                            casa3.getCocina().getRefrigerador().setSize(300);
                            break;
                        case 2:
                            System.out.println(casa3.getCocina().getRefrigerador().getMarca());
                            System.out.println(casa3.getCocina().getRefrigerador().getModelo());
                            break;
                        case 3:
                            System.out.println(casa3.getCocina().getRefrigerador().getColor());
                            break;
                        case 4:
                            casa3.getCocina().getMicroondas().setMarca("Ganso");
                            break;
                        case 5:
                            casa3.getDormitorios().get(0).getCama().setSize("Personal");
                            break;
                        case 6:
                            casa3.getDormitorios().get(0).getCama().setColor(JColorChooser.showDialog(null,  "Choose color", Color.yellow));
                            break;
                        case 7:
                            System.out.println(casa3.getDormitorios().get(0).getCama().getMarca());
                            break;
                        case 8:
                            System.out.println(casa3.getSala().getSillones());
                            break;
                        case 9:
                            casa3.getCocina().getUtensilios().remove(0);
                            break;
                        case 10:
                            casa3.getDormitorios().remove(0);
                            break;
                    }
            }

        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

    }

}
