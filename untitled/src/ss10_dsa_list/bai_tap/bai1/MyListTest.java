package ss10_dsa_list.bai_tap.bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList(10);
        System.out.println(myList.size());
        myList.add(0,8);
        myList.add(1, 6);
        myList.add(2, 7);
        System.out.println(myList);
        myList.remove(4);
        System.out.println(myList);
    }
}

