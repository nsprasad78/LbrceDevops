
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class Login

{



    public static void main(String[] args)

    {

        SwingUtilities.invokeLater(Login::createAndShowLoginForm);

    }



    private static void createAndShowLoginForm() 

    {

        JFrame frame = new JFrame("Login Form");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 200);

        frame.setLayout(new GridLayout(3, 2));



        JLabel usernameLabel = new JLabel("Username:");

        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");

        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");



        loginButton.addActionListener(new ActionListener()

        {

            @Override

            public void actionPerformed(ActionEvent e) 

            {

                String username = usernameField.getText();

                String password = new String(passwordField.getPassword());

                // Add logic to authenticate the user here

                JOptionPane.showMessageDialog(frame, "Logged in as " + username);

            }

        });



        frame.add(usernameLabel);

        frame.add(usernameField);

        frame.add(passwordLabel);

        frame.add(passwordField);

        frame.add(new JLabel()); // Empty cell

        frame.add(loginButton);



        frame.setVisible(true);

    }

}