import java.util.*;

public class MyLinkedList<T> implements List<T> {

    private Node<T> node;

    private int size = 0;
    private Node<T> first;

    public MyLinkedList() {
        this.node = new Node<>();
    }

    @Override
    public String toString() {
        String s="";
        if (first == null) {
            s="";
        } else {
            Node<T> curr = first;
            s = curr.getItem()+" ";
            while (curr.getNext() != null) {
                curr = curr.getNext();
                s = s+ curr.getItem()+" ";
            }
        }
        return s;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0 ;
    }

    @Override
    public boolean add(T t) {
        Node<T> node = new Node<T>();
        node.setItem(t);
        if (first == null) {
            first = node;
        } else {
            Node<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            node.setPrev(curr);
            curr.setNext(node);

        }
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        if (index>size-1){
            while (index!=size){
                add(null);
            }
            add(element);
            size++;
        }else {
            Node<T> node = new Node<T>();
            node.setItem(element);
            Node<T> curr = first;
            for (int i=0; i<index;i++){
                curr=curr.getNext();
            }
            curr.getPrev().setNext(node);
            node.setNext(curr);
            node.setPrev(curr.getPrev());
            curr.setPrev(node);
            size++;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return addAll(size, c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        T[] arrForAdd = (T[]) c.toArray();
        if (index < 0) {
            return false;
        }
        if (index > size - 1) {
            while (index != size-1) {
                add(null);
            }
            for (int i = 0; i < arrForAdd.length; i++) {
                add(arrForAdd[i]);
            }
            return true;
        } else {
            for (int i = 0; i < arrForAdd.length; i++) {
                add(index + i, arrForAdd[i]);
            }
            return true;
        }
    }

    @Override
    public T get(int index) {
        Node<T> curr = first;
        int tInd=0;
        while (curr.getNext() != null) {
            if (tInd==index){return curr.getItem();}
            curr = curr.getNext();
            tInd++;
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        Node<T> curr = first;
        int tInd=0;
        while (curr.getNext() != null) {
            if (tInd==index){
                curr.setItem(element);
                return curr.getItem();
            }
            curr = curr.getNext();
            tInd++;
        }
        return null;
    }

    @Override
    public T remove(int index) {
        Node<T> curr = first;
        int tInd=0;
        while (curr.getNext() != null) {
            if (tInd==index){
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                return curr.getItem();
            }
            curr = curr.getNext();
            tInd++;
        }
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        T[] sList = (T[]) new Object[toIndex-fromIndex];
        int ii=0;
        Node<T> curr = first;
        for (int i=fromIndex;i<toIndex;i++){
            sList[ii]=get(i);
            ii++;
        }
        return Arrays.asList(sList);
    }

    @Override
    public int indexOf(Object o) {
        Node<T> curr = first;
        if (curr.getItem()==o){
            return 0;
        }
        int tInd=0;
        while (curr.getNext() != null) {
            curr = curr.getNext();
            tInd++;
            if (curr.getItem()==o){
                return tInd;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int fIndex=-1;
        Node<T> curr = first;
        if (curr.getItem()==o){
            fIndex=0;
        }
        int tInd=0;
        while (curr.getNext() != null) {
            curr = curr.getNext();
            tInd++;
            if (curr.getItem()==o){
                fIndex=tInd;
            }
        }
        return fIndex;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

}
