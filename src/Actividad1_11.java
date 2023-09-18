import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args){
        double base = 0;
        double iva ;
        double total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la Base imponible: ");
        base = sc.nextDouble();

        System.out.println("Introduce el IVA: ");
        iva = sc.nextDouble();
        iva = iva / 100;

        total = base * iva;

        System.out.println("IVA correspondiente: " + (total) + " total a pagar: " + (base+total));
    }

}
