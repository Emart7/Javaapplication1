import java.util.Scanner;

//Programa que emula la interfaz de un cajero automatico

public class Interfaz {
    public static void main(String[] args) {
        int opcionSeleccionada;
        do {
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Consultar su saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Consultar sus ultimos movimientos");
        System.out.println("Para Salir escriba cualquier otro numero.");
        System.out.println("Una vez escriba su opcion, pulse la tecla enter.");
        System.out.println("Ingrese su opcion: ");

        Scanner scanner = new Scanner(System.in);
        opcionSeleccionada = scanner.nextInt();

        switch (opcionSeleccionada){
            case 1:
                System.out.println("Usted ha seleccionado es Consultar saldo.");
                break;
            case 2:
                System.out.println("Usted ha seleccionado es Ingresar dinero.");
                break;
            case 3:
                System.out.println("Usted ha seleccionado es Retirar saldo.");
                break;
            case 4:
                System.out.println("Usted ha seleccionado es Ultimos movimientos.");
                break;
            default:
                System.out.println("Muchas gracias por usar el servicio.");
        }

        }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);

    }
}
