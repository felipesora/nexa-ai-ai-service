package com.nexa_ai.domain.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.nexa_ai.domain.exception.DomainException;

import java.time.LocalDateTime;

public class ContextoUsuario {

    private Long id;
    private Long idUsuario;
    private JsonNode contexto;
    private LocalDateTime atualizadoEm;

    public ContextoUsuario(Long id, Long idUsuario, JsonNode contexto, LocalDateTime atualizadoEm) {
        validarIdUsuario(idUsuario);

        this.id = id;
        this.idUsuario = idUsuario;
        this.contexto = contexto;
        this.atualizadoEm = atualizadoEm;
    }

    private void validarIdUsuario(Long idUsuario) {
        if (idUsuario == null || idUsuario == 0L) {
            throw new DomainException("Id do Usuário do contexto é obrigatório.");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public JsonNode getContexto() {
        return contexto;
    }

    public void setContexto(JsonNode contexto) {
        this.contexto = contexto;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }
}
