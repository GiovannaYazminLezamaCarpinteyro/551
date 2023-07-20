
package excepciones5;
import java.util.*;

public class Excepciones5 {

    
    public static void main(String[] args) {
        double n1,n2,resultado;
         Scanner lectura=new Scanner(System.in);
         try {         
            System.out.println("Introduce el primer número");
            n1=lectura.nextDouble();
             
            System.out.println("Introduce el segundo número");
            n2=lectura.nextDouble();            
            resultado=n1/n2;
             
            System.out.println("El resultado es " + resultado);         
        }
        catch (ArithmeticException e){
            System.out.println("No se puede dividir entre cero");   
        }
        catch (Exception e){
            System.out.println("No es un numero intenta de nuevo"); 
        }
        finally {
             System.out.println("");
            lectura.close();
        }
    }
    
}
