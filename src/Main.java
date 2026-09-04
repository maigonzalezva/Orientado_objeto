import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        estudiante.mostrarInformacion();

        if (edad >= 18){
            System.out.println("Acceso autorizado. ");
        } else {
            System.out.println("Acceso restringido");
        }


    }
}