package Livraria;

import java.util.ArrayList;

public class Livro {

    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public double getValMultaDiaria() {
        return valMultaDiaria;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public Livro(int identificacao, String titulo) {
        this.identificacao = identificacao;
        this.titulo = titulo;

    }

    public void emprestar() {
        this.situacao = true;
    }

    public double devolver(int dias) {
        this.situacao = false;

        double multa = dias * this.valMultaDiaria;
        return multa;
    }

    public static Livro buscarLivro(ArrayList<Livro> livros, int id) {
        for (Livro livro : livros) {
            if (livro.getIdentificacao() == id) {
                return livro;
            }else {
                
            }
        }
        return null;  
    }
}
