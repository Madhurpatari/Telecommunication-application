public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on.");
    }

    @Override
    public void dial(String phoneNUmber) {
        System.out.println("Now ringing "+phoneNUmber+" on desk phone.");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the phone.");
            isRinging = false;
        }else{
            
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber && isPowerOn){
            isRinging = true;
            System.out.println("Phone ringing");
        }else{
            System.out.println("Either wrong number entered or phone is off, Please try again later or check the number you have dialed.");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
}
