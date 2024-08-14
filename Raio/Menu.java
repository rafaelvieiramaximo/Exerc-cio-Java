package Raio;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Olá, bem vindo ao programa de cálculo de raio");

        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo();

        int outro;

        do{
            System.out.println("Digite o valor do raio desse círculo:");
            circulo.setRaio(scanner.nextDouble());
            
            int opcao;

            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1. Ver área do círculo");
                System.out.println("2. Ver perímetro do círculo");
                System.out.println("3. Ver diâmetro do círculo");
                System.out.println("4. Sair");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                    System.out.println("Área do círculo: " + circulo.calcArea());
                    break;
                    case 2:
                    System.out.println("Perímetro do círculo: " + circulo.Perimetro());
                    break;
                    case 3:
                    System.out.println("Diâmetro do círculo: " + circulo.Diametro());
                    break;
                    case 4:
                    System.out.println("Saindo...");
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 4);

            System.out.println("O que deseja fazer agora?");
            System.out.println("1. Calcular novamente");
            System.out.println("2. Sair");
            outro = scanner.nextInt();

        }while (outro != 2);
            
            scanner.close();
    }
}
