package br.com.everdev.linkedlist;

public class LinkedListDesafio<T> {
    private Node<T> head;
    private int size;

    public LinkedListDesafio() {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void adicionarElemento(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void adicionarNodeInicial(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Implemente o método para remover o primeiro elemento da lista

    public void removerUltimoElemento() {
        if (head == null) {
            throw new IllegalStateException("A lista está vazia!");
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        T data = current.data;
        previous.next = null;
        size--;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
