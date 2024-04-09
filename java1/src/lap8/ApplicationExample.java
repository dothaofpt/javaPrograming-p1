package lap8;

import java.util.ArrayList;

public class ApplicationExample {
    public static void main(String[] args) {
        Student student= new Student(1,"Ngoc",20);
        ArrayList<Student> listStudents= new ArrayList<>();
        //them sv vao list
        listStudents.add(student);
        listStudents.add(new Student(3,"Binh",70));
        listStudents.add(new Student(4,"Binh",70));
        listStudents.add(new Student(5,"Binh",70));
        listStudents.add(new Student(6,"Binh",70));
        listStudents.add(new Student(7,"Binh",70));

        for(Student stu: listStudents){
            System.out.println(stu);
        }
        System.out.println("Tim kiem sv");
        for(int i=0; i< listStudents.size();i++){
            if(listStudents.get(i).name.contains("Binh")){
                System.out.println(listStudents.get(i));
                listStudents.remove(listStudents.get(i));
            }
        }


    }
}
