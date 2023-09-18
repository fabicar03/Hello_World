import java.util.Scanner;

public class Actividad1_19 {
    public static void main(String[] args){
        double niño = 15.50;
        double adulto = 20;
        double multi1 = 0;
        double multi2 = 0;
        double total = 0;
        double descuento = 5;

        Scanner sc = new Scanner(System.in);

        System.out.println("cuantas entradas infantiles ");
        multi1 = sc.nextDouble();
        niño = niño * multi1;

        System.out.println("entradas adultos");
        multi2 = sc.nextDouble();
        adulto = adulto * multi2;


        total= niño + adulto;

        if (total >= 100){
            total = total - descuento;
            System.out.println("Total a pagar es: " + total);
        }else{
            System.out.println(total );
        }

    }
}
