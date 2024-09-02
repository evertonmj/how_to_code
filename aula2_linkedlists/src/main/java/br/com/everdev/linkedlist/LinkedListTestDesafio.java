package br.com.everdev.linkedlist;

public class LinkedListTestDesafio {
    public static void main(String[] args) {
        LinkedListDesafio<String> nomes = new LinkedListDesafio<>();
        nomes.adicionarNodeInicial("Everton");
        nomes.adicionarElemento("Joao");
        nomes.adicionarElemento("Maria");
        nomes.adicionarElemento("Pedro");
        nomes.adicionarElemento("Suzana");

        Node<String> raiz = nomes.getHead();

        // Crie um método para impressao da lista com o codigo abaixo
        while (raiz != null) {
            System.out.println(raiz.data);
            raiz = raiz.next;
        }

        System.out.println("-------------------------");

        // Faça a remoção do ultimo elemento da lista e imprima

        // Faça novamente a remoção do ultimo elemento da lista e imprima

        // Adicione dois elementos na lista e imprima

        // Crie um método para remoção do primeiro elemento da lista e imprima
    }

    // Crie um método para impressao da lista
    public static void printLinkedList(Node<String> atual) {

    }
}
