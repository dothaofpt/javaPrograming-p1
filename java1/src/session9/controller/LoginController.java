package session9.controller;

import session9.entity.Users;
import session9.model.LoginDaoimpl;

import java.sql.SQLException;

public class LoginController {
    LoginDaoimpl loginDao=new LoginDaoimpl();

    public LoginController() throws SQLException {

    }

    public String loginStatementControler(Users user) throws SQLException{
        String message=loginDao.checkLoginStatement(user);
        //return loginDao.checkLoginStatement(user);
        //step3
        return message;
    }
    public String loginPreparedStatementController(Users user)throws SQLException{
        String message=loginDao.checkLoginPreparedStatement(user);
        //step3
        return message;
    }

}
