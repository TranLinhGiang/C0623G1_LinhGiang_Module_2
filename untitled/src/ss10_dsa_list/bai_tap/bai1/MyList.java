package ss10_dsa_list.bai_tap.bai1;

import java.util.Arrays;

public class MyList <E>{
    private int size=0;
    private static final int DEFAULT_CAPACITY= 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    public void add( int index, E element){
        int i;
        Object newArr[] = new Object[elements.length+1];
        for (i = 0; i < elements.length; i++)
            newArr[i] = elements[i];

        newArr[index] = element;
        elements = newArr;
        size = elements.length;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public static class MyListTest {
        public static void main(String[] args) {
            MyList myList = new MyList(5);
            System.out.println(myList);
            myList.add(0,6);
            myList.add(3,3);
            myList.add(6,5);
            System.out.println(myList);
        }
    }
}
