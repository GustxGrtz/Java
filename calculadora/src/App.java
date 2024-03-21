import java.util.Scanner;
import java.lang.Math;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2, resultado;
        Boolean menu = true;
        int opcao;

        while (menu) {
            System.out.println(
                    "escolha uma das ações \n" +
                            "1 - soma \n" +
                            "2 - subtração \n" +
                            "3 - multiplicação \n" +
                            "4 - divisão \n" +
                            "5 - potenciação \n" +
                            "6 - fatoração \n" +
                            "0 - sair \n");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 + valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 2:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 - valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 * valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 4:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = valor1 / valor2;
                    System.out.println("resultado: " + resultado);
                    break;
                case 5:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    System.out.println("digite o valor 2: ");
                    valor2 = entrada.nextDouble();

                    if (valor1 < 0 || valor1 > 50 || valor2 < 0 || valor2 > 50) {
                        break;
                    }
                    resultado = Math.pow(valor1, valor2);
                    System.out.println("resultado: " + resultado);
                    break;
                case 6:
                    System.out.println("digite o valor 1: ");
                    valor1 = entrada.nextDouble();
                    if (valor1 < 0 || valor1 > 50) {
                        System.out.println("valor invalido.");
                        continue;
                    }
                    resultado = 1;
                    for (int i = 2; i <= valor1; i++) {
                        if (valor1 % i == 0) {
                            resultado *= i;
                            valor1 /= i;
                        }
                    }
                    System.out.println("resultado: " + (valor1));
                    break;
                case 0:
                    menu = false;
                default:
                    System.out.println("digite um valor correto");
                    break;

            }
        }
    }
}