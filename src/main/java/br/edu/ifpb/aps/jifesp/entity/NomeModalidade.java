package br.edu.ifpb.aps.jifesp.entity;

public enum NomeModalidade {
    FUTSAL_ADULTO(true),
    FUTSAL_INTEGRADO(true),
    TENIS_DE_MESA_MASCULINO(false),
    TENIS_DE_MESA_FEMININO(false),
    VOLEIBOL_MASCULINO(true),
    VOLEIBOL_FEMININO(true),
    XADREZ_MASCULINO(false),
    XADREZ_FEMININO(false);

    private final boolean coletiva;

    NomeModalidade(boolean coletiva) {
        this.coletiva = coletiva;
    }

    public boolean isColetiva() {
        return coletiva;
    }
}
