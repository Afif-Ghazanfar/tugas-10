package teori;

import java.util.ArrayList;


public class Settest {
    public static void main (String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add(null);
        System.out.println(arr);
        
        arr.set(4, "Deasy");
        System.out.println(arr);
   
        arr.set(2, "Anne");
        System.out.println(arr);
    }
}