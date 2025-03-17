/**
 * A time slot during the workshop when a class may take place.
 */
public class Timeslot {

	private DateAndTime startTime;
	private boolean trainerAvailable;
	/**
	 * These are the participants who are booked in a class with the trainer at this time.
	 */
	private Participant[] bookedParticipants;
	/**
	 * The system will create a log entry after the class ends, indicating which participants actually attended the class, and the start and end times of the class.
	 */
	private string classLogEntry;

	public boolean getTrainerAvailable() {
		return this.trainerAvailable;
	}

	/**
	 * 
	 * @param trainerAvailable
	 */
	public void setTrainerAvailable(boolean trainerAvailable) {
		this.trainerAvailable = trainerAvailable;
	}

	public Participant[] getBookedParticipants() {
		return this.bookedParticipants;
	}

	/**
	 * 
	 * @param bookedParticipants
	 */
	public void setBookedParticipants(Participant[] bookedParticipants) {
		this.bookedParticipants = bookedParticipants;
	}

}