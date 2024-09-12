package com.exemplo.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Date;

public class EmprestimoTest {

    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Emprestimo emprestimo;

    @Before
    public void setUp() {
        livro = mock(Livro.class);
        usuario = mock(Usuario.class);
        dataEmprestimo = new Date();
        emprestimo = new Emprestimo(livro, usuario, dataEmprestimo, null);
    }

    @Test
    public void testRegistrarEmprestimo() {
        assertNotNull(emprestimo);
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(dataEmprestimo, emprestimo.getDataEmprestimo());
    }

    @Test
    public void testRegistrarDevolucao() {
        Date dataDevolucao = new Date();
        emprestimo.registrarDevolucao(dataDevolucao);
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        verify(livro).devolver();
    }
}