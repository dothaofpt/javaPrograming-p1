package ss3;
//Custom exception
//Ngoai le do nguoi dung dinh nghia
public class AgeCheckingExc extends Exception{
//Day la phuong thuc do tu dinh nghia
     public AgeCheckingExc(String message){
          super(message);
     }

     @Override
     public String getMessage() {
          return "loi nhap vao tuoi: " + super.getMessage();

     }
}
