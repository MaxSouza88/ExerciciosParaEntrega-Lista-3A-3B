package lista3B;

public class Ex08 {
    public static void main(String[] args) {

        int numA=0;

        for(int i=1;i<=100;i++)
        {
            if(i%2>0)
                numA=numA+i;
        }
        System.out.println("Soma dos 50 primeiros números ímpares " +numA);
        }
    }
