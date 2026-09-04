import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante =
                new Estudiante(nombre, carrera, edad);

        estudiante.mostrarInformacion();

        if (edad >= 18) {
            System.out.println("Acceso autorizado.");
        } else {
            System.out.println("Acceso restringido.");
        }

        if (edad < 18) {
            System.out.println("Clasificación: menor de edad.");
        } else if (edad < 25) {
            System.out.println("Clasificación: estudiante joven.");
        } else {
            System.out.println("Clasificación: estudiante adulto.");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Verificación " + i);
        }
        
        int opcion = -1;

        while (opcion !=0) {

            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Sistema operativo.");
            } else if (opcion == 2) {
                System.out.println("Procesando operación...");
            } else if (opcion == 0) {
                System.out.println("Cerrando sistema...");
            }
        }
    }
}