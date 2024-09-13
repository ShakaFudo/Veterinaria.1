import java.util.Scanner;
import java.util.ArrayList;


abstract class Animal {
    private String nombre;
    private String raza;
    private String edad;
    private String sexo;


    public Animal(String nombre, String raza, String edad, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void hacerSonido() {
        System.out.println(this.getNombre() + " texto ");
    }

    //Lo declaro static para poder anunciarlo en main sin tener que instanciar al mismo.
    public static void agregarAnimal(ArrayList<Ave> aves, ArrayList<Perros> perros, ArrayList<Gatos> gatos) {
        Scanner scanner = new Scanner(System.in);
        //voy a usar un while para poder agregar varios animales.
        boolean seguirAgregando = true;

        while (seguirAgregando) {
            System.out.println("Desea agregar un nuevo animal? ");
            System.out.println("Si (1), No (2)");
            int agregar = scanner.nextInt();
            scanner.nextLine();

            if (agregar == 1) {
                System.out.println("Que tipo de animal desea ingresar?");
                System.out.println("Perro (1), Gato(2), Ave(3): ");

                int tipoAnimal = scanner.nextInt();
                scanner.nextLine();


                System.out.println("Ingrese los datos del animal: ");

                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Edad (en meses): ");
                String edad = scanner.nextLine();

                System.out.println("Sexo M/F: ");
                String sexo = scanner.nextLine();

                System.out.println("Raza: ");
                String raza = scanner.nextLine();

                switch (tipoAnimal) {
                    case 1:
                        Perros perro = new Perros(nombre, edad, sexo, raza);
                        perros.add(perro);
                        System.out.println(nombre + " fue agregado exitosamente!");
                        break;

                    case 2:
                        Gatos gato = new Gatos(nombre, edad, sexo, raza);
                        gatos.add(gato);
                        System.out.println(nombre + " fue agregado exitosamente!");
                        break;

                    case 3:
                        Ave ave = new Ave(nombre, edad, sexo, raza);
                        aves.add(ave);
                        System.out.println(nombre + " fue agregado exitosamente!");
                        break;

                    default:
                        System.out.println("Tipo de animal no válido.");


                }


            } else if (agregar == 2) {
                System.out.println("Hasta luego!");
                seguirAgregando = false; //salgo del bucle del while

            } else {
                System.out.println("Opcion incorrecta, intente nuevamente.");
            }
        }
    }
}

