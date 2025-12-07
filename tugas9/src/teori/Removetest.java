package teori;

import java.util.ArrayList;


public class Removetest {
    
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Denlie");
        arr.add(null);
        arr.add("Emely");
        System.out.println(arr);
        
        arr.remove("Denlie");
        System.out.println(arr);
   
        arr.remove(3);
        System.out.println(arr);
    }
}