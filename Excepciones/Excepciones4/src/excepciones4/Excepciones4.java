
package excepciones4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepciones4 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int num;
        try {
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException e) {
            System.out.println("No es con letras >:v");
        }
    }
    
}
