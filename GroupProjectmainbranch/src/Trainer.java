/**
 * This class represents a trainer running classes at the workshop.
 */
public class Trainer extends Person {
    private String classType;
    private ClassRoom myClassRoom;

    public Trainer(String name, String email, String classType) {
        super(name, email);
        this.classType = classType;
        this.myClassRoom = new ClassRoom();
    }
}
