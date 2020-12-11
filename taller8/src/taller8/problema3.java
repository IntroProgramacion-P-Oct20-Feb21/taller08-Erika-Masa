/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8;

/**
 *
 * @author Smart
 */
import java.util.Scanner;
public class problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        //declaro variables 
        int n ;
        double suma = 0;
        double numerador;
        double denominador;
        System.out.println("ingrese un numero");
        n = entrada.nextInt();
        if (n > 0){
        for (int i = 1; i <= n; i++) {
            //n = 1
            numerador = 1 ;
             //i=1
            denominador = Math.pow(2, i);
            suma = suma + (numerador/denominador);
         
        }
        
         }else{
         System.out.println("usted a ingresado un valor positivo ");   
         }
        // presentando en pantalla
        System.out.printf("Valor de la sumatoria %.4f\n", suma);
    
    
    
    
    
    }
 }   
