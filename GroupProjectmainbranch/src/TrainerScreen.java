/**
 * This is the interface used by trainers. It is a Boundary class. In terms of the MVC pattern, it is also a View and a Controller.
 */
import javax.swing.*;

public class TrainerScreen {
    public TrainerScreen() {
        JFrame frame = new JFrame("Trainer Screen");
        JButton scheduleButton = new JButton("Set Schedule");

        scheduleButton.addActionListener(e -> setSchedule());

        frame.add(scheduleButton);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private void setSchedule() {
        // Schedule logic
        System.out.println("Schedule set.");
    }
}
