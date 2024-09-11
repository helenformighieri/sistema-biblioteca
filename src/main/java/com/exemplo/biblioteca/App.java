package com.exemplo.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = inicializarBiblioteca();

        System.out.println("Lista de livros:");
        listarLivros(biblioteca);

        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("1984");
        if (livroBuscado != null) {
            System.out.println("Emprestando o livro: " + livroBuscado.getTitulo());
            emprestarLivro(livroBuscado);
        }

        System.out.println("Lista de livros após o empréstimo:");
        listarLivros(biblioteca);

        if (livroBuscado != null) {
            System.out.println("Devolvendo o livro: " + livroBuscado.getTitulo());
            devolverLivro(livroBuscado);
        }

        System.out.println("Lista de livros após a devolução:");
        listarLivros(biblioteca);
    }

    static Biblioteca inicializarBiblioteca() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true));
        livros.add(new Livro("1984", "George Orwell", true));
        return new Biblioteca(livros);
    }

    static void listarLivros(Biblioteca biblioteca) {
        biblioteca.listarLivros();
    }

    static void emprestarLivro(Livro livro) {
        livro.emprestar();
    }

    static void devolverLivro(Livro livro) {
        livro.devolver();
    }
}