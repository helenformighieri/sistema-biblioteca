// src/main/java/com/exemplo/biblioteca/Usuario.java
package com.exemplo.biblioteca;

import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, int id, List<Livro> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("Livro não disponível");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Livro não emprestado");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}