/**
 * This is the interface used by the OFWB system administrator.
 * It is a Boundary class.
 * In terms of the MVC pattern, it is also a View and a Controller.
 */
/*import javax.swing.*;

public class AdministratorScreen {
    public AdministratorScreen() {
        JFrame frame = new JFrame("Administrator Screen");
        JButton setupButton = new JButton("Setup Workshop");
        JButton viewLogsButton = new JButton("View Class Logs");

        setupButton.addActionListener(e -> setupWorkshop());
        viewLogsButton.addActionListener(e -> viewClassLogs());

        frame.add(setupButton);
        frame.add(viewLogsButton);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private void setupWorkshop() {
        // Logic to configure workshop details
        System.out.println("Workshop setup complete.");
    }

    private void viewClassLogs() {
        // Display logs of past classes
        System.out.println("Class logs displayed.");
    }
}*/

import javax.swing.*;
import java.awt.*;

class AdministratorScreen extends JFrame {
    private JButton setupWorkshopButton, manageTrainersButton, viewLogsButton, openBookingsButton, startWorkshopButton, advanceTimeButton;
    
    public AdministratorScreen() {
        setTitle("Administrator Panel");
        setSize(400, 300);
        setLayout(new GridLayout(6, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setupWorkshopButton = new JButton("Setup Workshop");
        manageTrainersButton = new JButton("Manage Trainers");
        viewLogsButton = new JButton("View Logs");
        openBookingsButton = new JButton("Open Bookings");
        startWorkshopButton = new JButton("Start Workshop");
        advanceTimeButton = new JButton("Advance Time");
        
        setupWorkshopButton.addActionListener(e -> OFWBSystemDatabase.setSystemState(OFWBSystemDatabase.PREPARING_FOR_BOOKINGS));
        manageTrainersButton.addActionListener(e -> new TrainerScreen().setVisible(true));
        viewLogsButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Class logs:\n" + String.join("\n", OFWBSystemDatabase.getBookedClasses())));
        openBookingsButton.addActionListener(e -> OFWBSystemDatabase.setSystemState(OFWBSystemDatabase.BOOKINGS_OPEN));
        startWorkshopButton.addActionListener(e -> OFWBSystemDatabase.setSystemState(OFWBSystemDatabase.WORKSHOP_ON));
        advanceTimeButton.addActionListener(e -> OFWBSystemDatabase.advanceTime());
        
        add(setupWorkshopButton);
        add(manageTrainersButton);
        add(viewLogsButton);
        add(openBookingsButton);
        add(startWorkshopButton);
        add(advanceTimeButton);
    }
}