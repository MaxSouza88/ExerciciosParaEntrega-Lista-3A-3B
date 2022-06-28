package lista3B;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Repetição usando o for");

        for (int count = 1; count <= 100; count++) {
            System.out.println(count);
        }
        System.out.println("Repetição usando while");
        int contador = 1;
        while (contador <= 100) {
            System.out.println(contador);
            contador++;

        }
    }
}