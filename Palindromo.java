/*
 * Programa que verifica si una palabra o frase es palíndromo.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Palindromo {

    static Scanner entrada  = new Scanner(System.in);
    
    public static void main(String[] args) {
        String string;
        
        string = pedirFrase();
        System.out.println("Frase/palabra: "+string.trim());
        if (esPalindromo(string.trim())){
            System.out.println("'"+string+"' es palíndromo");
        }else{
            System.out.println("'"+string+"' no es palíndromo");
        }
        
        entrada.close();
    }

    private static String pedirFrase() {
        String frase = "";
        
        do{
            System.out.print("Palabra o frase: ");
            frase = entrada.nextLine();
            
            if (frase.isEmpty()){
                System.out.println("Debes introducir una palabra o una frase");
                frase = "";
            }
            
        }while(frase.isEmpty());
        
        return frase;
    }

    private static boolean esPalindromo(String string) {
        String fraseReves = "";
        
        for (int i=(string.length()-1);i>=0;i--){
            fraseReves += string.charAt(i);
        }
        System.out.println("Frase al reves: "+fraseReves);
        if (!fraseReves.equalsIgnoreCase(string)){
            return false; 
        }
        
        return true;
    }
    
}
