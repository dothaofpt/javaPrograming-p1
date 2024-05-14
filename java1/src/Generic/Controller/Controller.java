package Generic.Controller;


import Generic.Entity.Entity;
import Generic.Model.GenericDAO;

import java.sql.SQLException;
import java.util.List;
//tạo 1 lớp controller mà T đại diện cho các entity kế thừa entity
public class Controller<T extends Entity<?>> {
    //khởi tạo fileds(có T vs đại diện cho kiểu dữ liệu chung)
    private GenericDAO<T> model;
//tạo constructor
    public Controller(GenericDAO<T> model) {
        this.model = model;
    }

// model thông qua GenericDAO cho phép làm vc với các entity
    //cho phép thực hiện thêm sửa xóa dữ liệu
    public List<T> getAllEntities() throws SQLException{
        return model.getAll();
    }
    public void addEntity(T entity)throws SQLException{
     model.add(entity);

    }
    public void updateEntity(T entity) throws SQLException{
        model.update(entity);
    }

}
