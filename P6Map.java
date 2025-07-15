import java.util.*;

public class P6Map {
    public static void main(String[] args) {
        System.out.println("HashMap(Not maintain order)---------");
        Map<String,String> hm = new HashMap<>();
        hm.put("Name", "Akhil");
        hm.put("Age","21");
        hm.put("City", "Auraiya");
        hm.put("Salary", "50k");
        System.out.println(hm);

        System.out.println("LinkedHashMap(Maintain Order)---------");
        Map<String,String> lhm = new LinkedHashMap<>();
        lhm.put("Name", "Akhil");
        lhm.put("Age","21");
        lhm.put("City", "Auraiya");
        lhm.put("Salary", "50k");
        System.out.println(lhm);
    
        System.out.println("TreeMap(Sorted  Order based on key)---------");
        Map<String,String> tm = new TreeMap<>();
        tm.put("Name", "Akhil");
        tm.put("Age","21");
        tm.put("City", "Auraiya");
        tm.put("Salary", "50k");
        System.out.println(tm);

        System.out.println("Hashtree(legecy class)---------");
        Map<String,String> map = new Hashtable<>();
        map.put("Name", "Akhil");
        map.put("Age","21");
        map.put("City", "Auraiya");
        map.put("Salary", "50k");
        System.out.println(map);

        System.out.println();
        System.out.println("Loop On HAshMap.............");

        Map<String,Integer> newHm = new HashMap<>();
        newHm.put("Akhil Chaturvedi",21);
        newHm.put("Alice",23);
        newHm.put("Bob",34);


        System.out.println("Using for-each loop with entrySet()");
        for(Map.Entry<String,Integer> entry : newHm.entrySet()){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }

        System.out.println("✅ 2. Using for-each loop with keySet() and get()");
        for(String key : newHm.keySet()){
            System.out.println(key +" -> "+newHm.get(key));
        }



    }
}
