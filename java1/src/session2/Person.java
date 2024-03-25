package session2;

public class Person{
    //Fields
    private String name;
    private Integer  bornYear;
    private String phone;
    public Person()
    {

    }
    public Person(String name, Integer bornYear, String phone) {
        this.name = name;
        this.bornYear = bornYear;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
