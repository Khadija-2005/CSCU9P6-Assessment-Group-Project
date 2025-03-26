/**
 * This class represents a trainer's online classroom. Each trainer has exactly one classroom. The classroom holds the schedule of the teacher's classes for the workshop. The classroom is open when the trainer opens it during the workshop, and is otherwise closed.
 * 
 * It may be appropriate to implement this class as an Observable. It will be observed from within the ParticipantScreen and TrainerScreen. The trainer will observe only their own classroom. Participants will observe different trainers' meeting rooms as they join and leave classes with different trainers. A participant can only join or be in the lobby of one trainer's classroom at any point in time.
 */
import java.util.ArrayList;

public class ClassRoom {
    private Trainer owner;
    private ArrayList<Timeslot> schedule = new ArrayList<>();
    private boolean isOpen;
    private ArrayList<Participant> participantsPresent = new ArrayList<>();
    private ArrayList<Participant> participantsWaitingInLobby = new ArrayList<>();
    private int currentClassTimeSlot;
    private int classSize;

    public void open() {
        isOpen = true;
        System.out.println("Classroom opened.");
    }

    public void close() {
        isOpen = false;
        participantsPresent.clear();
        System.out.println("Classroom closed.");
    }

    public void join(Participant participant) {
        if (isOpen && schedule.get(currentClassTimeSlot).getBookedParticipants().contains(participant)) {
            participantsPresent.add(participant);
            System.out.println(participant.getName() + " joined the class.");
        } else {
            participantsWaitingInLobby.add(participant);
            System.out.println(participant.getName() + " is in the lobby.");
        }
    }

    public void leave(Participant participant) {
        participantsPresent.remove(participant);
        System.out.println(participant.getName() + " left the class.");
    }

    public void nextClass() {
        currentClassTimeSlot++;
        participantsPresent.clear();
        System.out.println("Next class started.");
    }

    public void makeBooking(Participant participant) {
        // Booking logic
        System.out.println("Booking successful for " + participant.getName());
    }
}
