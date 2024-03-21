/**
 * Write a description of class FlashLamp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlashLamp
{
    /**
     * Fields
     */
    private boolean status;
    private Battery battery;
//”Đặt object Battery vào FlashLamp vẫn chạy tốt -> LTHĐT”
    /**
     * Constructor for objects of class FlashLamp
     */
    public FlashLamp()
    {
        // To do:
        status=false;
    }
    /**
     * Methods
     */
    public void setBattery(Battery battery) {
        this.battery=battery;
    }
    public int getBatteryInfo() {
        return battery.getEnergy();
    }
    public void light() {
        if(status==true&&battery!=null&&battery.getEnergy()>0) {
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if(battery!=null&&battery.getEnergy()>0) {
            status=true;
        }
        light();
    }
    public void turnOff() {
        status=false;
    }
    public static void main(String[] args) {
        // Khai báo và khởi tạo một đối tượng Pin
        Battery battery = new Battery();
        // Khai báo và khởi tạo một đối tượng Đèn pin
        FlashLamp flashLamp = new FlashLamp();

        // Lắp pin vào đèn pin của bạn
        flashLamp.setBattery(battery);

        // Bật và tắt đèn pin 10 lần
        for (int i = 0; i < 10; i++) {
            flashLamp.turnOn();
            flashLamp.turnOff();
        }

        // Hiển thị trên màn hình công suất pin còn lại
        System.out.println("Công suất pin còn lại: " + flashLamp.getBatteryInfo());
    }
}


// Trong lớp flashCamp(Đèn pin) ta có status(trạng thái của đèn pin) và 1 object Battery.
//Trc hết khởi tạo status=false;
//phương thức lấy pin setBattery(),lấy thông tin pin getBatteryInfo(),phát sáng light(), bật turnOn(), tắt turnOff()

