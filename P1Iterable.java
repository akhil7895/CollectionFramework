import java.util.*;
public class P1Iterable{
    public static void main(String[] args){

        ArrayList<String> al = new ArrayList<>();
        al.add("Akhil");
        al.add(" Chaturvedi");

        for(String name:al){
            System.out.print(name);
        }

        System.out.println();

        Iterator<String> it = al.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}