package br.com.everdev.listaduplamenteencadeada;

public class SortedDoubledLinkedList<T extends Comparable<T>> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SortedDoubledLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public void inserirElementoNoInicio(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode; // Se a lista estava vazia, o novo nó é também o tail
        }

        head = newNode;
        size++;
    }

    public void inserirElemento(T data) {
        Node<T> newNode = new Node<>(data);

        // Caso especial para uma lista vazia
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        // Para inserir na posição correta
        Node<T> current = head;

        // Percorre a lista para encontrar a posição de inserção
        while (current != null && current.data.compareTo(data) < 0) {
            current = current.next;
        }

        if (current == head) {
            // Insere no início da lista
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (current == null) {
            // Insere no final da lista
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            // Insere entre current.prev e current
            newNode.prev = current.prev;
            newNode.next = current;

            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;
        }
        size++;
    }

    public void removerElemento(T key) {
        Node<T> current = head;

        if (current == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        while (current != null) {
            if (current.data.equals(key)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; // Se a lista ficar vazia, redefina tail
                    }
                } else {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                if (current == tail) {
                    tail = current.prev; // Atualiza o tail se necessário
                }
                size--;
                return;
            }
            current = current.next;
        }
    }

    public Node<T> obterElemento(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Definição do Node interno
    public static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
