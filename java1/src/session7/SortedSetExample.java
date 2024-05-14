
package session7;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void sortedSetDemo(){
        //khai bao sortedSet
        SortedSet<String> st=new TreeSet<>();
        //add()method to add elements
        st.add("vinh");
        st.add("van");
        st.add("ngoc");
        st.add("hai");
        st.add("anh");
        st.add("hoang");
        System.out.println("Initial TreeSet:" +st);
        //remove the element
        st.remove("hai");
        st.add("vinh");
        System.out.println("After remove and add:"+st);
    }

    public static void sortedSetDemo2(){
        SortedSet<Integer> st2=new TreeSet<>();
        st2.add(3);
        st2.add(6);
        st2.add(1);
        st2.add(8);
        st2.add(7);
        st2.add(2);
        System.out.println("Thu tu tang hay giam:" +st2);
    }
    public static void main(String[] agrs){
//        TreeSet se sap sap xep mang theo alphabet doi voi kieu string
        sortedSetDemo();
//        TreeSet se sap sap xep mang theo thu tu tang dan doi voi kieu Interger
        sortedSetDemo2();
    }
}