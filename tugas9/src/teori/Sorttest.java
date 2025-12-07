package teori;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Sorttest {
    
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println("Before sorting list: ");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("after sorting list: ");
        System.out.println(arr);
    }    
}