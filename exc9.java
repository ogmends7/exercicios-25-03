import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        char continuar = 's';

        while (continuar == 's') {

            int codigo = entrada.nextInt();
            int quantidade = entrada.nextInt();

            double valor = 0;

            if (codigo == 100) valor = 1.20;
            else if (codigo == 101) valor = 1.30;
            else if (codigo == 102) valor = 1.50;
            else if (codigo == 103) valor = 1.20;
            else if (codigo == 104) valor = 1.30;
            else if (codigo == 105) valor = 1.00;

            double totalProduto = valor * quantidade;
            total += totalProduto;

            System.out.println(totalProduto);

            continuar = entrada.next().charAt(0);
        }

        System.out.println(total);
    }
}