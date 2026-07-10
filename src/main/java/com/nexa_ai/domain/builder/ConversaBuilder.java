package com.nexa_ai.domain.builder;

import com.nexa_ai.domain.entity.Conversa;

import java.time.LocalDateTime;

public class ConversaBuilder {

    private Long id = 1L;
    private Long idUsuario = 1L;
    private String titulo = "Título da Conversa";
    private LocalDateTime criadoEm = LocalDateTime.now();
    private LocalDateTime atualizadoEm = LocalDateTime.now();

    public ConversaBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public ConversaBuilder comIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public ConversaBuilder comTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ConversaBuilder comCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
        return this;
    }

    public ConversaBuilder comAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
        return this;
    }

    public Conversa build() {
        return new Conversa(id, idUsuario, titulo, criadoEm, atualizadoEm);
    }
}
