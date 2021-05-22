package fibonacci;

import java.util.Scanner;

/**
 *
 * @author AnaIglesias
 */
public class Fibonacci {

    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
       
        int numero;
        
        numero = pedirCanitidad();
        //se genera la serie
        for (int i=0;i<numero;i++){
            System.out.print(fibonacci(i)+ " ");
        }
        
        System.out.println();
        entrada.close();
    }
    
    //Método recursivo
    public static int fibonacci(int num){
        if (num == 0 )
            return 0;
        if (num == 1)
            return 1;
        return fibonacci(num-1) + fibonacci(num-2);//llamada recursiva
    }

    private static int pedirCanitidad() {
        int n = 0;
        
        do{
            System.out.print("\nIntroduce la cantidad de números: ");
            if(entrada.hasNextInt()){
                
                n = entrada.nextInt();
                if (n<0){
                    System.out.println("Error. Número inferior a cero");
                    n = 0;
                }
                
            }else{
               
                System.out.print("\nError de dato");
                entrada.next();
                n = 0;
            }
            
        }while (n==0);
        
        return n;
    }
    
    
}
