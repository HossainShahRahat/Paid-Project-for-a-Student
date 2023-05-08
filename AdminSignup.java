import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AdminSignup extends JFrame {

    public AdminSignup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        CreateButton = new JButton();
        Adminname = new JTextField();
        Password_Label = new JLabel();
        ConfirmPasswordField = new JPasswordField();
        Username_Label = new JLabel();
        Login_Label = new JLabel();
        SignupLabel = new JLabel();
        jSeparator = new JSeparator();
        Password = new JPasswordField();
        Password_Label1 = new JLabel();
        Back = new JButton();
        Forward = new JButton();
        Email = new JTextField();
        EmailLabel = new JLabel();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        CreateButton.setFont(new java.awt.Font("Arial", 1, 24));
        CreateButton.setText("Create");
        CreateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton);
        CreateButton.setBounds(480, 600, 130, 50);

        Adminname.setFont(new java.awt.Font("Arial", 1, 36));
        getContentPane().add(Adminname);
        Adminname.setBounds(120, 160, 490, 50);

        Password_Label.setFont(new java.awt.Font("Arial", 1, 24));
        Password_Label.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label.setText("Confirm Password");
        getContentPane().add(Password_Label);
        Password_Label.setBounds(120, 470, 220, 50);

        ConfirmPasswordField.setFont(new java.awt.Font("Arial", 1, 36));
        getContentPane().add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(120, 530, 490, 50);

        Username_Label.setFont(new java.awt.Font("Arial", 1, 24));
        Username_Label.setForeground(new java.awt.Color(255, 255, 255));
        Username_Label.setText("Username");
        getContentPane().add(Username_Label);
        Username_Label.setBounds(120, 100, 140, 50);

        Login_Label.setFont(new java.awt.Font("Arial", 0, 18));
        Login_Label.setForeground(new java.awt.Color(255, 255, 255));
        Login_Label.setText("Already have Account?");
        Login_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(Login_Label);
        Login_Label.setBounds(120, 610, 190, 30);

        SignupLabel.setFont(new java.awt.Font("Arial", 1, 36));
        SignupLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignupLabel.setText("Admin Signup");
        getContentPane().add(SignupLabel);
        SignupLabel.setBounds(250, 20, 250, 50);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(170, 70, 400, 10);

        Password.setFont(new java.awt.Font("Arial", 1, 36));
        getContentPane().add(Password);
        Password.setBounds(120, 400, 490, 50);

        Password_Label1.setFont(new java.awt.Font("Arial", 1, 24));
        Password_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Password_Label1.setText("New Password");
        getContentPane().add(Password_Label1);
        Password_Label1.setBounds(120, 330, 180, 50);

        Back.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24));
        Back.setText("<-");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(6, 18, 67, 43);

        Forward.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24));
        Forward.setText("->");
        Forward.setEnabled(false);
        getContentPane().add(Forward);
        Forward.setBounds(79, 18, 67, 43);

        Email.setFont(new java.awt.Font("Arial", 1, 36));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(120, 270, 490, 50);

        EmailLabel.setFont(new java.awt.Font("Arial", 1, 24));
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(120, 220, 130, 50);

        BackgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new java.awt.Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String FileName="Data";
        String uname = Adminname.getText();
        String email = Email.getText();
        String pass = new String(Password.getPassword());

        File folder = new File(FileName);
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter fw;
            try {
                fw = new FileWriter("Data/AdminSignup.txt");
                fw.write("Name,Password,Email,Create Time\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        File file = new File(folder, "AdminSignup.txt");

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

                         Adminname.setText("");
                         Email.setText("");
                         Password.setText("");
                         ConfirmPasswordField.setText("");
                }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving signup information!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Login_LabelMouseClicked(java.awt.event.MouseEvent evt) {

        AdminLogin login = new AdminLogin();
        login.setVisible(true);
        setVisible(false);
    }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {
        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        setVisible(false);
    }

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignup().setVisible(true);
            }
        });
    }

    private JTextField Adminname;
    private JButton Back;
    private JLabel BackgroundImage;
    private JPasswordField ConfirmPasswordField;
    private JButton CreateButton;
    private JTextField Email;
    private JLabel EmailLabel;
    private JButton Forward;
    private JLabel Login_Label;
    private JPasswordField Password;
    private JLabel Password_Label;
    private JLabel Password_Label1;
    private JLabel SignupLabel;
    private JLabel Username_Label;
    private JSeparator jSeparator;
}
