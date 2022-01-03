package com.mparrastia.banco;

import java.nio.file.Paths;

public class CuentaAhorro extends CuentaBancaria{

    private final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipo, double saldo){
        super(titular,TipoDeCuenta.AHORRO,saldo);
    }

    public CuentaAhorro(String titularDeCuenta, double saldoCuenta){
        super(titularDeCuenta, saldoCuenta);
    }

    public CuentaAhorro(){
        super();
    }

    @Override
    public void retirarDinero(double cantidad){
        if (cantidad < 0) {
            return;
        }
        saldoCuenta -= cantidad;
        saldoCuenta -= COMISION;
    }

    @Override
    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales de la cuenta de ahorro ***");
        System.out.println("Segun el acuerdo firmado por usted...");
        System.out.println("Las condiciones por retirada de dinero de su cuenta..." + COMISION + " euros.");
    }
}
