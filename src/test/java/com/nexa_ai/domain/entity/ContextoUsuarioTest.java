package com.nexa_ai.domain.entity;

import com.nexa_ai.domain.builder.ContextoUsuarioBuilder;
import com.nexa_ai.domain.exception.DomainException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextoUsuarioTest {

    @Test
    void devePermitirCadastrarTarefaSeTodosOsAtributosEstiveremCorretos() {
        ContextoUsuario contextoUsuario = new ContextoUsuarioBuilder().build();

        assertNotNull(contextoUsuario);
        assertEquals(1L, contextoUsuario.getId());
        assertEquals(1L, contextoUsuario.getIdUsuario());
        assertEquals("manha", contextoUsuario.getContexto().get("horario_mais_produtivo").asText());
    }

    @Test
    void deveLancarDomainExceptionCasoIdUsuarioEstejaVazioOuIgualAZero() {
        DomainException exception = assertThrows(DomainException.class,
                () -> new ContextoUsuarioBuilder().comIdUsuario(null).build());

        assertEquals("Id do Usuário do contexto é obrigatório.", exception.getMessage());
    }
}