import session2.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person newName= new Person();
        newName.setName("Hai");
        newName.setBornYear(1998);
        newName.setPhone("0977239132");
Person truongGia =new Person("Binh",1954,"09123456");
Person truongTung =new Person("TruongTung",1956,"091234567");
//lay ten cua 1 dt
        truongGia.getName();
        //doi ten cua dt
        truongGia.setName("new Name");

    }
}