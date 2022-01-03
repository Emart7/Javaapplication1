package com.mparrastia.cajero;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Por favor, ingrese su numero de documento: ");
        Scanner scanner = new Scanner(System.in);
        String numeroDeIdentificacion = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(numeroDeIdentificacion, contraseña);

        int opcionSeleccionada;
        do {
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1. Consultar su saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Consultar sus ultimos movimientos.");
            System.out.println("5. Consultar las condiciones legales.");
            System.out.println("Para Salir escriba cualquier otro numero.");
            System.out.println("Una vez escriba su opcion, pulse la tecla enter.");
            System.out.println("Ingrese su opcion: ");

            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.retirarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCOndicionesLegales();
                default:
                    cajero.salir();
            }

        }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4 || opcionSeleccionada == 5);

    }
}
