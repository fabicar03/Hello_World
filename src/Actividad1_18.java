import java.util.Scanner;

public class Actividad1_18 {
    public static void main(String[] args){
        int hormigas = 0;
        int arañas = 0;
        int cochinillas = 0;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de hormigas capturadas: ");
        hormigas = sc.nextInt();
        hormigas = hormigas * 6;

        System.out.println("Numero de arañas capturadas: ");
        arañas = sc.nextInt();
        arañas = arañas * 8;

        System.out.println("Numero de cochinillas capturadas: ");
        cochinillas = sc.nextInt();
        cochinillas = cochinillas * 14;

        total = (hormigas+arañas) + cochinillas;

        System.out.println("Total de patas capturadas: " + total );
    }
}
