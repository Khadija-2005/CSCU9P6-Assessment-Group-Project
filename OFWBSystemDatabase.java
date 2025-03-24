/**
 * This class holds the core data and provides the core functionality of the OFWB system. Several of the required attributes and operations are indicated but you will probably need to add many more.
 */
public class OFWBSystemDatabase {

	/**
	 * Represents the current status of the OFWB system, which may be Dormant, PreparingForBookings, BookingsOpen, BookingsClosed, and WorkshopOn. These are represented in the design as integers but may be implemented in any appropriate way.
	 */
	private int systemStatus;
	/**
	 * The date and time from which the system allows participants to book classes.
	 */
	private DateAndTime bookingsOpenTime;
	/**
	 * The date and time when the system stops allowing participants to book classes. Expected to be after bookingsOpenTime and before workshopStartTime.
	 */
	private DateAndTime bookingsCloseTime;
	/**
	 * The date and time when the workshop starts. Expected to be after bookingsCloseTime and before workshopEndTime but on the same day.
	 */
	private DateAndTime workshopStartTime;
	/**
	 * The date and time when the workshop ends. This is expected to be later on the same day as workshopStartTime.
	 */
	private DateAndTime workshopEndTime;
	/**
	 * The duration of a single class. Usually 30 minutes. This will be used to calculate the number of time slots available for classes during the workshop, and the start time of each time slot.
	 */
	private int classDuration;
	/**
	 * The list of trainers at the workshop.
	 */
	private Trainer[] TrainerList;
	/**
	 * Details of registered participants.
	 */
	private Participant[] ParticipantList;
	/**
	 * The record of notification sent by the system to participants and trainers.
	 */
	private Notification[] notifications;
	/**
	 * This represent the index of the current time slot in the schedules of the trainers' classrooms. It is set as 0 when the workshop begins and is updated whenever the TimeHandler is notified that time has passed during the workshop. It is used to trigger the start and end of classes.
	 */
	private int currentTimeSlot;

	/**
	 * The administrator uses this operation to clear old notifications when the system is going to be set up for a new workshop.
	 */
	public void clearNotifications() {
		// TODO - implement OFWBSystemDatabase.clearNotifications
		throw new UnsupportedOperationException();
	}

	/**
	 * The participant screen uses this operation to add the details of a new participant to the system.
	 */
	public void addParticipant() {
		// TODO - implement OFWBSystemDatabase.addParticipant
		throw new UnsupportedOperationException();
	}

	/**
	 * The administrator uses this operation to add a trainer to the system. There will be other operations to remove and edit trainers.
	 */
	public void addTrainer() {
		// TODO - implement OFWBSystemDatabase.addTrainer
		throw new UnsupportedOperationException();
	}

	/**
	 * Create and send a notification to a participant or trainer.
	 */
	public void sendNotification() {
		// TODO - implement OFWBSystemDatabase.sendNotification
		throw new UnsupportedOperationException();
	}

	/**
	 * The administrator uses this operation to see the log of classes that have taken place. This could represent a group of operations to allow the log to be viewed in different way.
	 */
	public void viewClassLog() {
		// TODO - implement OFWBSystemDatabase.viewClassLog
		throw new UnsupportedOperationException();
	}

	/**
	 * Participants and trainers can use this operation to read notifications sent to them by the system.
	 */
	public void viewNotifications() {
		// TODO - implement OFWBSystemDatabase.viewNotifications
		throw new UnsupportedOperationException();
	}

	/**
	 * This may represent a group of operations used by participants to book classes. The participant may choose class times manually or to allow the system to select class times for them.
	 */
	public void bookClassTimeslots() {
		// TODO - implement OFWBSystemDatabase.bookClassTimeslots
		throw new UnsupportedOperationException();
	}

	/**
	 * This may represent a group of operations used by trainers to edit their availability for the class time slots during the workshop.
	 */
	public void setTrainerAvailability() {
		// TODO - implement OFWBSystemDatabase.setTrainerAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the TimeHandler when it detects that bookingsOpenTime has been reached. The system state is changed to BookingsOpen and notifications are sent to participants asking them to book classes. There will be other operations like this to handle other time-triggered changes in the system.
	 */
	public void openBookings() {
		// TODO - implement OFWBSystemDatabase.openBookings
		throw new UnsupportedOperationException();
	}

}