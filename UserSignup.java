import java.io.*;
import java.util.logging.*;
import java.util.logging.Level.*;
import java.util.regex.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserSignup extends JFrame {

    public UserSignup() {
        initComponents();
    }

    private void initComponents() {

        CreateButton = new JButton();
        Username = new JTextField();
        Email = new JTextField();
        Password_Label = new JLabel();
        ConfirmPasswordField = new JPasswordField();
        Username_Label = new JLabel();
        Login_Label = new JLabel();
        SignupLabel = new JLabel();
        jSeparator = new JSeparator();
        Password = new JPasswordField();
        Password_Label1 = new JLabel();
        EmailLabel = new JLabel();
        Back = new JButton();
        Forward = new JButton();
        ErrorEmailFound = new JLabel();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        CreateButton.setFont(new java.awt.Font("Arial", 1, 24));
        CreateButton.setText("Create");
        CreateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CreateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton);
        CreateButton.setBounds(450, 590, 130, 50);

        Username.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Username);
        Username.setBounds(130, 180, 450, 50);

        Email.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Email);
        Email.setBounds(130, 290, 450, 50);

        Password_Label.setFont(new Font("Arial", 1, 24));
        Password_Label.setForeground(new Color(255, 255, 255));
        Password_Label.setText("Confirm Password");
        getContentPane().add(Password_Label);
        Password_Label.setBounds(130, 470, 220, 50);

        ConfirmPasswordField.setFont(new Font("Arial", 1, 36));
        getContentPane().add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(130, 520, 450, 50);

        Username_Label.setFont(new java.awt.Font("Arial", 1, 24));
        Username_Label.setForeground(new Color(255, 255, 255));
        Username_Label.setText("Username");
        getContentPane().add(Username_Label);
        Username_Label.setBounds(130, 130, 130, 50);

        Login_Label.setFont(new Font("Arial", 0, 18));
        Login_Label.setForeground(new Color(255, 255, 255));
        Login_Label.setText("Already have Account?");
        Login_Label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login_Label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Login_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(Login_Label);
        Login_Label.setBounds(130, 600, 190, 30);

        SignupLabel.setFont(new Font("Arial", 1, 36));
        SignupLabel.setForeground(new Color(255, 255, 255));
        SignupLabel.setText("User Signup");
        getContentPane().add(SignupLabel);
        SignupLabel.setBounds(250, 60, 220, 50);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(140, 110, 400, 10);

        Password.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Password);
        Password.setBounds(130, 410, 450, 50);

        Password_Label1.setFont(new Font("Arial", 1, 24));
        Password_Label1.setForeground(new Color(255, 255, 255));
        Password_Label1.setText("New Password");
        getContentPane().add(Password_Label1);
        Password_Label1.setBounds(130, 360, 180, 50);

        EmailLabel.setFont(new Font("Arial", 1, 24));
        EmailLabel.setForeground(new Color(255, 255, 255));
        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(130, 240, 130, 50);

        Back.setFont(new Font("Segoe UI Semilight", 1, 24));
        Back.setText("<-");
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(6, 18, 67, 43);

        Forward.setFont(new Font("Segoe UI Semilight", 1, 24));
        Forward.setText("->");
        Forward.setEnabled(false);
        getContentPane().add(Forward);
        Forward.setBounds(79, 18, 67, 43);

        ErrorEmailFound.setFont(new Font("Arial", 1, 14));
        getContentPane().add(ErrorEmailFound);
        ErrorEmailFound.setBounds(210, 256, 200, 20);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 730);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void CreateButtonActionPerformed(ActionEvent evt) {

        String FileName="Data";
        String uname = Username.getText();
        String email = Email.getText();
        String pass = new String(Password.getPassword());

        File folder = new File(FileName);
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter fw;
            try {
                fw = new FileWriter("Data/UserSignup.txt");
                fw.write("Name,Password,Email,Create Time\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(UserSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        File file = new File(folder, "Usersignup.txt");

        try (FileWriter raf = new FileWriter(file.getAbsoluteFile(),true);) {

            char[] password = Password.getPassword();
                char[] confirmPassword = ConfirmPasswordField.getPassword();
                String passwordString = new String(password);
                String confirmPasswordString = new String(confirmPassword);

                LocalDateTime currentTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedTime = currentTime.format(formatter);

                if (!passwordString.equals(confirmPasswordString)) {
                    JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match.");
                } else if (passwordString.length() < 8) {
                    JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long.");
                } else {
                        String signupInfo =  uname+"/"+ pass+"/"+email+"/"+formattedTime;
                        raf.write(signupInfo+"\n");
                         JOptionPane.showMessageDialog(this, "Signup information saved successfully!");

                         Username.setText("");
                         Email.setText("");
                         Password.setText("");
                         ConfirmPasswordField.setText("");
                }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving signup information!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Login_LabelMouseClicked(MouseEvent evt) {

        UserLogin login = new UserLogin();
        login.setVisible(true);
        setVisible(false);
    }

    private void BackActionPerformed(ActionEvent evt) {

        UserLogin up = new UserLogin();
        up.setVisible(true);
        setVisible(false);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UserSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UserSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserSignup.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSignup().setVisible(true);
            }
        });
    }

    private JButton Back;
    private JLabel BackgroundImage;
    private JPasswordField ConfirmPasswordField;
    private JButton CreateButton;
    private JTextField Email;
    private JLabel EmailLabel;
    private JLabel ErrorEmailFound;
    private JButton Forward;
    private JLabel Login_Label;
    private JPasswordField Password;
    private JLabel Password_Label;
    private JLabel Password_Label1;
    private JLabel SignupLabel;
    private JTextField Username;
    private JLabel Username_Label;
    private JSeparator jSeparator;

    private boolean isValid(String i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}