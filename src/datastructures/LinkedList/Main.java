package datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        linkedList.reverse();
        linkedList.printList();
    }
}
