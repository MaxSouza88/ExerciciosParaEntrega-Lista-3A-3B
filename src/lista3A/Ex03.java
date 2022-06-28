package lista3A;

import java.util.Scanner;

public class Ex03 {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Digite a primeira Nota");
                double primeiraNota = input.nextDouble();

                System.out.println("Digite a segunda Nota");
                double segundaNota = input.nextDouble();

                input.close();

                double media = (primeiraNota + segundaNota) / 2;

                if((media >= 7) && (media<=9)){
                        System.out.println("Aprovado");
                } else if (media <7) {
                        System.out.println("Reprovado");
                } else if (media == 10) {
                        System.out.println("Aprovado com Distinção");
                }
        }
}
