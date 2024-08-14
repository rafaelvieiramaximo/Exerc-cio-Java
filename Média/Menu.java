package Média;

import java.util.Scanner;

public class Menu {

    public static void main (String [] args){

    System.out.println("Olá, digite as notas do menino");

    Scanner scanner = new Scanner(System.in);

    Notas notas = new Notas();

    System.out.println("Nota da primeira Prova:");
    notas.setNtPrv1(scanner.nextDouble());

    System.out.println("Nota da Segunda Prova:");
    notas.setNtPrv2(scanner.nextDouble());

    System.out.println("Nota do Primeiro Trabalho:");
    notas.setNtTrab1(scanner.nextDouble()); 

    System.out.println("Nota do Segundo Trabalho:");
    notas.setNtTrab2(scanner.nextDouble());

    scanner.close();

    System.out.println(String.format("Média das provas: %.2f", notas.calcMediaProva()));
    System.out.println(String.format("Média dos trabalhos: %.2f", notas.calcMediaTrab()));
    System.out.println(String.format("Média Final: %.2f", notas.calcMediaFinal()));

    }

    

    
}
