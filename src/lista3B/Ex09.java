package lista3B;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero a ser realizado o cálculo fatorial");
        int numA = input.nextInt();

        input.close();

        int numFat = 1;
        int i = 1;

        while (i<=numA){
            numFat = numFat * i;
            i++;
        }

        System.out.println("O fatorial é: " +numFat);




    }
}
