/**
 * A time slot during the workshop when a class may take place.
 */
import java.util.ArrayList;

public class Timeslot {
    private DateAndTime startTime;
    private boolean trainerAvailable;
    private ArrayList<Participant> bookedParticipants = new ArrayList<>();
    private String classLogEntry;

    public boolean getTrainerAvailable() {
        return trainerAvailable;
    }

    public void setTrainerAvailable(boolean trainerAvailable) {
        this.trainerAvailable = trainerAvailable;
    }

    public ArrayList<Participant> getBookedParticipants() {
        return bookedParticipants;
    }

    public void setBookedParticipants(ArrayList<Participant> bookedParticipants) {
        this.bookedParticipants = bookedParticipants;
    }
}
