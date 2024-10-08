package Média;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa que cálculo de notas...");

        int outro;
        
        Scanner scanner = new Scanner(System.in);
        
        do {

            System.out.println("Olá, digite as notas do menino");


            Notas notas = new Notas();

            System.out.println("Nota da primeira Prova:");
            notas.setNtPrv1(scanner.nextDouble());

            System.out.println("Nota da Segunda Prova:");
            notas.setNtPrv2(scanner.nextDouble());

            System.out.println("Nota do Primeiro Trabalho:");
            notas.setNtTrab1(scanner.nextDouble());

            System.out.println("Nota do Segundo Trabalho:");
            notas.setNtTrab2(scanner.nextDouble());

            int opcao;
            do {
                System.out.println("Escolha qual média você deseja ver:");
                System.out.println("1. Média das Provas");
                System.out.println("2. Média dos trabalhos");
                System.out.println("3. Média Final");
                System.out.println("4. Sair");
                opcao = scanner.nextInt();
                
                switch(opcao){
                    case 1:
                    System.out.println(String.format("Média das provas: %.2f\n", notas.calcMediaProva()));
                    break;
                    case 2:
                    System.out.println(String.format("Média dos trabalhos: %.2f\n", notas.calcMediaTrab()));
                    break;
                    case 3:
                    System.out.println(String.format("Média Final: %.2f\n", notas.calcMediaFinal()));
                    break;
                    case 4:
                    System.out.println("Saindo...\n");
                    break;
                    default:
                    System.out.println("Opção inválida. Tente novamente.\n");
                }
                
            } while (opcao != 4);
            
            System.out.println("\nDeseja calcular outra média?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            outro = scanner.nextInt();
            
        } while (outro != 2);
        
        scanner.close();
    }

}
