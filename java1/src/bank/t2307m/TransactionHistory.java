package bank.t2307m;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// lớp lịch sử giao dịch
public class TransactionHistory {
    private Long id;
    private LocalDate dayTrading;
    private String description;
    private String beneficiaryAccount;
    private long money;
    //hàm tạo
    public TransactionHistory(String description,String beneficiaryAccount,long money){
        this.id =IdGenerate.getNewID();//Id de tu dong tang
        this.dayTrading=LocalDate.now();//Lay ngay hien tai
        this.beneficiaryAccount=beneficiaryAccount;
        this.money=money;

    }

    public TransactionHistory(long money) {
    }

    public String getBeneficiaryAccount(){return beneficiaryAccount;}
    public void setBeneficiaryAccount(String beneficiaryAccount) {this.beneficiaryAccount=beneficiaryAccount;}
    public Long getId(){return id;}
    public LocalDate getDayTrading(){return dayTrading;}
    public  String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}
    public long getMoney(){return money;}
    public void setMoney(long money){this.money=money;}
    public String toString(){
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id+ "_" +dayTrading.format(myFormatter)+"-"+description +"-"
                + Controller.formatMoney(money)+"-"+beneficiaryAccount+"\n";

    }
}
