import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item){
        list.addFirst(item);
    }

    public E dequeue(){
        return list.removeFirst();
    }

    public E getItem(){
        return list.getFirst();
    }

    public int size(){
        return list.size();
    }
}
