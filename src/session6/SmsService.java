package session6;

public class SmsService implements  MessageService{
    @Override
    public void sendMessage(String content, String user) {
        System.err.println("send sms content : "+ content + " to user "+ user);
    }
}
