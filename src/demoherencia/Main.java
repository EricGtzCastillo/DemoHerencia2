/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

import java.util.Scanner;

/**
 *
 * @author Eric Gtz Castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a BANTEC");
        System.out.println("Acción que desea realizar: ");
        System.out.println("1 = CuentaBancaria de Eric");
        System.out.println("2 = CuentaDeAhorro de Eric");
        System.out.println("3 = CuentaDeCheques de Eric");
        System.out.println("4 = Infarmacion del Cliente");
        int Cuenta= entrada.nextInt();
            
        
        if (Cuenta == 1){    
        CuentaBancaria misAhorros = new CuentaBancaria(1,"Eric1");
        System.out.println("saldo:" + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(1500.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(200);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(300);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(1000);
        System.out.println("saldo:"+ misAhorros.getSaldo());  
        }
        
        if(Cuenta == 2){
        CuentaDeAhorro miCuentaDeAhorro = new CuentaDeAhorro(2, "Eric2");
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.depositar(1000.0);
        System.out.println("Saldo" + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.retirar(200.0);
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo());
        miCuentaDeAhorro.retirar(1000.0);
        System.out.println("Saldo: " + miCuentaDeAhorro.getSaldo);
        }
        
        if (Cuenta == 3){    
        CuentaDeCheques miCuentaDeCheques = new CuentaDeCheques(3, "Eric3");
        System.out.println("Saldo cuenta de cheques: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.depositar (1000.0);
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.retirar(2000.0);
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
        miCuentaDeCheques.retirar(100.0);
        System.out.println ("Saldo: " + miCuentaDeCheques.getSaldo());
       }
        
        if (Cuenta == 4){
     
        
       }
        
    }
}   
