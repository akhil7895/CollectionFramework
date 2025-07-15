import java.util.*;
public class P2Collection {

    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("Apple");
        col.add("Mango");
        col.add("Banana");
        System.out.println(col);

        System.out.println(col.size());
        System.out.println("Contain Mango :- "+col.contains("Mango"));


        for(String fruit :col){
            System.out.print(fruit+" ");
        }
        System.out.println();
        col.remove("Mango");
        System.out.println(col);

    }
    
}
