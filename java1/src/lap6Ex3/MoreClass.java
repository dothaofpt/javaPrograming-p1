package lap6Ex3;


/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*Compile and run the test class.
Biên dịch và chạy lớp kiểm tra.
Tại sao System.out.println(obj1); được hiển thị?
//vì nó dc tạo từ 1 lớp ,dù ko dc ghi đè nhưng sẽ dc in ra vì kế thừa lớp object
Sự khác biệt giữa hai đối tượng obj1 và obj2 là gì?


obj1 là một đối tượng của lớpMore class dù lớp ko có thuộc tính và phương thức nhưng vẫn   in ra vì nó cx là đối tg của lớp object , nên in chuỗi mô tả mặc định củalớp object.
obj2 cũng là một đối tượng của lớp object, nhưng được tạo bằng lớp con không tên và ghi đè phương thức toString(), in ra chuỗi tùy chỉnh "this is obj2".


*/
/**/







public class MoreClass{

    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1);

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        System.out.println(obj2);
    }
}
/*
                         _oo0oo_
                        o8888888o
                        88" . "88
                        (| -_- |)
                        0\  =  /0
                        ___/`---'\___
                    .' \\|     | '.
                    / \\|||  :  ||| \
                    / _||||| -:- |||||- \
                |   | \\\  -  / |   |
                | \_|  ''\---/''  |_/ |
                \  .-\__  '-'  ___/-. /
                ___'. .'  /--.--\  `. .'___
            ."" '<  `.___\_<|>_/___.' >' "".
            | | :  `- \`.;`\ _ /`;.`/ - ` : | |
            \  \ `_.   \_ __\ /__ _/   .-` /  /
        =====`-.____`.___ \_____/___.-`___.-'=====
                        `=---='

 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   http://Tuhoc.cc Phật phù hộ, không bao giờ BUG
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/






