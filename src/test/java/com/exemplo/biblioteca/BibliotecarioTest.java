package com.exemplo.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class BibliotecarioTest {

    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Livro livro;

    @Before
    public void setUp() {
        bibliotecario = new Bibliotecario("Maria", 1);
        usuario = mock(Usuario.class);
        livro = mock(Livro.class);
    }

    @Test
    public void testGerenciarEmprestimo() {
        when(livro.isDisponivel()).thenReturn(true);
        bibliotecario.gerenciarEmprestimo(livro, usuario);
        verify(usuario).emprestarLivro(livro);
    }

    @Test
    public void testGerenciarDevolucao() {
        when(usuario.getLivrosEmprestados()).thenReturn(new ArrayList<>());
        bibliotecario.gerenciarDevolucao(livro, usuario);
        verify(usuario).devolverLivro(livro);
    }
}