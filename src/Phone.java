public interface Phone {
    boolean powerOn();
    boolean isRinging();
    void dialNo(String phoneNo);
    void receiveCall(String phoneNo);

}
