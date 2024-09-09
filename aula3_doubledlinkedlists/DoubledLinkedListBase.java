package br.com.everdev.listaduplamenteencadeada;

public class DoubledLinkedListBase<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoubledLinkedListBase() {
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
        newNode.next = head; // conecta o próximo do novo nó ao atual início

        if (head != null) {
            head.prev = newNode; // Atualiza a referência do nó anterior
        }

        head = newNode; // atualiza o início da lista
    }

    public void inserirElemento(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode; // se a lista estiver vazia, o novo nó é o head
            return;
        }

        Node<T> last = head; // inicia do primeiro nó
        while (last.next != null) {
            last = last.next; // percorre até o último nó
        }

        last.next = newNode; // conecta o último nó ao novo nó
        newNode.prev = last; // conecta o novo nó ao último nó
    }

    public void removerElemento(T key) {
        Node<T> current = head;

        if (current == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = (Node<T>) current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                return;
            }
            current = current.next;
        }

    }

    public Node<T> obterElemento(String data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
