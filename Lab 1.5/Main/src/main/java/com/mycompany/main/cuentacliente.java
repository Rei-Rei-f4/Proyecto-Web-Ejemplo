/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author reiko
 */
public class cuentacliente {
    private final String nombre;
    private final String cedula;
    private final String cuentaCliente;
    private double saldoInicial;

    public cuentacliente (String nombre, String cedula, String cuentaCliente, double saldoInicial) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuentaCliente = cuentaCliente;
        this.saldoInicial = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldoInicial += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldoInicial >= monto) {
            saldoInicial -= monto;
        }
    }

    public double calcularSaldo() {
        return saldoInicial;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Cuenta Cliente: " + cuentaCliente);
        System.out.println("Saldo Inicial: " + saldoInicial);
    }
}
