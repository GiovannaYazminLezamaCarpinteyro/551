package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] array = {5,2,3,7,9};
    int n, arr = array.length - 1;
    boolean repetir = false;
    do{
         try{
                repetir = false;
                System.out.println("Introduce un número entero entre el 0 y el " + arr + " ");                     
                n = sc.nextInt();
                System.out.println("El valor en la posición " + n + " es " + array[n]);
         }catch(InputMismatchException e){
                   sc.nextLine();
                   n = 0;
                   System.out.println(" ** Debe introducir un número entero ** ");
                   repetir = true;
                   
         }catch(IndexOutOfBoundsException e){
                  System.out.println(" ** Debe introducir un número entre el 0 y el " + arr + " ** ");           
                  repetir = true;
         }
     }while(repetir);
    }
    
}
