package ss10_dsa_list.bai_tap.bai2;

import javax.xml.soap.Node;
import java.util.Arrays;

public class MyLinkedList <E>{
    private int numNodes;
    private Node head;
    private Object elements[];
    private int size;
    public MyLinkedList (int capacity){
        elements = new Object[capacity];
    }
    public MyLinkedList() {
    }

    public MyLinkedList(int numNodes, Node head, Object[] elements, int size) {
        this.numNodes = numNodes;
        this.head = head;
        this.elements = elements;
        this.size = size;
    }

    public void add(int index, E element){
        int i;
        Object newArr[] = new Object[elements.length+1];

        for (i = 0; i < elements.length; i++)
            newArr[i] = elements[i];

        newArr[index] = element;
        elements = newArr;
        size = elements.length;
    }
    public void remove (int index){
        if(index<0|| index >= elements.length){
            throw new IndexOutOfBoundsException();
        }else {
            for (int i = elements.length - 1; i > index ; i--) {
                elements[i] = elements[i-1];
            }
            elements[index]= elements;
            size--;
        }
    }


    @Override
    public String toString() {
        return "elements=" + Arrays.toString(elements) +
                ", size=" + size ;
    }

    public static class MyLinkedListTest {
        public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList(7);
            System.out.println("Old arr :"+ myLinkedList);
            myLinkedList.add(0,7);
            System.out.println("arr addFirst: "+ myLinkedList);
            myLinkedList.add(8,1);
            System.out.println("arr addLast: "+ myLinkedList);
            myLinkedList.remove(0);
            System.out.println(" delete index" + myLinkedList);


        }
    }
}
