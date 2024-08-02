package MyArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Arrays are static
        // int[] arr = new int[5];
        // arr [0] = 1;
        // arr [1] = 2;
        // arr [2] = 3;
        // arr [3] = 4;
        // arr [4] = 5;
        // System. out.println (arr) ;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
