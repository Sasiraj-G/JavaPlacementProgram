package DataStrutureAndAlgorithm;

import java.util.Iterator;
import java.util.Scanner;

class DynamicArrayDemo<T> implements Iterable<T>{
    private static final int initialCapacity=3;
    private T arr[];
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    DynamicArrayDemo(){
        size=0;
        arr= (T[]) new Object[initialCapacity];
        capacity=initialCapacity;
    }
    public void add(T value){
        if(size == capacity) {
                expandArray();
        }
        arr[size++] = value;
    }
    private void expandArray(){
        capacity=capacity*2;
        arr=java.util.Arrays.copyOf(arr,capacity);

    }
    public void display(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void insertAtPos(int pos,T value){
        if(size == capacity)
            expandArray();
        for(int i=size-1;i>=pos;i--)
            arr[i+1]=arr[i];
        arr[pos]=value;
        size++;
    }
    private void shrinkArray(){
        capacity=capacity/2;
        arr=java.util.Arrays.copyOf(arr,capacity);
    }
    public void deleteAtPos(int pos){
        for(int i=pos+1;i<size;i++)
            arr[i-1]=arr[i];
        size--;

        if(capacity > initialCapacity && capacity > 3*size)
            shrinkArray();
    }

    public void deleteAtEnd(){
        size--;
    }
    public void deleteAtBeg(){
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
    }
    public void insertAtBeg(T val){
        for(int i=size-1;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=val;
        size++;
    }
    public void getIndex(int val){
        for(int i=0;i<size;i++){
            if(i == val){
                System.out.println(arr[i]);
            }
        }
    }
    public void update(int pos,T val){
        arr[pos]=val;
    }
    public void search(T val){
        for(int i=0;i<size;i++){
            if(arr[i] == val){
                System.out.println(val+" is index position is : "+i);
            }
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public T next() {
                return arr[index++];
            }
            @Override
            public boolean hasNext() {
                return index < size;


            }

        };
    }
}

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DynamicArrayDemo<Integer> list=new DynamicArrayDemo<Integer>();
        int pos,value;
        while (true){
            System.out.println("\n\n-----------List Menu-------------");
            System.out.println("1. Insert at End");
            System.out.println("2. Display the list");
            System.out.println("3. Insert at Specified Position");
            System.out.println("4. Delete from Specified Position");
            System.out.println("5. Delete at end Position ");
            System.out.println("6. Delete From beginning position");
            System.out.println("7. Insert at beginning position ");
            System.out.println("8. Get index(start from 0)");
            System.out.println("9. Update index(start from 0");
            System.out.println("10.Search Element");
            System.out.println("11. Exit\n");
            System.out.println("--------------------------------");
            System.out.println("Enter your Choice: \t");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the data: ");
                    value=scanner.nextInt();
                    list.add(value);
                    break;
                case 2:
                    System.out.println("\n------Element present in the list -----");
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the position (start at 0 ) : ");
                    pos=scanner.nextInt();
                    if(pos<0){
                        System.out.println("Invalied position.");
                        break;
                    }
                    System.out.println("Enter the data: ");
                    value=scanner.nextInt();
                    list.insertAtPos(pos,value);
                    break;
                case 4:
                    System.out.println("Enter the position (start at 0 ) : ");
                    pos=scanner.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position.");
                    }
                    list.deleteAtPos(pos);
                    break;
                case 5:
//                    System.out.println("Enter the position (start at 0 ) : ");
//                    pos=scanner.nextInt();
                    list.deleteAtEnd();
                    break;
                case 6:
                    list.deleteAtBeg();
                    break;
                case 7:
                    System.out.println("Enter the element : ");
                    value=scanner.nextInt();
                    list.insertAtBeg(value);
                    break;
                case 8:
                    System.out.println("Enter the index value : ");
                    value=scanner.nextInt();
                    list.getIndex(value);
                    break;
                case 9:
                    System.out.println("Enter the position : ");
                    pos=scanner.nextInt();
                    System.out.println("Enter the value : ");
                    value=scanner.nextInt();
                    list.update(pos,value);
                    break;

                case 10:
                    System.out.println("Enter the search element : ");
                    value=scanner.nextInt();
                    list.search(value);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice....");

        }

        }

    }
}
