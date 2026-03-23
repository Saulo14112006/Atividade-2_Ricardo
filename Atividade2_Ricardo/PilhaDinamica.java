package Atividade2_Ricardo;

class NoPilha {
    String conteudo;
    NoPilha proximo;

    NoPilha(String conteudo) {
        this.conteudo = conteudo;
        this.proximo = null;
    }
}

public class PilhaDinamica implements PilhaOperacoes {
    private NoPilha topo;
    private int c; // O seu contador

    public PilhaDinamica() {
        this.topo = null;
        this.c = 0;
    }

    @Override
    public void adicionarElemento(String elemento) {
        NoPilha novo = new NoPilha(elemento);
        novo.proximo = topo;
        topo = novo;
        c++;
    }

    @Override
    public String removerElemento() {
        if (estaVazia()) return null;
        String r = topo.conteudo;
        topo = topo.proximo;
        c--;
        return r;
    }

    @Override
    public String consultarTopo() {
        return estaVazia() ? null : topo.conteudo;
    }

    @Override
    public int contar() {
        return c;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public void limpar() {
        topo = null;
        c = 0;
    }
}