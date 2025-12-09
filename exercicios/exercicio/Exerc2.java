import java.util.Scanner;

public class Exerc2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que você deseja visualizar a tabuada: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("O número %s múltiplicado por %s é %s\n", numero, i, resultado);
        };

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso/(altura*altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I");
        }  else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (Severa)");
        }  else if (imc >= 40) {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        System.out.println("Digite um número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite outro número (maior que o anterior): ");
        int segundoNumero = sc.nextInt();
        for (int i = (segundoNumero - 1); i > primeiroNumero; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(primeiroNumero);

        System.out.println("Informe um número: ");
        int numero2 = sc.nextInt();
        System.out.println("Informe outro número: ");
        int numero3 = sc.nextInt();
        int resultado = numero2 % numero3;

        while (resultado != 0) {
            System.out.printf("O resultado da divisão de %s por %s não é zero: %s \n", numero2, numero3, resultado);
            System.out.println("Informe outro número: ");
            numero3 = sc.nextInt();
            resultado = numero2 % numero3;
        }
        System.out.printf("O resultado da divisão de %s por %s é zero: %s \n", numero2, numero3, resultado);
    }
}