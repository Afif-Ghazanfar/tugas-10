package teori;
import java.util.ArrayList;

public class Gettest {
    
    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Denlie");
        arr.add(null);
        arr.add("Emely");
        System.out.println(arr);
        
        String s = arr.get(1);
        System.out.println("at index 1 number is: "+s);
    }  
}