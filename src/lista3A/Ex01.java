package lista3A;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numA = input.nextInt();

        System.out.println("Digite o segundo numero");
        int numb = input.nextInt();

        input.close();

        if(numA > numb){
            System.out.println("O maior numero é :" +numA);
        }else {
            System.out.println("O maior numero é : " +numb);
        }

    }
}
