public class Creator {
    public static void main(String[] args) {
        String name="Jame Godsling";
        int yearCreated =1995;

        System.out.println(name);
        System.out.println(yearCreated);

    }
}
/* Giải thích code:public class Creator {: Đây là khai báo một lớp Java có tên là Creator. 
Từ khóa public chỉ ra rằng lớp này có thể được truy cập từ bên ngoài.
 Lớp này chứa phương thức main để bắt đầu thực thi chương trình.

public static void main(String[] args) 
{: Đây là phương thức main, là điểm bắt đầu của chương trình Java. 
Phương thức này được gắn với lớp Creator. public cho biết rằng phương thức này có thể được gọi từ bất kỳ lớp nào. 
static biểu thị rằng phương thức này thuộc về lớp và không cần tạo một phiên bản của lớp để gọi phương thức này. 
void chỉ ra rằng phương thức không trả về giá trị nào. 
String[] args là một mảng các đối số được truyền vào từ dòng lệnh khi chương trình được gọi. */