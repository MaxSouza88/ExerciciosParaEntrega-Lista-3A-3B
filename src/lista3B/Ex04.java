package lista3B;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite quantos numeros deseja informar para soma");
        int numeros = input.nextInt();

        int soma = 0;

        for (int i = 0; i < numeros; i++) {

            int n = i + 1;

            System.out.println("Digite o " + n + "º numero");
            int numA = input.nextInt();

            input.close();

            if (numA > 0 )  {

                soma = soma + numA;

            } else {
                System.out.println("Numero digitado é inválido");
            }

            System.out.println("A soma dos numeros digitados é : " + soma);

        }
    }
}
