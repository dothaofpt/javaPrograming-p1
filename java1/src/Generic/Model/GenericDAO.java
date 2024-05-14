package Generic.Model;

import java.sql.SQLException;
import java.util.List;

//B1: Tạo 1 interface GenericDao để dùng  chung các phương thức giống nhau của mỗi bảng
public interface GenericDAO<T> {
    //B2: Liệt kê các phương thức có thể dùng chung
//    T trong list đại diện cho kiểu dữ liệu(String,Integer,Double,Float,Boolean)
    List<T> getAll() throws SQLException;
// T trong 2 method add vs update là đại diện cho các entities trong package entities
//    và các bảng trong databse
    void add(T entity) throws SQLException;

    void update(T entity) throws SQLException;
}

