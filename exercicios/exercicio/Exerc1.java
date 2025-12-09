import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();
        System.out.println("Digite sua idade: ");
        var idade = scanner.nextInt();

        System.out.printf("Olá %s, você tem %s anos. \n", nome, idade);

        System.out.println("Digite o tamanho do lado do quadrado: ");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A área do quadrado com lado de tamanho %scm é %scm2 \n", lado, area);

        System.out.println("Digite o tamanho da base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Digite o tamanho da altura do retângulo: ");
        var altura = scanner.nextInt();
        var areaRetangulo = base * altura;
        System.out.printf("A área do retângulo é %s", areaRetangulo);
    }

}

