package dip;
public class NotificationService {
    private MessageSender sender;
    public NotificationService(MessageSender sender) { this.sender = sender; }
    public void notify(String msg) { sender.send(msg); }
}
