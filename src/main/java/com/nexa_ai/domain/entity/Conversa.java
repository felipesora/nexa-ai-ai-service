package com.nexa_ai.domain.entity;

import com.nexa_ai.domain.exception.DomainException;

import java.time.LocalDateTime;

public class Conversa {

    private Long id;
    private Long idUsuario;
    private String titulo;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public Conversa(Long id, Long idUsuario, String titulo, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        validarIdUsuario(idUsuario);
        validarTitulo(titulo);

        this.id = id;
        this.idUsuario = idUsuario;
        this.titulo = titulo;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    private void validarIdUsuario(Long idUsuario) {
        if (idUsuario == null || idUsuario == 0L) {
            throw new DomainException("Id do Usuário da conversa é obrigatório.");
        }
    }

    private void validarTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new DomainException("Título da conversa é obrigatório.");
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }
}
