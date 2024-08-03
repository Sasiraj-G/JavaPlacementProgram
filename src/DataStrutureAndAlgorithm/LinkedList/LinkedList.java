package DataStrutureAndAlgorithm.LinkedList;

import java.util.Iterator;

public class LinkedList <T> implements Iterable<T>
{
    Node head;

    class Node{
        T data;
        Node next;
        Node(T val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }
    public void insertAtBegninnig(T data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }

    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" "); // print current node value
            temp=temp.next;  //jump to nxt node
        }

    }
    public void insertAtPos(int pos,T value){
        if(pos==0){
            insertAtBegninnig(value);
            return;
        }
        Node newNode=new Node(value);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;  //jump to nxt node

            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid position : "+pos);
            }
        }
        newNode.next=temp.next; //first temp.nxt node next ta newnode.next asgin too
        temp.next=newNode;  //next temp.next node linked to newnode

    }
    public void DeleteAtPos(int pos){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        if(pos==0){
            head=head.next;
            return;
        }
        Node temp=head;
        Node prev=null;

        // jump till node to be deleted
        for(int i=1;i<=pos;i++){
            prev=temp; // keep track of prev node
            temp=temp.next; //jump to nxt node
        }
        prev.next=temp.next; //resign pointers
    }
    public void deleteAtBeg(){
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        head=head.next;

    }
    public void getValue(int pos){
        Node temp=head;
        for(int i=1;i<=pos;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public void update(int pos,T value){
        Node temp=head;
        for (int i=1;i<=pos;i++){
            temp=temp.next;
        }
        temp.data=value;

    }

    public void deleteAtEnd(){
        // case 1 the list is empty
        if(head==null){
            throw new IndexOutOfBoundsException("List is empty");
        }

        // case 2 : the list has only one node
        if(head.next==null) {
            head = null;
            return;
        }

        //case 3 : the list has more than one node

        Node temp=head;
//        while (temp.next.next != null){
//            temp=temp.next;
//        }
//        temp.next=null;

        Node prev=null;
        while (temp.next != null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public void insertAtEnd(T val){
        Node newNode=new Node(val);
        //case 1 list is empty
        if(head==null){
           head=newNode;
        }else {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public int[] searchNode(T val){
        Node temp=head;
        int index=0;
        while (temp!=null){
            if(temp.data==val){
                return new int[]{index, (int) temp.data};
            }
            temp=temp.next;
            index++;
        }
        return null;

    }
    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev; // reverse link
            prev=current;
            current=next;
        }
        head=prev;
    }
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp=head;
            @Override
            public boolean hasNext() {
                return temp!=null;
            }

            @Override
            public T next() {
                T val=temp.data;
                temp=temp.next;
                return val;
            }
        };
    }

}