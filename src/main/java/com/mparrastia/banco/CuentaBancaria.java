package com.mparrastia.banco;

public abstract class CuentaBancaria {
private String titularDeCuenta;
private TipoDeCuenta tipoDeCuenta;
protected double saldoCuenta;
private final double COMISION = 1.2;

public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
        this.titularDeCuenta = titularDeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldoCuenta = saldoCuenta;
    }

public CuentaBancaria(String titularDeCuenta, double saldoCuenta){
        this(titularDeCuenta, TipoDeCuenta.AHORRO, saldoCuenta);
    }

public CuentaBancaria(){
        this("", TipoDeCuenta.AHORRO, 0);
    }

public void retirarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldoCuenta-= cantidad;
    }

public void ingresarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldoCuenta += cantidad;
    }

public void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
    tipoDeCuenta = nuevoTipo;
}

public double obtenerSaldo() {
        return saldoCuenta;
    }

    public abstract void informarSobreCondicionesLegales();

}