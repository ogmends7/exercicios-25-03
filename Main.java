//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor = 999999;

        while (contador <= 10) {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número é: " + menor);
    }
}