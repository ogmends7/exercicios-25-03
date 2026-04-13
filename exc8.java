import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {

            double nota1, nota2;

            do {
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println(media);

            i++;
        }
    }
}