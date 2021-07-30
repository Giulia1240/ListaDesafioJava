import java.io.IOException;
import java.util.Scanner;

public class ARespostaDeTheon {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int[] T1 = new int[N];
        int menor = 2, posMenor = 1;

        for (int i = 1; i < N; i++) {

            T1[i] = leitor.nextInt();

            if (i == 0) {
                menor = T1[i];
                posMenor = i++;
            }

            else if (T1[i] < menor) {

                menor = T1[i];
                posMenor = i;
            }
        }
        System.out.println( posMenor);
    }
}
