/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizrecursiva;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class MatrizRecursiva {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        int [][] matriz;
        
        System.out.println("La salida por pantalla está formateada hasta un máximo de 15 filas, por lo "
                + "\nse recomienda no introducir un número mayor de 15. Gracias ");
        numero = pedirNumero();
        matriz  = new int[numero][numero];
        
        for (int fila = 0; fila<numero; fila++){
            
            for (int column = 0; column<numero; column ++){
              
               matriz [fila][column] = valor(fila,column);
               
               if (numero <= 7)
                  
                   System.out.printf("%4d",matriz[fila][column]);
               
               if (numero>7 && numero < 16)
                   
                   System.out.printf("%9d",matriz[fila][column]); 
               
            }
            
            System.out.println();
        }
        
        entrada.close();
    }
    
    public static int valor(int i, int j){
        if (i == 0)
            return 1;
        if (j == 0)
            return 1;
        return valor(i,j-1)+valor(i-1,j);//Llamada recursiva
    }

    private static int pedirNumero() {
        int n = 0;
        
        do{
            System.out.print("Número de Filas y columnas: "); 
            if (entrada.hasNextInt()){
                n = entrada.nextInt();
                
                if (n<0){
                    System.out.println("Error. Número negativo");
                    n = 0;
                }
                
            }else{
                System.out.println("Error. No se ha introducido un número");
                entrada.next();
                n = 0;
            }
            
        }while (n==0);
        
        return n;
    }
    
}
