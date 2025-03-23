import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends Frame implements ActionListener {
    private Label nameLabel, idLabel, deptLabel;
    private TextField nameField, idField, deptField;
    private Button submitButton;

    public EmployeeForm() {
        setLayout(new FlowLayout());

        nameLabel = new Label("Name:");
        idLabel = new Label("Employee ID:");
        deptLabel = new Label("Department:");
        nameField = new TextField(20);
        idField = new TextField(20);
        deptField = new TextField(20);
        submitButton = new Button("Submit");

        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(deptLabel);
        add(deptField);
        add(submitButton);

        submitButton.addActionListener(this);

        setTitle("Employee Information Form");
        setSize(300, 200);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitButton) {
            String name = nameField.getText();
            String id = idField.getText();
            String dept = deptField.getText();

            String message = "Name: " + name + "\nEmployee ID: " + id + "\nDepartment: " + dept;
            Dialog d = new Dialog(this, "Employee Details", true);
            d.setLayout(new FlowLayout());
            d.add(new Label(message));
            Button okButton = new Button("OK");
            okButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    d.setVisible(false);
                }
            });
            d.add(okButton);
            d.setSize(250, 150);
            d.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}