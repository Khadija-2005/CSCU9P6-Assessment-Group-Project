/**
 * This class holds the core data and provides the core functionality of the OFWB system. Several of the required attributes and operations are indicated but you will probably need to add many more.
 */
import java.util.ArrayList;

/*public class OFWBSystemDatabase {
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
}*/

class OFWBSystemDatabase {
    public static final int DORMANT = 0;
    public static final int PREPARING_FOR_BOOKINGS = 1;
    public static final int BOOKINGS_OPEN = 2;
    public static final int BOOKINGS_CLOSED = 3;
    public static final int WORKSHOP_ON = 4;
    
    private static int systemState = DORMANT;
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static ArrayList<Participant> participants = new ArrayList<>();
    private static ArrayList<String> bookedClasses = new ArrayList<>();
    private static SystemTimer systemTimer = new SystemTimer();
    
    public static int getSystemState() {
        return systemState;
    }
    
    public static void setSystemState(int newState) {
        systemState = newState;
    }
    
    public static void addTrainer(Trainer trainer) {
        trainers.add(trainer);
    }
    
    public static void addParticipant(Participant participant) {
        participants.add(participant);
    }
    
    public static boolean bookClass(String participantName, String classType) {
        if (systemState == BOOKINGS_OPEN) {
            bookedClasses.add(participantName + " booked " + classType);
            return true;
        }
        return false;
    }
    
    public static ArrayList<String> getBookedClasses() {
        return bookedClasses;
    }
    
    public static void advanceTime() {
        systemTimer.advanceTime();
    }
}
