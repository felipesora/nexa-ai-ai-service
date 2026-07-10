package com.nexa_ai.domain.entity;

import com.nexa_ai.domain.builder.ConversaBuilder;
import com.nexa_ai.domain.exception.DomainException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversaTest {

    @Test
    void devePermitirCadastrarConversaSeTodosOsAtributosEstiveremCorretos() {
        Conversa conversa = new ConversaBuilder().build();

        assertNotNull(conversa);
        assertEquals(1L, conversa.getId());
        assertEquals(1L, conversa.getIdUsuario());
        assertEquals("Título da Conversa", conversa.getTitulo());
    }

    @Test
    void deveLancarDomainExceptionCasoIdUsuarioEstejaVazioOuIgualAZero() {
        DomainException exception = assertThrows(DomainException.class,
                () -> new ConversaBuilder().comIdUsuario(null).build());

        assertEquals("Id do Usuário da conversa é obrigatório.", exception.getMessage());
    }

    @Test
    void deveLancarDomainExceptionCasoTituloEstejaVazio() {
        DomainException exception = assertThrows(DomainException.class,
                () -> new ConversaBuilder().comTitulo(null).build());

        assertEquals("Título da conversa é obrigatório.", exception.getMessage());
    }
}