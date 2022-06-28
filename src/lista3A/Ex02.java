package lista3A;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto");
        double primeiroProduto = input.nextDouble();

        System.out.println("Digite o preço do segundo produto");
        double segundoProduto = input.nextDouble();

        System.out.println("Digite o preço do terceiro produto");
        double terceiroProduto = input.nextDouble();

        input.close();

        if((primeiroProduto < segundoProduto) && (primeiroProduto < terceiroProduto)){
            System.out.println("Voce deverá comprar o produto de menor valor, que é : " +primeiroProduto);
        } else if ((segundoProduto < primeiroProduto) && (segundoProduto < terceiroProduto)) {
            System.out.println("Voce deverá comprar o produto de menor valor, que é : " +segundoProduto);
        } else if ((terceiroProduto < primeiroProduto ) && (terceiroProduto < segundoProduto)){
            System.out.println("Voce deverá comprar o produto de menor valor, que é : " +terceiroProduto);
        }

    }
}
