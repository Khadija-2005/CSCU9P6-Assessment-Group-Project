/**
 * This class represents a trainer running classes at the workshop.
 */
// Trainer class extending Person
class Trainer extends Person {
    private String classType;
    private ClassRoom myClassRoom;
    
    public Trainer(String name, String email, String classType) {
        super(name, email);
        this.classType = classType;
        this.myClassRoom = new ClassRoom(this);
    }
    
    public ClassRoom getClassRoom() {
        return myClassRoom;
    }
}