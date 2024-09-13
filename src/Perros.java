import java.util.Scanner;
public class Perros extends Animal {


    public Perros(String nombre, String raza, String edad, String sexo) {
        super(nombre, raza, edad, sexo);
    }


    public void hacerSonido() {
        System.out.println(this.getNombre() + " está ladrando.");
    }
}