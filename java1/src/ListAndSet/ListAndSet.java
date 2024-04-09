package ListAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
    public static void main(String[] args) {
        List<String> tenList = new ArrayList<>();
        tenList.add("Tien");
        tenList.add("Tam");
        tenList.add("Tai");
        System.out.println(tenList);

        Set<String> tenSet = new HashSet<>();
        tenSet.add("Tien");
        tenSet.add("Tam");
        tenSet.add("Tai");
        System.out.println(tenSet);
        for ( String ten : tenSet){
        System.out.println(ten);}
        // Cach loc qua set nhanh hon:
        //tenSet.forEach(ten->System.out.println(ten));
        //tenSet.forEach(System.out::println);
        tenSet.remove("Tai");
        System.out.println(tenSet);
        System.out.println(tenSet.contains("Teo"));
        System.out.println(tenSet.size());
        System.out.println(tenSet.isEmpty());

    }
}
