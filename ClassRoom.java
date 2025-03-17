/**
 * This class represents a trainer's online classroom. Each trainer has exactly one classroom. The classroom holds the schedule of the teacher's classes for the workshop. The classroom is open when the trainer opens it during the workshop, and is otherwise closed.
 * 
 * It may be appropriate to implement this class as an Observable. It will be observed from within the ParticipantScreen and TrainerScreen. The trainer will observe only their own classroom. Participants will observe different trainers' meeting rooms as they join and leave classes with different trainers. A participant can only join or be in the lobby of one trainer's classroom at any point in time.
 */
public class ClassRoom {

	/**
	 * It will probably be useful for a classroom to record which trainer it belongs to. You will need to ensure that the mutual references between a Trainer and their ClassRoom are set up correctly.
	 */
	private Trainer owner;
	/**
	 * The list of time slots during the workshop, recording classes booked by participants with this trainer.
	 */
	private Timeslot[] schedule;
	/**
	 * Represents whether the classroom is currently open.
	 */
	private boolean isOpen;
	/**
	 * Represents whether participants booked in the current class have joined the classroom. Participants' names may be displayed in some way on the trainer's screen to indicate that the participants are in the classroom.
	 */
	private Participant[] participantsPresent;
	/**
	 * Participants who have classes in this classroom either at present or in the future and are waiting for the class to begin. A participant can only be in one lobby or classroom at a time.
	 */
	private Participant[] participantsWaitingInLobby;
	/**
	 * This is the index of the current class time slot in the schedule. It is used to determine whether a participant who tries to join the classroom is admitted now, made to wait in the lobby (because their class is in the future), or refused entry. It is updated whenever the TimeHandler sends nextClass messages to all the trainers' classrooms.
	 */
	private int currentClassTimeSlot;
	private int classSize;

	/**
	 * Trainer opens the classroom at the start of the workshop.
	 */
	public void open() {
		// TODO - implement ClassRoom.open
		throw new UnsupportedOperationException();
	}

	/**
	 * Trainer closes the meeting room.
	 */
	public void close() {
		// TODO - implement ClassRoom.close
		throw new UnsupportedOperationException();
	}

	/**
	 * A participant attempts to join the classroom. If the classroom is open and the participant has a class booked their at the current time, then the participant is allowed in to participate in the class. If the classroom is closed or the participant's class in the future, the participant is placed in the lobby. If the participant does not have a class in this classroom or their class was in the past, they are refused entry to the classroom.
	 */
	public void join() {
		// TODO - implement ClassRoom.join
		throw new UnsupportedOperationException();
	}

	/**
	 * A participant who is currently in the classroom leaves the class.
	 */
	public void leave() {
		// TODO - implement ClassRoom.leave
		throw new UnsupportedOperationException();
	}

	/**
	 * This operation is triggered when it is time to end a class and start the next one. Any participant currently in the classroom is removed. If there is a participant in the lobby who has a class booked in this classroom at the current time, they are moved from the lobby into the class with the trainer.
	 */
	public void nextClass() {
		// TODO - implement ClassRoom.nextClass
		throw new UnsupportedOperationException();
	}

	/**
	 * This operation books a participant into a class time slot that is available. There may be many other operations to support viewing and changing class bookings.
	 */
	public void makeBooking() {
		// TODO - implement ClassRoom.makeBooking
		throw new UnsupportedOperationException();
	}

}