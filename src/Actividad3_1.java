import java.util.Scanner;

public class Actividad3_1 {

    public static void main(String[] arg) {
        int edad ;
        int menor = Integer.MAX_VALUE;
        int mayor = 0;
        boolean fin = false;


        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la/s Edad/es de los alumnos: ");


        while (!fin) {
            edad = sc.nextInt();
            if (edad == -1){
                fin = true;
            }else {
                if (edad > mayor) {
                    mayor = edad;
                }
                if (edad < menor) {
                    menor = edad;
                }
            }
        }
        System.out.println("La edad mayor es: " + mayor);
        System.out.println("La edad menor es: " + menor);
    }
}