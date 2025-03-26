/**
 * This class holds the core data and provides the core functionality of the OFWB system. Several of the required attributes and operations are indicated but you will probably need to add many more.
 */
import java.util.ArrayList;

public class OFWBSystemDatabase {
    private int systemStatus;
    private DateAndTime bookingsOpenTime, bookingsCloseTime, workshopStartTime, workshopEndTime;
    private int classDuration;
    private ArrayList<Trainer> trainerList = new ArrayList<>();
    private ArrayList<Participant> participantList = new ArrayList<>();
    private ArrayList<Notification> notifications = new ArrayList<>();
    private int currentTimeSlot;

    public void clearNotifications() {
        notifications.clear();
        System.out.println("Notifications cleared.");
    }

    public void addParticipant(Participant participant) {
        participantList.add(participant);
        System.out.println("Participant added: " + participant.getName());
    }

    public void addTrainer(Trainer trainer) {
        trainerList.add(trainer);
        System.out.println("Trainer added: " + trainer.getName());
    }

    public void sendNotification(Notification notification) {
        notifications.add(notification);
        System.out.println("Notification sent to: " + notification.getMessageBody());
    }

    public void bookClassTimeslots(Participant participant) {
        // Booking logic
        System.out.println("Timeslots booked for " + participant.getName());
    }
}
