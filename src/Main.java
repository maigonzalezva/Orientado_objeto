import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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