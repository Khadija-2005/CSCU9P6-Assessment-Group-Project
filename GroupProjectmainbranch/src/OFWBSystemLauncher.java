/**
 * The main class which launches the OFWB system.
 */
import javax.swing.*;
/*public class OFWBSystemLauncher {
    public static void main(String[] args) {
        new AdministratorScreen();
    }
}*/
public class OFWBSystemLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdministratorScreen().setVisible(true));
    }
}