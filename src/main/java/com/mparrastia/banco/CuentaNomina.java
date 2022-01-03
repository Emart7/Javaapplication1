package com.mparrastia.banco;

public class CuentaNomina extends CuentaBancaria{

    public CuentaNomina(String titular, TipoDeCuenta tipo, double saldo){
        super(titular,tipo,saldo);
    }

    public CuentaNomina(String titularDeCuenta, double saldoCuenta){
        super(titularDeCuenta, saldoCuenta);
    }

    public CuentaNomina(){
        super();
    }

    @Override
    public void informarSobreCondicionesLegales(){
        System.out.println("Condiciones legales de la cuenta de ahorro ***");
        System.out.println("Segun el acuerdo firmado por usted...");
        System.out.println("Mientras se mantengan las condiciones...");
    }
}
