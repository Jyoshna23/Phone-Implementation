public class Landline implements Phone{

    private String myPhoneNo;
    private boolean powerOn;
    private boolean isRinging;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        powerOn = true;
        isRinging = false;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public boolean powerOn() {
        return true;
    }

    @Override
    public boolean isRinging() {
        if(isRinging)
            return true;
        else return false;
    }

    @Override
    public void dialNo(String phoneNo) {
        if(powerOn){
            System.out.println("You are dialing " +phoneNo);
        }else
            System.out.println("Your Landline is off");
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(powerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("You received a call");
        }else{
            System.out.println(phoneNo + " You didn't receive any call");
        }
    }
}
