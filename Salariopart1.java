import java.util.Scanner;

public class Salariopart1 {

    public static void main(String[] args) {

        double sf;

        Scanner input = new Scanner(System.in);

        System.out.print("Insira as horas que você trabalhou");
        int s = input.nextInt();

        sf = (s * 10.25);

        System.out.format("Você vai receber %f", sf);

        input.close();

    }

}