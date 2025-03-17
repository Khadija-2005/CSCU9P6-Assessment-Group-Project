/**
 * This class represents a trainer running classes at the workshop.
 */
public class Trainer extends Person {

	/**
	 * The type of fitness class taught by this trainer. This will be shown to participants when they are booking or viewing classes.
	 */
	private string classType;
	/**
	 * When a trainer is added to the system, a classroom is created for them and the schedule is set up with all available start times within the period specified for the workshop.
	 */
	private ClassRoom myClassRoom;

}