package com.exemplo.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class BibliotecarioTest {

    @Test
    public void testGerenciarEmprestimo() {
        Bibliotecario bibliotecario = new Bibliotecario("Maria", 1);
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        bibliotecario.gerenciarEmprestimo(livro, usuario);
        assertFalse(livro.isDisponivel());
        assertTrue(usuario.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testGerenciarDevolucao() {
        Bibliotecario bibliotecario = new Bibliotecario("Maria", 1);
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Livro livro = new Livro("1984", "George Orwell");
        usuario.emprestarLivro(livro);
        bibliotecario.gerenciarDevolucao(livro, usuario);
        assertTrue(livro.isDisponivel());
        assertFalse(usuario.getLivrosEmprestados().contains(livro));
    }
}