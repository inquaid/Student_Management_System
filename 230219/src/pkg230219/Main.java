/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230219;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class StudentInfoFrame extends JFrame {
    private ArrayList<Student> students;
    private int currentIndex;

    private JLabel nameLabel, idLabel, addressLabel, indexLabel;
    private JTextField nameField, idField, addressField;
    private JButton previousButton, nextButton, addButton, deleteButton;

    public StudentInfoFrame() {
        students = new ArrayList<>();
        currentIndex = -1;

        nameLabel = new JLabel("Name:");
        nameField = new JTextField(50);

        idLabel = new JLabel("ID:");
        idField = new JTextField(10);

        addressLabel = new JLabel("Address:");
        addressField = new JTextField(30);

        previousButton = new JButton("Previous");
        nextButton = new JButton("Next");
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        indexLabel = new JLabel("");
        Font labelFont = nameLabel.getFont();
        nameLabel.setFont(labelFont.deriveFont(labelFont.getSize() + 2f));
        idLabel.setFont(labelFont.deriveFont(labelFont.getSize() + 2f));
        addressLabel.setFont(labelFont.deriveFont(labelFont.getSize() + 2f));

        Font buttonFont = previousButton.getFont();
        previousButton.setFont(buttonFont.deriveFont(buttonFont.getSize() + 2f));
        nextButton.setFont(buttonFont.deriveFont(buttonFont.getSize() + 2f));
        addButton.setFont(buttonFont.deriveFont(buttonFont.getSize() + 2f));
        deleteButton.setFont(buttonFont.deriveFont(buttonFont.getSize() + 2f));

        previousButton.setMnemonic(KeyEvent.VK_P);
        nextButton.setMnemonic(KeyEvent.VK_N);
        addButton.setMnemonic(KeyEvent.VK_A);
        deleteButton.setMnemonic(KeyEvent.VK_D);

        previousButton.addActionListener(e -> previousStudent());
        nextButton.addActionListener(e -> nextStudent());
        addButton.addActionListener(e -> addStudent());
        deleteButton.addActionListener(e -> deleteStudent());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(previousButton);
        panel.add(nextButton);
        panel.add(addButton);
        panel.add(deleteButton);
        panel.add(indexLabel);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Information");
        setSize(420, 500);
        setVisible(true);
    }

    private void previousStudent() {
        if (currentIndex > 0) {
            currentIndex--;
            displayStudent();
        }
    }

    private void nextStudent() {
        if (currentIndex < students.size() - 1) {
            currentIndex++;
            displayStudent();
        }
    }

    private void addStudent() {
        String name = nameField.getText();
        String id = idField.getText();
        String address = addressField.getText();

        if (name.isEmpty()  id.isEmpty()  address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide all information", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Student student = new Student(name, id, address);
        students.add(student);
        currentIndex = students.size() - 1;
        displayStudent();
        clearFields();
        updateIndexLabel();
    }
    private void deleteStudent() {
        if (currentIndex >= 0 && currentIndex < students.size()) {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                students.remove(currentIndex);
                if (currentIndex > 0)
                    currentIndex--;
                if (students.isEmpty())
                    currentIndex = -1;
                displayStudent();
                clearFields();
                updateIndexLabel();
            }
        }
    }

    private void displayStudent() {
        if (currentIndex >= 0 && currentIndex < students.size()) {
            Student currentStudent = students.get(currentIndex);
            nameField.setText(currentStudent.getName());
            idField.setText(currentStudent.getId());
            addressField.setText(currentStudent.getAddress());
        } else {
            nameField.setText("");
            idField.setText("");
            addressField.setText("");
        }
    }

    private void clearFields() {
        nameField.setText("");
        idField.setText("");
        addressField.setText("");
        nameField.requestFocusInWindow();
    }

    private void updateIndexLabel() {
        int totalStudents = students.size();
        indexLabel.setText("Current Index: " + (currentIndex + 1) + " - Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentInfoFrame::new);
    }
}

class Student {
    private String name;
    private String id;
    private String address;

    public Student(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}