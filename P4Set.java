import java.util.*;
public class P4Set {
    public static void main(String[] args) {

        System.out.println("HashSet(unordered/Random Order)........");

        Set<String> hs = new HashSet<>();

        hs.add("Akhil");
        hs.add("Alice");
        hs.add("bob");
        hs.add("Aac");
        hs.add("Akh");
        System.out.println(hs);

        System.out.println("LinkedHashSet(ordered)..........");

        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Akhil");
        lhs.add("Alice");
        lhs.add("bob");
        lhs.add("Aac");
        lhs.add("Akh");
        System.out.println(lhs);

        System.out.println("TreeSet(Sorted)......");
        Set<Integer> ts = new TreeSet<>();
        ts.add(21);
        ts.add(12);
        ts.add(67);
        ts.add(11);
        System.out.println(ts);


    }
    
}
