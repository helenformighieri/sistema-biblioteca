package com.exemplo.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testRegistrarEmprestimo() {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Date dataEmprestimo = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, null);
        assertNotNull(emprestimo);
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(dataEmprestimo, emprestimo.getDataEmprestimo());
    }

    @Test
    public void testRegistrarDevolucao() {
        Livro livro = new Livro("1984", "George Orwell");
        Usuario usuario = new Usuario("João", 1, new ArrayList<>());
        Date dataEmprestimo = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, null);
        Date dataDevolucao = new Date();
        emprestimo.registrarDevolucao(dataDevolucao);
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertTrue(livro.isDisponivel());
    }
}