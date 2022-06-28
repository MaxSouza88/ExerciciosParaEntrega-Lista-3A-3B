package lista3A;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por gentileza informe o salário a ser calculado");
        double salarioMensal = input.nextDouble();

        input.close();

        if (salarioMensal <= 280) {
            double reajuste = salarioMensal * 0.2;
            double calculoSalario =  reajuste + salarioMensal;
            System.out.println("Salario antes do reajuste: " + salarioMensal);
            System.out.println("O Salário do colaborador com reajuste de 20% é de : " + calculoSalario);
        } else if ((salarioMensal > 280) && (salarioMensal <= 700)) {
            double reajuste = salarioMensal * 0.15;
            double calculoSalario =  reajuste + salarioMensal;
            System.out.println("Salario antes do reajuste: " + salarioMensal);
            System.out.println("O Salário do colaborador com reajuste de 15% é de : " + calculoSalario);
        } else if ((salarioMensal > 700) && (salarioMensal <= 1500)) {
            double reajuste = salarioMensal * 0.1;
            double calculoSalario =  reajuste + salarioMensal;
            System.out.println("Salario antes do reajuste: " + salarioMensal);
            System.out.println("O Salário do colaborador com reajuste de 10% é de : " + calculoSalario);
        } else if (salarioMensal > 1500) {
            double reajuste = salarioMensal * 0.05;
            double calculoSalario =  reajuste + salarioMensal;
            System.out.println("Salario antes do reajuste: " + salarioMensal);
            System.out.println("O Salário do colaborador com reajuste de 5% é de : " + calculoSalario);
        }
    }
}