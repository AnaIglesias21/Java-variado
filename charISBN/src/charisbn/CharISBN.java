/*
 * Escriba una función que, a partir de los dígitos de un ISBN, calcule el carácter
 * de control con el que termina todo ISBN.
 */
package charisbn;

import java.util.Scanner;

/**
 *
 * @author anaig
 */
public class CharISBN {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        char control;
        num = pedirNumero();
        control = calcularCaracter(num);
        System.out.println("ISBN: "+num+control);
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

    private static char calcularCaracter(int num) {
        char c = ' ';
        int suma = 0, nu, resultado;
        String numero = String.valueOf(num);
        
        for (int i=0;i<numero.length();i++){
            nu = Integer.parseInt(String.valueOf(numero.charAt(i)));
            suma += nu *(i+1);
        }
        
        resultado = suma%11;
        if (resultado == 10){
            c = 'X';
        }else{
            c = (char)resultado;
        }
        return c;
    }
}
