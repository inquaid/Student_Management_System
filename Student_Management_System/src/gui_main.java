import javax.swing.*;

public class gui_main extends JFrame {
    private JPanel main_panel;
    private JLabel title_1;
    private JTextField name_text_field;
    private JTextField address_text_field;
    private JTextField id_text_field;
    private JLabel name_label;
    private JLabel address_label;
    private JLabel id_label;
    private JButton Update_btn;
    private JButton Delete_btn;
    private JButton Add_btn;
    private JPanel button_panel;
    private JTextField cg_text_field;
    private JLabel cg_label;
    private JPanel sort_panel;
    private JButton sortButton;
    private JComboBox comboBox1;
    private JProgressBar progressBar1;

    gui_main() {
        setContentPane(main_panel);
        setTitle("Student Management System");
        setSize(620, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        title_1.setText("Student Management System");
        name_label.setText("Name");
        address_label.setText("Address");
        id_label.setText("ID");
    }


}
