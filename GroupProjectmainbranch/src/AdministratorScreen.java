/**
 * This is the interface used by the OFWB system administrator.
 * It is a Boundary class.
 * In terms of the MVC pattern, it is also a View and a Controller.
 */
import javax.swing.*;

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
}
