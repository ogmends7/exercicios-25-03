import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1, cont = 0;

        while (i <= 10) {
            double peso = entrada.nextDouble();
            double altura = entrada.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                cont++;
            }

            i++;
        }

        System.out.println(cont);
    }
}