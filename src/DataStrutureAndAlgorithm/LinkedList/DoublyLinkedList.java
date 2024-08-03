package DataStrutureAndAlgorithm.LinkedList;

import java.security.PublicKey;

public class DoublyLinkedList<T>{
    Node head;
    Node tail;

    class Node{
        T data;
        Node prev;
        Node next;
        Node(T val) {
            data = val;
            prev = null;
            next = null;
        }
        }
    DoublyLinkedList() {
        head = null;
        tail = null;
    }
    public void insertAtBeg(T val){
        Node newNode=new Node(val);
        newNode.next=head;
        //when list is empty
        if(head==null){
            tail=newNode;
        }else{  //list is not empty
            head.prev=newNode;

        }
        head=newNode;
    }
    public void display(){
        Node temp=head;  //start from head
        while (temp!=null){ // null implies end of list
            System.out.print(temp.data+" ");
            temp=temp.next;  //jump
        }
    }
    public void displayReverse(){
        Node temp=tail; //start from tail
        while (temp!=null){ // null implies endof list
            System.out.print(temp.data+" ");
            temp=temp.prev; //jump
        }
    }

    public void insertAtPosition(int pos,T val){
        if(pos==0){
            insertAtBeg(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++){ // jump to previous node
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid postion");
            }
        }
        //resign pointers
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;





    }

}

