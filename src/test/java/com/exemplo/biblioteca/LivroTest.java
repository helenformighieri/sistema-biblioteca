package com.exemplo.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        assertTrue(livro.isDisponivel());

        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testDevolverLivro() {
        Livro livro = new Livro("1984", "George Orwell");
        livro.emprestar();
        assertFalse(livro.isDisponivel());

        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}
