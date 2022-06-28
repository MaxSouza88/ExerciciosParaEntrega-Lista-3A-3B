package lista3B;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numA = 0;
        int numB = 0;

        System.out.println("Digite o inicio do intervalo");
        numA = input.nextInt();

        System.out.println("Digite o fim do intervalo");
        numB = input.nextInt();

        input.close();

        int soma = 0;
        if ((numA <= 0) || (numB <= numA)) {
            System.out.println("Não é permitido numero negativo ou zero");
        } else if (numA > numB) {
            System.out.println("O inicio do intervalo precisa ser o menor número");
        } else {

            for (int i = numA; i <= numB; i++) {
                if (i % 2 > 0)
                    soma = soma + i;
            }
            System.out.println("A soma dos numeros impares é: " + soma);
        }

    }
}
