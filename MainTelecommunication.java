@SuppressWarnings("all")
public class MainTelecommunication {
    public static void main(String[] args) {
        // DeskPhone myPhone = new DeskPhone("1023456789");
        // myPhone.powerOn();
        // myPhone.callPhone("14569874654");
        // myPhone.answer();

        MobilePhone myphone = new MobilePhone("12345");
        //myphone.powerOn();
        myphone.callPhone("12345");
        myphone.answer();

    }
}
