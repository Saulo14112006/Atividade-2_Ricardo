package Atividade2_Ricardo;

public interface PilhaOperacoes {
    void adicionarElemento(String elemento);
    String removerElemento();
    String consultarTopo();
    int contar();
    boolean estaVazia();
    void limpar();
}