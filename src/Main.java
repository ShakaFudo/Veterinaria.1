import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Ave> aves = new ArrayList<>();
        ArrayList<Perros> perros = new ArrayList<>();
        ArrayList<Gatos> gatos = new ArrayList<>();

    //llamo los metodos estaticos de la clase Animal.
    Animal.agregarAnimal(aves, perros, gatos);
    Animal.mostrarAnimal(aves, perros, gatos);

    System.out.println("Espero que disfrute la compañía de los animales!");
    System.out.println("- Veterinaria los pibes -");


    }
}