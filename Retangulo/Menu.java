package Retangulo;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

        System.out.println("Olá, Bem vindo ao programa de cálculo de retangulo");

        Retangulo retangulo = new Retangulo();

        Scanner scanner = new Scanner(System.in);

        int opcao, outro;

        do{

            System.out.println("Digite o tamanho da altura do retangulo");
            retangulo.setAltura(scanner.nextDouble());

            System.out.println("Digite o tamanho da largura do retangulo");
            retangulo.setLargura(scanner.nextDouble());
            
            
            do{
                System.out.println("\nEscolha qual cálculo você deseja realizar");
                System.out.println("1. Ver área do retangulo");
                System.out.println("2. Ver perímetro do retangulo");
                System.out.println("3. Sair");
                opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1:
                    System.out.println(String.format("A área do retângulo: %.2f", retangulo.calcArea()));
                    break;
                    case 2:
                    System.out.println(String.format("O perímetro do retângulo: %.2f", retangulo.calcPerimetro()));
                    break;
                    case 3:
                    System.out.println("\nSaindo...");
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.");
                    }
                }while (opcao != 3);
               
                
                System.out.println("\nDeseja calcular outro retangulo?");
                System.out.println("1. Sim");
                System.out.println("2. Não");
                outro = scanner.nextInt();

        }while(outro != 2);
        
        scanner.close();
    }

}
