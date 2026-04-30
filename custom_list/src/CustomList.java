import java.util.NoSuchElementException;

public class CustomList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public void addLast(T value){
        Node<T> current = new Node<>(value, null);
        if(head==null){
            head = current;
        } else {
            tail.next = current;
        }
        tail = current;
    }

    public T getLast(){
        try{return tail.value;} catch (NullPointerException e) {
            throw new NoSuchElementException(e);
        }
    }


}
