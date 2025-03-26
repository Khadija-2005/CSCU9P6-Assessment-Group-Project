/**
 * A notification sent from the OFWB system to a participant or trainer. Recipients can view their notifications when they access the system. In the real system, notifications may also be sent using external tools such as emails or SMS messaging.
 */
public class Notification {
    private Person recipient;
    private DateAndTime timeSent;
    private boolean read;
    private String messageBody;

    public Notification(Person recipient, String messageBody) {
        this.recipient = recipient;
        this.messageBody = messageBody;
        this.read = false;
    }

    public void markAsRead() {
        this.read = true;
    }

    public String getMessageBody() {
        return messageBody;
    }
}
