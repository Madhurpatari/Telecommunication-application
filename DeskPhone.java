public class DeskPhone implements Telephone{
    

    private String myNumber;
    

    private boolean isRinging;

    

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean isRinging) {
        this.isRinging = isRinging;
    }
    
    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    

    @Override
    public void powerOn() {
        System.out.println("Desk Phone is always powered");
    }

    @Override
    public void dial(String phoneNUmber) {
        System.out.println("Now ringing "+phoneNUmber+" on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the phone.");
            isRinging = false;
        }else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Phone ringing");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
    
}
