package com.nexa_ai.domain.builder;

import com.nexa_ai.domain.entity.Conversa;
import com.nexa_ai.domain.entity.Mensagem;
import com.nexa_ai.domain.entity.TipoMensagem;

import java.time.LocalDateTime;

public class MensagemBuilder {

    private Long id = 1L;
    private TipoMensagem tipo = TipoMensagem.USER;
    private String agentResponsavel = "Agent 1";
    private LocalDateTime criadoEm = LocalDateTime.now();
    private Conversa conversa = new ConversaBuilder().build();

    public MensagemBuilder comId(Long id) {
        this.id = id;
        return this;
    }

    public MensagemBuilder comTipo(TipoMensagem tipo) {
        this.tipo = tipo;
        return this;
    }

    public MensagemBuilder comAgentResponsavel(String agentResponsavel) {
        this.agentResponsavel = agentResponsavel;
        return this;
    }

    public MensagemBuilder comCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
        return this;
    }

    public MensagemBuilder comConversa(Conversa conversa) {
        this.conversa = conversa;
        return this;
    }

    public Mensagem build() {
        return new Mensagem(id, tipo, agentResponsavel, criadoEm, conversa);
    }
}
