package DataStrutureAndAlgorithm.LinkedList;

public class DoublyDemo {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> Dlist=new DoublyLinkedList<Integer>();

        Dlist.insertAtBeg(9);
        Dlist.insertAtBeg(32);
        Dlist.insertAtBeg(21);
        Dlist.insertAtBeg(300);
        Dlist.display();
        System.out.println("");
        Dlist.displayReverse();

    }
}
