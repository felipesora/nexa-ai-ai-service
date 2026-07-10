package com.nexa_ai.domain.builder;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nexa_ai.domain.entity.ContextoUsuario;

import java.time.LocalDateTime;

public class ContextoUsuarioBuilder {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Long id = 1L;
    private Long idUsuario = 1L;
    private JsonNode contexto = MAPPER.createObjectNode().put("horario_mais_produtivo", "manha");
    private LocalDateTime atualizadoEm = LocalDateTime.now();

    public ContextoUsuarioBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public ContextoUsuarioBuilder comIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public ContextoUsuarioBuilder comContexto(JsonNode contexto) {
        this.contexto = contexto;
        return this;
    }

    public ContextoUsuarioBuilder comAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
        return this;
    }

    public ContextoUsuario build() {
        return new ContextoUsuario(id, idUsuario, contexto, atualizadoEm);
    }
}
