import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);
            } catch (Exception e) {
                System.out.println("ocurrio un error" + e.getMessage());
            }
            System.out.println();
        }

    }

    private static void mostrarMenu() {
        System.out.print("""
                ***Listado Personas App
                1. Agregar
                2. Listar
                3. Salir

                """);
        System.out.print("proporcione una opcion: ");
    }

    public static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        int opcion = Integer.parseInt(consola.nextLine());
        switch (opcion) {
            case 1 -> {
                System.out.print("Proporciona el nombre: ");
                String nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                String tel = consola.nextLine();
                System.out.print("Proporciona el email: ");
                String email = consola.nextLine();
                Persona persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                return true;
            }
            default -> {
                System.out.println("Opcion erronea: " + opcion);
            }
        }
        return false;
    }
}
