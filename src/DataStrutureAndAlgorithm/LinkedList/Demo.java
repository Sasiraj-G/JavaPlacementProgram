package DataStrutureAndAlgorithm.LinkedList;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.insertAtBegninnig(6);
        list.insertAtBegninnig(4);
        list.insertAtBegninnig(10);
        list.insertAtBegninnig(24);
        list.display();

        System.out.println("");
        list.insertAtPos(0,87);
        list.insertAtPos(1,988);
        list.display();
        System.out.println("");
        list.DeleteAtPos(1);
        list.display();

        System.out.println("");
        list.getValue(1);
        System.out.println("");
        list.update(1,1000);
        list.display();

        System.out.println("");
        list.deleteAtEnd();
        list.display();

        System.out.println("\nInsert at end");
        list.insertAtEnd(100);
        list.display();

        System.out.println("\n search element");
        int[] result=list.searchNode(100);
        if(result!=null)
            System.out.println(result[1]+" Element at found at : "+result[0]);
        else
            System.out.println("element not fuound");


        System.out.println("\n for each loop");
        for(int a:list){
            System.out.print(a+" ");
        }

        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("\n reverse");
        list.reverse();
        list.display();

    }
}
