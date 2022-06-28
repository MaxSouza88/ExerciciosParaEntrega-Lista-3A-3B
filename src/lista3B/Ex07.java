package lista3B;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero a ser verificado: ");
        int numA = input.nextInt();

        input.close();
        boolean verificarPrimo = true;

        for (int i=2;i<numA;i++){

            if(numA %i == 0 ){

                verificarPrimo = false;

                break;
            }
        }
        if(verificarPrimo){
            System.out.println("O número digitado é um número primo");
        }
        else {
            System.out.println("O número digitado não é um número primo");
        }
    }
}