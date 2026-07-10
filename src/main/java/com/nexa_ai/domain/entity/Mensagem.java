package com.nexa_ai.domain.entity;

import com.nexa_ai.domain.exception.DomainException;

import java.time.LocalDateTime;

public class Mensagem {

    private Long id;
    private TipoMensagem tipo;
    private String agentResponsavel;
    private LocalDateTime criadoEm;
    private Conversa conversa;

    public Mensagem(Long id, TipoMensagem tipo, String agentResponsavel, LocalDateTime criadoEm, Conversa conversa) {
        validarAgentResponsavel(agentResponsavel);
        validarConversa(conversa);

        this.id = id;
        this.tipo = tipo;
        this.agentResponsavel = agentResponsavel;
        this.criadoEm = criadoEm;
        this.conversa = conversa;
    }

    private void validarAgentResponsavel(String agentResponsavel) {
        if (agentResponsavel == null || agentResponsavel.isBlank()) {
            throw new DomainException("Agente responsável da mensagem é obrigatório.");
        }
    }

    private void validarConversa(Conversa conversa) {
        if (conversa == null) {
            throw new DomainException("Conversa da mensagem é obrigatório.");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoMensagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoMensagem tipo) {
        this.tipo = tipo;
    }

    public String getAgentResponsavel() {
        return agentResponsavel;
    }

    public void setAgentResponsavel(String agentResponsavel) {
        this.agentResponsavel = agentResponsavel;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Conversa getConversa() {
        return conversa;
    }

    public void setConversa(Conversa conversa) {
        this.conversa = conversa;
    }
}
