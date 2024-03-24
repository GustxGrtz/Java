import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int[] num = new int[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite 10 numeros");

        for(int cont = 0; cont < 10; cont++){
            System.out.println("\n");
            num[cont] = entrada.nextInt();

        }

       System.out.println("numeros digitados: \n");
       
       for(int cont = 9; cont >= 0; cont--){
        System.out.println(num[cont]);
        }
    }
}
