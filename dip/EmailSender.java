package dip;
public class EmailSender implements MessageSender {
    public void send(String msg) { System.out.println("Email: " + msg); }
}
