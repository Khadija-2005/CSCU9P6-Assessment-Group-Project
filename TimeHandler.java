/**
 * This class monitors the current time and checks when significant times have been reached, triggering updates in the OFWB system.
 * 
 * The TimeHandler can be implemented as an Observer, observing the SystemTimer. When it is notified of a change in the time, its update operation will check if a significant time has been passed and update the OFWB system or the meeting rooms accordingly. It implements the behaviour shown in the System Timer use case.
 */
public class TimeHandler {

	/**
	 * a reference to the System Timer, used to observe updates to the current time.
	 */
	private SystemTimer timer;
	/**
	 * The Time Handler will send messages to the central OFWB system to trigger time-bound operations, for example, opening bookings when the time specified for this is reached.
	 */
	private OFWBSystemDatabase theOFWBSystem;

	/**
	 * This operation will check whether the current time has reached or passed an important milestone in the life of the system, and will trigger changes in the system status and call other system operations as needed.
	 */
	public void triggerSystemUpdates() {
		// TODO - implement TimeHandler.triggerSystemUpdates
		throw new UnsupportedOperationException();
	}

	/**
	 * If the time allowed for the current class time slot has ended, the current time slot will be updated in the system and in the classrooms, participants will be moved out of the classes that have ended, and new participants will be moved into the classrooms from the lobbies if it is now their class time slot.
	 */
	public void triggerClassRoomUpdates() {
		// TODO - implement TimeHandler.triggerMeetingRoomUpdates
		throw new UnsupportedOperationException();
	}

}