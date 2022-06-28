package lista3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de números para media: ");
        int quantNum = input.nextInt();

        int media = 0;
        int soma = 0;

        for (int i = 0; i<quantNum; i++){

            int n = i+1;

            System.out.println("Digite o " +n+ "º numero");
            int valor = input.nextInt();

            soma = soma + valor;

        }
        media = soma / quantNum;

        System.out.println("A media dos numeros é: " +media);

    }
}