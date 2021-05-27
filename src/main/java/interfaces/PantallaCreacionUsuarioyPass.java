package interfaces;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.UIManager;

import classes.User;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class PantallaCreacionUsuarioyPass extends JPanel {

    private JTextField userNameField;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;
    private Ventana ventana;
    private User user;
    private JLabel lblNewLabel;
    private JLabel labelUsername;
    private JLabel labelPassword;
    private JLabel labelRepeatPassword;

    public PantallaCreacionUsuarioyPass(Ventana v) {

        this.ventana = v;
        this.setSize(310, 199);
        setLayout(new BorderLayout(3, 0));

        JPanel panelCentral = new JPanel();
        add(panelCentral, BorderLayout.CENTER);
        panelCentral.setLayout(null);

        userNameField = new JTextField();
        userNameField.setColumns(10);
        userNameField.setBounds(132, 53, 149, 17);
        panelCentral.add(userNameField);

        passwordField = new JPasswordField();
        passwordField.setBounds(132, 82, 149, 17);
        panelCentral.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(132, 111, 149, 17);
        panelCentral.add(passwordField_1);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(0, 0, 309, 26);
        panelCentral.add(panel);

        lblNewLabel = new JLabel("creacion usuario y contraseña");
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        lblNewLabel.setForeground(Color.BLACK);

        labelUsername = new JLabel("nombre usuario");
        labelUsername.setHorizontalAlignment(SwingConstants.CENTER);
        labelUsername.setFont(new Font("Futura", Font.PLAIN, 12));
        labelUsername.setBounds(0, 54, 139, 16);
        panelCentral.add(labelUsername);

        labelPassword = new JLabel("contraseña");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelPassword.setBounds(0, 82, 139, 16);
        panelCentral.add(labelPassword);

        labelRepeatPassword = new JLabel("repita contraseña");
        labelRepeatPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelRepeatPassword.setFont(new Font("Futura", Font.PLAIN, 12));
        labelRepeatPassword.setBounds(0, 111, 139, 16);
        panelCentral.add(labelRepeatPassword);

        JButton btnNewButton = new JButton("crear usuario");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    User.createUser(userNameField.getText(), passwordField.getPassword().toString(),
                            passwordField_1.getPassword().toString());
                    System.out.println(userNameField.getText().length());
                    System.out.println(passwordField.getText().toString());
                    System.out.println(passwordField_1.getText().toString());

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                try {
                    if (User.createUser(userNameField.getText(), passwordField.getPassword().toString(),
                            passwordField_1.getPassword().toString())) {
                        ventana.goRegister();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hemos podido crear su suario. Inténtelo de nuevo");

                        ventana.goLoginfromCreateUSer();

                    }

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });
        btnNewButton.setFont(new Font("Futura", Font.PLAIN, 11));
        btnNewButton.setBounds(104, 138, 100, 29);
        panelCentral.add(btnNewButton);

    }
}
