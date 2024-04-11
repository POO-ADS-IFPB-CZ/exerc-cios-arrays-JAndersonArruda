import java.util.Scanner;

public class Solicitacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sequecencia[] = {0, 0};

        int quantidade = -1;
        int soma = 0;
        do {
            System.out.printf("Informe um número inteiro: ");
            sequecencia[1] = scan.nextInt();
            scan.nextLine();

            quantidade ++;
            soma += sequecencia[0];
            sequecencia[0] = sequecencia[1];
        } while (sequecencia[0] >= 0);

        System.out.println(soma / quantidade);
    }
}
