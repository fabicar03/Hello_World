import java.util.Scanner;

public class Actividad2_5 {
    public static void main(String[] arg){
        double aforo = 0;
        double precio = 0;
        double entrada = 0;
        double porcentaje = 0;
        double descuento = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Aforo Máximo del local: ");
        aforo = sc.nextDouble();

        System.out.println("Precio por entrada: ");
        precio = sc.nextDouble();

        System.out.println("Numero de entradas vendidas: ");
        entrada = sc.nextDouble();

        porcentaje = (100*entrada)/aforo;
        descuento = 0.25 * precio;


        if ( porcentaje <= 20){
            System.out.println("Se Cancela el concierto");
        }else{
            if (porcentaje <= 50){
                System.out.println("Recaudacion por aforo menor al 50% es: "+ descuento * entrada);
            }else{
                System.out.println("Recaudacion total por aforo superior al 50% es :" + precio*entrada);
            }
        }
    }
}
