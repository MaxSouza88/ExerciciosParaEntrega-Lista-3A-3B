package lista3A;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero desejado correspondente ao Dia da Semana (1-Domingo, 2- Segunda, etc.)");
        int diaDaSemana = input.nextInt();

        input.close();

        switch (diaDaSemana){
            case 1:
                System.out.println("Dia correspondente é Domingo");
                break;
            case 2:
                System.out.println("Dia correspondente é Segunda");
                break;
            case 3:
                System.out.println("Dia correspondente é Terça");
                break;
            case 4:
                System.out.println("Dia correspondente é Quarta");
                break;
            case 5:
                System.out.println("Dia correspondente é Quinta");
                break;
            case 6:
                System.out.println("Dia correspondente é Sexta");
                break;
            case 7:
                System.out.println("Dia correspondente é Sábado");
                break;
            default:
                System.out.println("Valor digitado inválido");
        }
    }
}
