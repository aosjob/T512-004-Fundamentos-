package com;

/**
 *
 * @author cice
 */
public class cice {

    public static void main(String[] args) {
        // operadores de asignacion
        boolean esMayor = 2 > 4;  //false
        boolean esMenor = 4 < 6;  //true
        boolean esIgual = 4 == 5; //false
        boolean esDistinto = 4!=5;  //true
        
        
        //operadores de asignacion
        int numero = 2;
        //numero++; //numero = numero + 1; numero += 1;
        System.out.println(numero++); //2
        System.out.println(--numero); //2
        System.out.println(++numero); //3
        System.out.println(numero--); //3
        
        numero *= 4 ;  //8
        System.out.println("numero *= 4: " + numero);
        numero /= 2; //4
        System.out.println("numero /= 2: " + numero);
        numero %= 2; //0
        System.out.println("numero %= 2: " + numero);
        numero %= 1; //0
        System.out.println("numero %= 1: " + numero);
        numero %= 3; //0
        System.out.println("numero %= 3: " + numero);
        numero = 3;
        numero <<= 2;
        System.out.println("Desplazamiento: " + numero);
       
         
        
        
    }
    
}
