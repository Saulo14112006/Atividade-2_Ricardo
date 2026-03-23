package Atividade2_Ricardo;

public class PilhaSimples implements PilhaOperacoes {
    private String[] dados;
    private int topo;

    public PilhaSimples(int tamanho) {
        this.dados = new String[tamanho];
        this.topo = -1;
    }

    @Override
    public void adicionarElemento(String elemento) {
        if (topo < dados.length - 1) {
            dados[++topo] = elemento;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    @Override
    public String removerElemento() {
        if (estaVazia()) return null;
        String r = dados[topo];
        dados[topo--] = null;
        return r;
    }

    @Override
    public String consultarTopo() {
        return estaVazia() ? null : dados[topo];
    }

    @Override
    public int contar() {
        return topo + 1;
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public void limpar() {
        for (int i = 0; i <= topo; i++) dados[i] = null;
        topo = -1;
    }
}