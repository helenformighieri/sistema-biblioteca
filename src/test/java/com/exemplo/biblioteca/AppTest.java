package com.exemplo.biblioteca;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private static Biblioteca biblioteca;

    @BeforeAll
    public static void setUp() {
        System.out.println("Executando configuração antes de todos os testes.");
        biblioteca = App.inicializarBiblioteca();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Executando limpeza após todos os testes.");
        biblioteca = null;
    }

    @Test
    public void testInicializarBiblioteca() {
        assertNotNull(biblioteca);
        assertEquals(2, biblioteca.getLivros().size());
    }

    @Test
    public void testListarLivros() {
        App.listarLivros(biblioteca);
    }

    @Test
    public void testEmprestarLivro() {
        Livro livro = biblioteca.buscarLivroPorTitulo("1984");
        assertNotNull(livro);
        App.emprestarLivro(livro);
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testDevolverLivro() {
        Livro livro = biblioteca.buscarLivroPorTitulo("1984");
        assertNotNull(livro);
        App.emprestarLivro(livro);
        App.devolverLivro(livro);
        assertTrue(livro.isDisponivel());
    }
}