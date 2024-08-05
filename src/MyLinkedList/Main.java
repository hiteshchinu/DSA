package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        // list.insertFirst(45);
        // list.insertFirst(50);
        
        // list.insert(2,30);
        

        System.out.println(list);
        
        // list.reverse();

        // System.out.println(list);
        
        // list.removeStart();

        // System.out.println(list);

        // list.removeEnd();

        // System.out.println(list);

        // list.removeNthFromTheEnd(4);

        // System.out.println(list);
        // System.out.println(list.sum());
        // System.out.println(list.indexOf(6));
        // System.out.println(list.isEmpty());

        // list.printRec();
        
        list.reverseRecursive();
        System.out.println(list);

    }

}
