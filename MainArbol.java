
import java.util.Scanner;

public class MainArbol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insertar numero");
            System.out.println("2. Mostrar inorden");
            System.out.println("3. Buscar numero");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese numero: ");
                    int num = sc.nextInt();
                    arbol.insertar(num);
                    break;

                case 2:
                    System.out.println("Recorrido inorden:");
                    arbol.inorden();
                    break;

                case 3:
                    System.out.print("Numero a buscar: ");
                    int buscar = sc.nextInt();

                    if (arbol.buscar(buscar)) {
                        System.out.println("El numero SI existe");
                    } else {
                        System.out.println("El numero NO existe");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 4);

        sc.close();
    }
}