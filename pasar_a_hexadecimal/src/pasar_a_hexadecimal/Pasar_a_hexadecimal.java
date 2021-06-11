/*
 * Implemente un programa que lea un número decimal y lo muestre en pantalla en
 * hexadecimal (base 16)
 */
package pasar_a_hexadecimal;

import java.util.Scanner;

/**
 *
 * @author anaig
 */
public class Pasar_a_hexadecimal {
    
    static Scanner entrada = new Scanner(System.in);
    static char[] hexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    
    public static void main(String[] args) {
        int num;
        String numHexa;
        
        num = pedirNumero();//pedimos un número por teclado
       
        System.out.println("Número: "+num+" en hexadecimal es: "+pasarHex("",num));
        
        entrada.close();
    }
    //Método que pide un número por teclado
    private static int pedirNumero() {
        int n = 0;
        
        do{
            System.out.print("Número: ");
            if(entrada.hasNextInt()){
                n = entrada.nextInt();
                
                if (n<0){
                    System.out.println("Debes introducir un número mayor a cero");
                    n = 0;
                }
            }else{
                System.out.println("Error. No se ha introducido un dato numérico");
                n = 0;
                entrada.next();
            }
        }while(n==0);
        return n;
    }
    //Método que calcula el valor de un número en hexadecimal
    private static String pasarHex(String hex,int cociente) {
        String aux = "";
        
        while(cociente>=16){
          
            hex += hexadecimal[cociente%16];//obtnemos el resto
            
            cociente = cociente/16;//obtenemos el cociente
            
            pasarHex(hex,cociente);//llamada recursiva
        }
            
        hex += hexadecimal[cociente];//obtenemos el último valor
        
        //damos la vuelta al número hexadecimal
        
        for (int i=hex.length()-1;i>=0;i--){
            aux += hex.charAt(i);
        }
        
        return aux;
    }

}
