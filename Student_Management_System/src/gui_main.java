import javax.swing.*;

public class gui_main extends JFrame {
    private JPanel main_panel;

    gui_main() {
        setContentPane(main_panel);
        setTitle("Student Management System");
        setSize(450, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
