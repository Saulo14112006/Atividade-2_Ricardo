package Atividade2_Ricardo;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("TESTE DA PILHA DINÂMICA");
        PilhaDinamica pilha = new PilhaDinamica();

        pilha.adicionarElemento("Ana");
        pilha.adicionarElemento("Carlos");
        pilha.adicionarElemento("Pedro");
        pilha.adicionarElemento("Ana");

        System.out.println("Total de elementos: " + pilha.contar()); // Deve dar 4
        System.out.println("Quem está no topo: " + pilha.consultarTopo()); // a ultima deve ser Ana

        System.out.println("\nRemovendo elementos (Ordem LIFO):");
        while (!pilha.estaVazia()) {
            System.out.println("Removido: " + pilha.removerElemento());
        }
        
        System.out.println("\nTotal após limpar: " + pilha.contar());
    }
}