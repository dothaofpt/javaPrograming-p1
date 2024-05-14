package session9.model;

import session9.entity.Users;

import java.sql.SQLException;
//Data Access Object (DAO) Pattern là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern).
// Mẫu thiết kế DAO được sử dụng để phân tách logic lưu trữ dữ liệu trong một lớp riêng biệt.

public interface LoginDAO {
//    Tạo ra các method abstract để triển khai trong LoginDaoimpl
    public String checkLoginStatement(Users user) throws SQLException;
    public String checkLoginPreparedStatement(Users user) throws SQLException;
}
