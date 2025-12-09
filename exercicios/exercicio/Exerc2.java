import java.util.Scanner;

public class Exerc2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que você deseja visualizar a tabuada: ");
        var numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            var resultado = numero * i;
            System.out.printf("O número %s múltiplicado por %s é %s\n", numero, i, resultado);
        };
    }
}