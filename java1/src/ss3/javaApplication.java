package ss3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class javaApplication {
    /*Khối lệnh try-catch,finally
     * try{
     * code thể ném ra ngoại lệ
     * }
     * catch(Exception_class_name e){
     * code xử lý ngoại lệ
     * }
     * finally{
     * code trong khối luôn dc thực thi
     * }
     * Một số method của lớp Exception
     * getMessage: trả về 1 message cụ thể về exception xảy ra
     * getCause:Trả về nguyên nhân xảy ra exception
     * toString():Trả về tên của lớp về kết quả từ phương thức getMessage()
     * printStackTrace():In ra kết quả của phương thức toString() cùng với stack trace đến system.err
     * fillInStackTrace():làm đầy stack trace của đối tượng Throwable bằng stack trace hiện tại*/

    /*
     * throw và throws
     * từ khóa throw trong java được sử dụng để ném ra
     * một ngoaị lệ(exception) cụ thể
     * Chúng ta có thể ném ra 2 ngoại lệ checked and unchecked trong java bằng từ
     * khóa throw.Từ khóa throw chủ yếu được sd để ném ra ngoại lệ tùy chỉnh
     * không thể throw nhiều exceptions*/

    /*Từ khóa throws trong java được sử dụng khi bạn không muốn phải xây dựng try{}catch(){} bên trg 1 pt nào đó.
    Bạn "đẩy trách nghiệm phải try..catch này cho pt nào đó bên ngoài có gọi đến nó. Sau câu lệnh throws là 1 hoặc nhiều class
    Có thể khai báo nhiều exceptions
    ví dụ: public void methodName() throws IOexception,SqlException{..};
    */
    public static void main(String[] args) throws Exception {
        ThrowsDemo.getAge();
    }
}

