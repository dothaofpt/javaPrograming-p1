
package lap8;


import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void arrayListMethod(){
        //ArrayList tạo bằng 2 cách
        //cách 1
        ArrayList<String> student = new ArrayList<>();

        //cách 2
        List<String> student2 = new ArrayList<>();

        //thêm phần tử vào arrayList
        student.add("Huy");
        student.add("Hieu");
        student.add("Dat");
        student.add("Hai");
        student.add("Ngoc");

        //hiển thị thông tin
        display(student);

        //chèn phần tử vào vị trí
        student.add(2, "Tuan");
        System.out.println("-------------------");
        display(student);

        //chèn vào vị trí đầu
        student.addFirst("Tram");
        System.out.println("--------------------");
        display(student);


        //chèn vào vị trí cuối
        student.addLast("Dung");
        System.out.println("--------------------");
        display(student);

        //lấy một phần tử theo index
        String st = student.get(2);
        System.out.println("Phần tử thu 3: " + st);

        String stFirst = student.getFirst();
        System.out.println("Phần tử đầu: " + stFirst);

        String stLast = student.getLast();
        System.out.println("Phần tử cuối: " + stLast);

        //sửa phần tử
        student.set(3, "Vinh");
        System.out.println("Sửa ptu 4");
        display(student);

        //trả về phần tử đầu tiên và xóa khỏi danh sách
        student.getFirst();
        student.removeFirst();
        System.out.println("------------------");
        display(student);

        //xóa toàn bộ
        System.out.println("Remove all");
        student.clear();
        display(student);
        System.out.println("Size: " + student.size());
        System.out.println("Remove success");
    }
    public static void display(ArrayList list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i + 1 + ". " +list.get(i));
        }
    }

    public static void main(String[] args) {
//        ArrayListDemo demo = new ArrayListDemo();
//        demo.arrayListMethod();
        arrayListMethod();
    }
}