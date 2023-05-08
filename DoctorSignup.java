import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DoctorSignup extends JFrame {

    public DoctorSignup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        CreateButton = new JButton();
        Doctorname = new JTextField();
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
        ProfessionLabel = new JLabel();
        profession = new JTextField();
        EmailLabel = new JLabel();
        Email = new JTextField();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        CreateButton.setFont(new Font("Arial", 1, 24));
        CreateButton.setText("Create");
        CreateButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CreateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateButton);
        CreateButton.setBounds(430, 630, 130, 50);

        Doctorname.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Doctorname);
        Doctorname.setBounds(130, 120, 430, 50);

        Password_Label.setFont(new Font("Arial", 1, 24));
        Password_Label.setForeground(new Color(255, 255, 255));
        Password_Label.setText("Confirm Password");
        getContentPane().add(Password_Label);
        Password_Label.setBounds(130, 500, 220, 50);

        ConfirmPasswordField.setFont(new Font("Arial", 1, 36));
        getContentPane().add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(130, 550, 430, 50);

        Username_Label.setFont(new Font("Arial", 1, 24));
        Username_Label.setForeground(new Color(255, 255, 255));
        Username_Label.setText("Username");
        getContentPane().add(Username_Label);
        Username_Label.setBounds(130, 70, 140, 50);

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
        Login_Label.setBounds(130, 640, 190, 30);

        SignupLabel.setFont(new Font("Arial", 1, 36));
        SignupLabel.setForeground(new Color(255, 255, 255));
        SignupLabel.setText("Doctor Signup");
        getContentPane().add(SignupLabel);
        SignupLabel.setBounds(220, 10, 250, 50);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(160, 60, 390, 10);

        Password.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Password);
        Password.setBounds(130, 450, 430, 50);

        Password_Label1.setFont(new Font("Arial", 1, 24));
        Password_Label1.setForeground(new Color(255, 255, 255));
        Password_Label1.setText("New Password");
        getContentPane().add(Password_Label1);
        Password_Label1.setBounds(130, 390, 180, 50);

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

        ProfessionLabel.setFont(new Font("Arial", 1, 24));
        ProfessionLabel.setForeground(new Color(255, 255, 255));
        ProfessionLabel.setText("Profession");
        getContentPane().add(ProfessionLabel);
        ProfessionLabel.setBounds(130, 280, 130, 50);

        profession.setFont(new Font("Arial", 1, 36));
        getContentPane().add(profession);
        profession.setBounds(130, 330, 430, 50);

        EmailLabel.setFont(new Font("Arial", 1, 24));
        EmailLabel.setForeground(new Color(255, 255, 255));
        EmailLabel.setText("Email");
        getContentPane().add(EmailLabel);
        EmailLabel.setBounds(130, 170, 130, 50);

        Email.setFont(new Font("Arial", 1, 36));
        getContentPane().add(Email);
        Email.setBounds(130, 220, 430, 50);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 730);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void CreateButtonActionPerformed(ActionEvent evt) {
        String FileName="Data";
        String uname = Doctorname.getText();
        String email = Email.getText();
        String Profession = profession.getText();
        String pass = new String(Password.getPassword());

        File folder = new File(FileName);
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter fw;
            try {
                fw = new FileWriter("Data/DoctorSignup.txt");
                fw.write("Doctor Name,Password,Profession,Email,Create Time\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminSignup.class.getName()).log(Level.SEVERE, null, ex);
            }
        File file = new File(folder, "DoctorSignup.txt");

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
                        String signupInfo =  uname+"/"+ pass+"/"+Profession+"/"+email+"/"+formattedTime;
                        raf.write(signupInfo+"\n");
                         JOptionPane.showMessageDialog(this, "Signup information saved successfully!");

                         Doctorname.setText("");
                         Email.setText("");
                         profession.setText("");
                         Password.setText("");
                         ConfirmPasswordField.setText("");
                }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving signup information!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Login_LabelMouseClicked(MouseEvent evt) {

        DoctorLogin login = new DoctorLogin();
        login.setVisible(true);
        setVisible(false);
    }

    private void BackActionPerformed(ActionEvent evt) {

        DoctorLogin al = new DoctorLogin();
        al.setVisible(true);
        setVisible(false);
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
            Logger.getLogger(DoctorSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DoctorSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DoctorSignup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DoctorSignup.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorSignup().setVisible(true);
            }
        });
    }

    private JButton Back;
    private JLabel BackgroundImage;
    private JPasswordField ConfirmPasswordField;
    private JButton CreateButton;
    private JTextField Doctorname;
    private JTextField Email;
    private JLabel EmailLabel;
    private JButton Forward;
    private JLabel Login_Label;
    private JPasswordField Password;
    private JLabel Password_Label;
    private JLabel Password_Label1;
    private JLabel ProfessionLabel;
    private JLabel SignupLabel;
    private JLabel Username_Label;
    private JSeparator jSeparator;
    private JTextField profession;

}
