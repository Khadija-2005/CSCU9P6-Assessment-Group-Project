/**
 * This is the interface used by trainers. It is a Boundary class. In terms of the MVC pattern, it is also a View and a Controller.
 */
import javax.swing.*;
import java.awt.*;


/*public class TrainerScreen {
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
}*/

class TrainerScreen extends JFrame {
    public TrainerScreen() {
        setTitle("Trainer Panel");
        setSize(300, 200);
        setLayout(new GridLayout(1, 1));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(new JLabel("Trainer Interface"));
    }
}

