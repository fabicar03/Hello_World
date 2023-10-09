import java.util.Scanner;
public class Actividad2_3 {

    public static void main(String[] args){
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero: ");
        a = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        b= sc.nextInt();

        System.out.println("Los numeros son: " + ((a !=b) || (a== 0)));
    }
}
