package session6;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String content, String user) {
        System.err.println("send message content : "+ content + " to user "+ user);
    }
}
