package studentRegistration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studentRegistrationUI extends JFrame implements ActionListener
{
   
    private JLabel nameLabel, ageLabel, emailLabel;
    private JTextField nameField, ageField, emailField;
    private JButton registerButton;
    
    public studentRegistrationUI()
    {
 
    setTitle("Student Registration");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null); 

    
    setLayout(new BorderLayout(10, 10)); 

    
    JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5)); 
    formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

    
    nameLabel = new JLabel("Name:");
    ageLabel = new JLabel("Age:");
    emailLabel = new JLabel("Email:");

    nameField = new JTextField(15); 
    ageField = new JTextField(15);
    emailField = new JTextField(15);

    
    formPanel.add(nameLabel);
    formPanel.add(nameField);
    formPanel.add(ageLabel);
    formPanel.add(ageField);
    formPanel.add(emailLabel);
    formPanel.add(emailField);

    
    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    registerButton = new JButton("Register");
    registerButton.addActionListener(this);
    buttonPanel.add(registerButton);

   
    add(formPanel, BorderLayout.CENTER); 
    add(buttonPanel, BorderLayout.SOUTH);

    
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == registerButton) {
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            
            if (name.isEmpty() || age.isEmpty() || email.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
               
                JOptionPane.showMessageDialog(this, "Registration Successful!\nName: " + name + "\nAge: " + age + "\nEmail: " + email, "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args)
   {
        SwingUtilities.invokeLater(() -> new studentRegistrationUI());
    }
}

