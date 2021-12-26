import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Consultar su saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Consultar sus ultimos movimientos");
        System.out.println("");
        System.out.println("Ingrese su opcion: ");

        Scanner sc = new Scanner(System.in);
        int opcionSeleccionada = sc.nextInt();
        System.out.println("Ha seleccionado la opcion: " + opcionSeleccionada);
    }
}
