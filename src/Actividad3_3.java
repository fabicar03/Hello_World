import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args){
        int numero = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce numeros positivos: ");
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("Los numeros no son positivos");
        }else {
            String numletras = Integer.toString(numero);

            for (int i = numletras.length() - 1; i >= 0; i --) {
                char guarismo = numletras.charAt(i);
                System.out.println(guarismo);
            }
        }
    }
}
