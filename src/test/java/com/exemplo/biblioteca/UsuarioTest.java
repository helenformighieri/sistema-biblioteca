package com.exemplo.biblioteca;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class UsuarioTest {

    @Test
    public void testEmprestarLivro() {
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        usuario.emprestarLivro(livro);
        assertFalse(livro.isDisponivel());
        assertTrue(usuario.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testDevolverLivro() {
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Livro livro = new Livro("1984", "George Orwell");
        usuario.emprestarLivro(livro);
        usuario.devolverLivro(livro);
        assertTrue(livro.isDisponivel());
        assertFalse(usuario.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testEmprestarLivroCondicional() {
        Assumptions.assumeTrue("true".equals(System.getenv("TEST_CONDICIONAL")));
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        usuario.emprestarLivro(livro);
        assertFalse(livro.isDisponivel());
        assertTrue(usuario.getLivrosEmprestados().contains(livro));
    }
}