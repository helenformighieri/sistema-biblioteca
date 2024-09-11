// src/main/java/com/exemplo/biblioteca/Bibliotecario.java
package com.exemplo.biblioteca;

public class Bibliotecario {
    private String nome;
    private int id;

    public Bibliotecario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void gerenciarEmprestimo(Livro livro, Usuario usuario) {
        usuario.emprestarLivro(livro);
    }

    public void gerenciarDevolucao(Livro livro, Usuario usuario) {
        usuario.devolverLivro(livro);
    }
}