package LeetCode.LinkedList.FindKthNodeFromEnd;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        int result = myLinkedList.findKthFromEnd(k).value;

        System.out.println(result); // Output: 4

        /*
            EXPECTED OUTPUT:
            ----------------
            4

        */

        System.out.println(myLinkedList.findKthFromEnd(5).value);// Output: Node with value 1

        System.out.println(myLinkedList.findKthFromEnd(6)); // Output: null

    }

}
