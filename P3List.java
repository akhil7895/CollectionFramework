import java.util.*;

public class P3List {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("Cpp");
        System.out.println(al);
        al.add(1,"C");      //Insert at perticular position
        System.out.println(al);

        al.set(0, "Dava");          //Replace
        System.out.println(al);
    }
    
}
