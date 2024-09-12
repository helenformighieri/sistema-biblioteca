package com.exemplo.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

@ExtendWith(MockitoExtension.class)
public class UsuarioTest {

    private Usuario usuario;

    @Mock
    private Livro livro;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("João", 1, new ArrayList<>());
    }

    @Test
    public void testEmprestarLivro() {
        when(livro.isDisponivel()).thenReturn(true);
        usuario.emprestarLivro(livro);
        verify(livro).emprestar();
        assertTrue(usuario.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testDevolverLivro() {
        when(livro.isDisponivel()).thenReturn(true);
        usuario.emprestarLivro(livro);
        usuario.devolverLivro(livro);
        verify(livro).devolver();
        assertFalse(usuario.getLivrosEmprestados().contains(livro));
    }

    @Test
    public void testEmprestarLivroCondicional() {
        when(livro.isDisponivel()).thenReturn(true);
        usuario.emprestarLivro(livro);
        verify(livro).emprestar();
        assertTrue(usuario.getLivrosEmprestados().contains(livro));
    }
}