package br.com.everdev.listaduplamenteencadeada;

public class SortedDoubledLinkedListTest<T> {
    public static void main(String[] args) {
        SortedDoubledLinkedList<String> nomes = new SortedDoubledLinkedList<>();
        nomes.inserirElementoNoInicio("Everton");
        nomes.inserirElemento("Joao");
        nomes.inserirElemento("Carla");
        printLinkedList(nomes.getHead());
        System.out.println("---------------");
        nomes.removerElemento("Everton");
        printLinkedList(nomes.getHead());
        nomes.inserirElemento("Ana");

        // Faça a remoção do ultimo elemento da lista e imprima

        // Faça novamente a remoção do ultimo elemento da lista e imprima

        // Adicione dois elementos na lista e imprima

        // Crie um método para remoção do primeiro elemento da lista e imprima
    }

    // Crie um método para impressao da lista
    public static void printLinkedList(br.com.everdev.listaduplamenteencadeada.SortedDoubledLinkedList.Node<String> node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}
