package com.mparrastia.cajero;
import com.mparrastia.banco.CuentaAhorro;
import com.mparrastia.banco.CuentaBancaria;
import com.mparrastia.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

    //Variable de Instancia
private CuentaBancaria cuentaBancariaActual;

protected CajeroAutomatico(String identificador, String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaAhorro("Nombre Cualquiera", cantidadAleatoria);
    }

protected void mostrarSaldo(){
        System.out.println("Su saldo es: "+ cuentaBancariaActual.obtenerSaldo());
    }

protected void ingresarDinero(){
        System.out.println("Cuanto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }

protected void retirarDinero(){
        System.out.println("Cuanto dinero quiere retirar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.retirarDinero(cantidad);
    }

protected void consultarUltimosMovimientos(){

        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar? ");
        Scanner scanner = new Scanner(System.in);
        int numerosDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numerosDeMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }

private void mostrarMovimientos(ArrayList<String> movimientos){
        for(String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }

protected void mostrarCOndicionesLegales(){
    cuentaBancariaActual.informarSobreCondicionesLegales();
    }

protected void salir(){
        System.out.println("Muchas gracias por usar nuestros servicios...");
    }

}
