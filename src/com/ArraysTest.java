
package com;

import java.util.Arrays;

/**
 *
 * @author cice
 */
public class ArraysTest {
    static int [] arrayNumeros ={1,2};
    
    public static void main (String...arg){
        
        arrayNumeros = new int []{1, 2, 3, 4};
        arrayNumeros [0] =2;
        
        //int nombreArray [] = {1,2,3}; // compila
        int [] nombreArray = {1,2,3}; // es igual 
       // int numeros [] = new int [4];
       // numeros [4] = 4;
       // te copia el tamaño de un array en otro
        int [] nuevo = Arrays.copyOf(nombreArray, 12);
        
        for (int i : nuevo){
            System.out.println("valor " + i); 
            
            
        }
        
        // bidimensional
        
        int [][] bidi = new int [2][4];
        
        /*
        
        [  [1,2,3,4] , [1,3,5,3]    ]
        
             
        */
        
        
        int [] bi[] = new int [2][];
        bi [0] = new int []{1,2,3};
        bi [1] = new int []{1,2,3,4,6,7,9};
        System.out.println("\n");
         for (int [] is : bi){
              System.out.println("--------");
             for (int i : is){
                 
                 System.out.println("valor " + i); 
             }
           
            
            
        }
        
    }
    
    
}
