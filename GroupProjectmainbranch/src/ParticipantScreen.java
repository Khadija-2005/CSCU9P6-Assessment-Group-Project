/**
 * This is the interface used by participants. It is a Boundary class. In terms of the MVC pattern, it is also a View and a Controller.
 */
import javax.swing.*;

public class ParticipantScreen {
    public ParticipantScreen() {
        JFrame frame = new JFrame("Participant Screen");
        JButton registerButton = new JButton("Register");
        JButton bookButton = new JButton("Book Classes");

        registerButton.addActionListener(e -> registerParticipant());
        bookButton.addActionListener(e -> bookClasses());

        frame.add(registerButton);
        frame.add(bookButton);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private void registerParticipant() {
        // Registration logic
        System.out.println("Participant registered.");
    }

    private void bookClasses() {
        // Booking logic
        System.out.println("Classes booked.");
    }
}
