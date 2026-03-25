import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         int num = entrada.nextInt();

         int sequencia = 1;
         while (num >= sequencia) {
             System.out.println(sequencia);
             sequencia = sequencia * 2;

         }
    }
}
