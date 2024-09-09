package br.com.everdev.listaduplamenteencadeada;

public class DoubledLinkedListTest {
    public static void main(String[] args) {
        DoubledLinkedListBase<String> nomes = new DoubledLinkedListBase<>();
        nomes.inserirElementoNoInicio("Everton");
        nomes.inserirElemento("Joao");
        printLinkedList(nomes.getHead());

        // Faça a remoção do ultimo elemento da lista e imprima

        // Faça novamente a remoção do ultimo elemento da lista e imprima

        // Adicione dois elementos na lista e imprima

        // Crie um método para remoção do primeiro elemento da lista e imprima
    }

    // Crie um método para impressao da lista
    public static void printLinkedList(Node<String> atual) {
        while (atual != null) {
            System.out.println(atual.data);
            atual = atual.next;
        }
    }
}
