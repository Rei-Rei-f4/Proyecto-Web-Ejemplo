/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
//cuenta bancaria

import java.util.Scanner;

/**
 *
 * @author reiko
 */
public class Main {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingrese cuenta cliente: ");
        String cuentaCliente = scanner.nextLine();

        System.out.print("Ingrese saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        cuentacliente c = new cuentacliente(nombre, cedula, cuentaCliente, saldoInicial);

        c.mostrar();

        System.out.print("Ingrese monto a depositar: ");
        double deposito = scanner.nextDouble();
        c.depositar(deposito);
        System.out.println("Saldo después del depósito: " + c.calcularSaldo());

        System.out.print("Ingrese monto a retirar: ");
        double retiro = scanner.nextDouble();
        c.retirar(retiro);
        System.out.println("Saldo después del retiro: " + c.calcularSaldo());
}
}
 