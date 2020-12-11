/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int n ;
        double suma = 0;
        double numerador;
        double denominador;
        System.out.println("ingrese un numero");
        n = entrada.nextInt();
        if (n > 0){
            for (int i = 0; i <= n; i++) {
                //n= (-1)i^i
            numerador = Math.pow(-1, i) ;
            //i = 2*i +i
            denominador = (2 * i + 1 );
            suma = suma + (numerador/denominador);
                    
        }
        }else{
         System.out.println("usted a ingresado un valor positivo ");   
         }
        //presentacion en pantalla
        System.out.printf("Valor de la sumatoria %.4f\n", suma);
    }
    
}
