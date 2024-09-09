package Livraria;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        
        int opcao;
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, Bem Vindo à Livraria Rafael!!");

        do {
            System.out.println("\nEscolha abaixo o que deseja fazer:\n");
            System.out.println("----- MENU -----\n");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Consultar o livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Emprestar livro");
            System.out.println("5 - Sair");
            System.out.printf("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    // Cadastro de livros
                    System.out.println("\nAgora, cadastre o ID do livro:");
                    int id = entrada.nextInt();
                    entrada.nextLine(); // Captura o "enter" após o ID

                    System.out.println("\nCadastre o título do livro:");
                    String title = entrada.nextLine();

                    System.out.println("\nDigite o valor da multa diária: ");
                    double multa = entrada.nextDouble();

                    Livro livro = new Livro(id, title);
                    livro.setValMultaDiaria(multa);
                    livros.add(livro);

                    System.out.println("\n\nLivro cadastrado com sucesso!!\n");
                    break;

                case 2:
                    // Consulta de livros
                    if (livros.isEmpty()) {
                        System.out.println("\nAinda nenhum livro foi cadastrado no sistema.");
                    } else {
                        System.out.println("\nDigite o ID do livro que deseja consultar:");
                        int idDaConsulta = entrada.nextInt();
                        Livro livroConsulta = Livro.buscarLivro(livros, idDaConsulta);

                        if (livroConsulta != null) {
                            System.out.println("\n\nInformações do livro:");
                            System.out.println("ID: " + livroConsulta.getIdentificacao());
                            System.out.println("Título: " + livroConsulta.getTitulo());
                            String status = livroConsulta.isSituacao() ? "Emprestado" : "Disponível";
                            System.out.println("Situação: " + status);
                        } else {
                            System.out.println("\n\nLivro não encontrado.");
                        }
                    }
                    break;

                case 3:
                    // Devolução de livros
                    //False = Disponível e True = Emprestado
                    if (livros.isEmpty()) {
                        System.out.println("\nAinda nenhum livro foi cadastrado no sistema.");
                    } else {
                        System.out.println("\nDigite o ID do livro que deseja devolver:");
                        int idLivroDevolucao = entrada.nextInt();
                        Livro livroDevolucao = Livro.buscarLivro(livros, idLivroDevolucao);

                        if (livroDevolucao == null) {
                            System.out.println("\n---Livro não encontrado---");
                        } else if (!livroDevolucao.isSituacao()) {
                            System.out.println("\n---O livro está disponível---");
                        } else {
                            System.out.println("Digite o número de dias de atraso na devolução (se houver): ");
                            int diasAtraso = entrada.nextInt();
                            double valorMulta = livroDevolucao.devolver(diasAtraso);
                            System.out.println("\nValor da multa pela devolução do livro " + livroDevolucao.getTitulo() +": R$ " + valorMulta);
                            
                        }
                    }
                    break;

                case 4:
                    // Empréstimo de livros
                    //False = Disponível e True = Emprestado
                    if (livros.isEmpty()) {
                        System.out.println("\nNenhum livro cadastrado ainda.");
                    } else {
                        System.out.println("\nDigite o ID do livro que deseja emprestar:");
                        int idLivroEmprestimo = entrada.nextInt();
                        Livro livroEmprestimo = Livro.buscarLivro(livros, idLivroEmprestimo);

                        if (livroEmprestimo != null) {
                            if (livroEmprestimo.isSituacao()) {
                                System.out.println("\nO livro já está emprestado.");
                            } else {
                                livroEmprestimo.emprestar();
                                System.out.println("\n"+ livroEmprestimo.getTitulo()+" emprestado com sucesso!");
                            }
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n\nSaindo do sistema...");
                    break;

                default:
                    System.out.println("\n\nOpção selecionada é inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        entrada.close();
    }
}
