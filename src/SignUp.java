import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class SignUp 

{



    public static void main(String[] args) 

    {

        SwingUtilities.invokeLater(SignUp::createAndShowSignUpForm);

    }



    private static void createAndShowSignUpForm() 

    {

        JFrame frame = new JFrame("Sign Up Form");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 250);

        frame.setLayout(new GridLayout(4, 2));



        JLabel usernameLabel = new JLabel("Username:");

        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");

        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");

        JPasswordField confirmPasswordField = new JPasswordField();

        JButton signUpButton = new JButton("Sign Up");



        signUpButton.addActionListener(new ActionListener() 

        {

            @Override

            public void actionPerformed(ActionEvent e) 

            {

                String username = usernameField.getText();

                String password = new String(passwordField.getPassword());

                String confirmPassword = new String(confirmPasswordField.getPassword());



                if (!password.equals(confirmPassword)) 

                {

                    JOptionPane.showMessageDialog(frame, "Passwords do not match!");

                    return;

                }



                // Add logic to register the user here

                JOptionPane.showMessageDialog(frame, "Signed up as " + username);

            }

        });



        frame.add(usernameLabel);

        frame.add(usernameField);

        frame.add(passwordLabel);

        frame.add(passwordField);

        frame.add(confirmPasswordLabel);

        frame.add(confirmPasswordField);

        frame.add(new JLabel()); // Empty cell

        frame.add(signUpButton);



        frame.setVisible(true);

    }

}