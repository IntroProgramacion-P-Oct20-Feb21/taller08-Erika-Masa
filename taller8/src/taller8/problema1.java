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
public class problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarar variables
           String palabra =  " Universidad " ;
        char letras ;
        //lee cuantas letras ahi en la cadena 
        for ( int i =  1 ; i < palabra . length (); i ++ ) {          
            letras =   palabra . charAt (i);//universidad.charAt(0) >> u
                                      // Universidad.charAt(1) >> n
                                      // Universidad.charAt(2) >> i
                                      // Universidad.charAt(3) >> v
                                      // Universidad.charAt(4) >> e
                                      // Universidad.charAt(5) >> r
                                      // Universidad.charAt(6) >> s
                                      // Universidad.charAt(7) >> i
                                      // Universidad.charAt(8) >> d
                                      // Universidad.charAt(9) >> a
                                      // Universidad.charAt(10) >> d
            //separa las letras hacia abajo  
            for ( int a =  1 ; a <= i; a ++ ) {
                //presentando la letra con su posicion 
                 System.out.printf ( "%s" , letras); //nn
                                                    //iii
                                                    //vvvv
                                                    //eeeee
                                                    //rrrrrr
                                                    //sssssss
                                                    //iiiiiiii
                                                    //ddddddddd
                                                    //aaaaaaaaaa
                                                    //ddddddddddd
                 

            }
            //presentar en pantalla 
            System.out.println();
        }
    }

}
    
    
    

