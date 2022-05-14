import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lList = new MyLinkedList<>();
        Collection<Integer> newList = new ArrayList();
        System.out.println("Source list is empty.");
        System.out.println("");

        lList.add(1);
        lList.add(3);
        lList.add(7);
        System.out.println("ADD elements '1' '3' '7'");
        System.out.println("Rez:" + lList);
        System.out.println("");

        lList.add(2,9);
        System.out.println("ADD BY INDEX '9' in position 2");
        System.out.println("Rez:" + lList);
        System.out.println("");

        lList.add(5,1);
        System.out.println("ADD BY INDEX '1' in position 5");
        System.out.println("Rez:" + lList);
        System.out.println("");

        newList.add(4);
        newList.add(4);
        newList.add(4);
        lList.addAll(1,newList);
        System.out.println("ADDALL BY INDEX ('4','4','4') in position 1");
        System.out.println("Rez:" + lList);
        System.out.println("");

        newList.clear();
        newList.add(9);
        newList.add(9);
        newList.add(9);
        lList.addAll(10,newList);
        System.out.println("ADDALL BY INDEX ('9','9','9') in position 10");
        System.out.println("Rez:" + lList);
        System.out.println("");

        System.out.println("Element with index 4:");
        System.out.println("Rez:" + lList.get(4));
        System.out.println("");

        lList.set(0,8);
        System.out.println("Set '8' in position 0:");
        System.out.println("Rez:" + lList);
        System.out.println("");

        lList.remove(4);
        System.out.println("Del element with index 4:");
        System.out.println("Rez:" + lList);
        System.out.println("");

        System.out.println("List from 1 to 5:");
        System.out.println("Rez:" + lList.subList(1,5));
        System.out.println("");

        System.out.println("First index of value '9':");
        System.out.println("Rez:" + lList.indexOf(9));
        System.out.println("");

        System.out.println("Last index of value '4':");
        System.out.println("Rez:" + lList.lastIndexOf(4));
        System.out.println("");

    }
}
