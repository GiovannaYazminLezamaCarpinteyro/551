package poo;
//4 POO
import java.util.Scanner;
import v4.V4;
public class POO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero");
        num=sc.nextInt();
        System.out.println(V4.condicion(num));
    }
    
}
