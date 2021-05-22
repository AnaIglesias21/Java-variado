package encuentrastring;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class EncuentraString {

    static Scanner entrada = new Scanner(System.in);
    static int x = 10;
    
    public static void main(String[] args) {
        
        String frase = pedirFrase("Frase: ");
        System.out.println("Frase introducida: '"+frase+"'");
        String cadena_a_buscar = pedirFrase("Cadena a buscar: ");
        
        if (frase.contains(cadena_a_buscar)){
        
            System.out.println("Cadena "+ cadena_a_buscar+" encontrada en la frase: "+frase);
            int indice = frase.indexOf(cadena_a_buscar);
            System.out.println("comienza en posición: "+ indice);
            System.out.println(frase.substring(indice));
            System.out.println(frase.substring(indice, indice+cadena_a_buscar.length()));
            
        }else{
            System.out.println("Cadena "+ cadena_a_buscar+" no encontrada en la frase "+frase);
        }
        
       for (int x=0;x<5;x++){
           System.out.println(x);
       }
        
        entrada.close();
    }

    private static String pedirFrase(String dato) {
        String frase = "";
        
        do{
            System.out.print(dato);
            frase = entrada.nextLine();
            if (!frase.matches("[\\D]+")){
                System.out.println(dato+" errónea. No puede estar vacía ni contener dígitos");
                frase = "";
            }
        }while(frase.isEmpty());
        
        return frase;
    }
    
}
