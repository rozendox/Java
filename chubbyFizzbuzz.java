import java.util.Scanner;

public class SomaSubtrai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        
        if (a % 2 == 0 && b % 2 == 0) {
            int soma = a + b;
            System.out.println("A soma dos números é: " + soma);
            System.out.println("chubby");
        } else {
            int subtracao = a - b;
            if (subtracao == 0) {
                System.out.println("fizz");
            } else if (subtracao < 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println("A subtração dos números é: " + subtracao);
            }
        }
        sc.close();
    }
}
