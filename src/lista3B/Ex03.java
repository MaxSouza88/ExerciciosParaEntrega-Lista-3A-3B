package lista3B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        int quantidadeDeNumeros = 10;
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            int n = i+1;
            System.out.println("Digite o número: " +n+ "º numero" );
            Scanner input = new Scanner(System.in);
            numeros.add(input.nextInt());
        }

        int maiorNumero = 0;
        int menorNumero = Integer.MAX_VALUE;

        for (int i = 0; i < quantidadeDeNumeros; i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            } else if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
        System.out.println(" O maior número é: " +maiorNumero);
        System.out.println("O menor numero é: " +menorNumero);

    }
}

