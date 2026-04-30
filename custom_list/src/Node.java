public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value, Node<T> next) {
        this.next = next;
        this.value = value;
    }
}
