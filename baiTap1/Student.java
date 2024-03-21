
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    /**
     * Khai bao cac truong dung de luu gia tri cua cac thuoc tinh trong lop
     */
    private int id;
    private String name;
    private boolean gender;

    /**
     * Constructor khong co doi so
     */
    public Student()
    {
        // To do:
        this.id=-1;
        this.name="noname";
        this.gender=true;
    }
    /**
     * Constructor co doi so
     */
    public Student(int id,String name,boolean gender) {
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int value) {
        this.id=value;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String value) {
        this.name=value;
    }
    public boolean isMale() {
        return this.gender;
    }
    public void setMale(boolean value) {
        this.gender=value;
    }
    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| ID |        Name         | Male |");
        System.out.printf("| %d | %s | %b |\n",this.id,this.name,this.gender);
    }
}
