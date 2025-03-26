/**
 * This class monitors the current time and checks when significant times have been reached, triggering updates in the OFWB system.
 * 
 * The TimeHandler can be implemented as an Observer, observing the SystemTimer. When it is notified of a change in the time, its update operation will check if a significant time has been passed and update the OFWB system or the meeting rooms accordingly. It implements the behaviour shown in the System Timer use case.
 */
public class TimeHandler {
    private SystemTimer timer;
    private OFWBSystemDatabase theOFWBSystem;

    public void triggerSystemUpdates() {
        System.out.println("System updates triggered.");
    }

    public void triggerClassRoomUpdates() {
        System.out.println("Classroom updates triggered.");
    }
}
