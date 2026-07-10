package com.nexa_ai.domain.entity;

import com.nexa_ai.domain.builder.MensagemBuilder;
import com.nexa_ai.domain.exception.DomainException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MensagemTest {

    @Test
    void devePermitirCadastrarTarefaSeTodosOsAtributosEstiveremCorretos() {
        Mensagem mensagem = new MensagemBuilder().build();

        assertNotNull(mensagem);
        assertEquals(1L, mensagem.getId());
        assertEquals(TipoMensagem.USER, mensagem.getTipo());
        assertEquals("Agent 1", mensagem.getAgentResponsavel());
        assertEquals(1L, mensagem.getConversa().getId());
    }

    @Test
    void deveLancarDomainExceptionCasoAgentResponsavelEstejaVazio() {
        DomainException exception = assertThrows(DomainException.class,
                () -> new MensagemBuilder().comAgentResponsavel(null).build());

        assertEquals("Agente responsável da mensagem é obrigatório.", exception.getMessage());
    }

    @Test
    void deveLancarDomainExceptionCasoConversaEstejaVazio() {
        DomainException exception = assertThrows(DomainException.class,
                () -> new MensagemBuilder().comConversa(null).build());

        assertEquals("Conversa da mensagem é obrigatório.", exception.getMessage());
    }
}