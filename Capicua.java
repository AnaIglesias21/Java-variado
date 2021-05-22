/*
 * Programa que pide un número por teclado y comprueba si es capicúa.
 */
package capicua;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Capicua {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        int numero;
        String num;
        
        numero = pedirNumero();
        //pasamos el número a String para comparar sus digitos
        num = String.valueOf(numero);
        
        //si el número tiene más de un dígito vemos si es capicúa
        if (num.length()>1){
            
            if (esCapicua(num)){
                System.out.println("El número "+numero+" es capicúa");
            }else{
                System.out.println("El número "+numero+" no es capicúa");
            }
            
        }else{
            
            System.out.println("Se ha introducido un número de un solo dígito");
        }
        
        entrada.close();
    }

    private static int pedirNumero() {
        int n = 0;
       
        do{
            System.out.print("Número: ");
            
            if (entrada.hasNextInt()){
                n = entrada.nextInt();
                
                if (n<0){//verificamos que el número sea positivo
                    
                    //si el número es menos que cero se lo indicamos al usuario
                    System.out.println("Debes introducir un número mayor a cero.");
                    n = 0;
                   
                }   
                
            }else{
                
                System.out.println("Error. Dato no numérico");
                entrada.next();//limpiamos el buffer de entrada de datos
                
            }
            
        }while(n==0);
        
        return n;
    }
    //Método que evalúa si un número es capicúa
    private static boolean esCapicua(String num) {
        int puntoMedio = num.length()/2;
          
        for (int i=0;i<puntoMedio;i++){
            if (num.charAt(i)!=num.charAt((num.length()-1)-i)){
                return false;
            }
        }
      
        return true;
    }
    
}
