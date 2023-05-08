import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Appointment extends JFrame {

    public Appointment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        Appointment_Label = new JLabel();
        jSeparator = new JSeparator();
        Back = new JButton();
        Forward = new JButton();
        Time_ComboBox = new JComboBox<>();
        Venue_ComboBox = new JComboBox<>();
        TimeLabel = new JLabel();
        VenueLabel = new JLabel();
        Confirm_Button = new JButton();
        AppointmentNameField = new JTextField();
        AppointmentName = new JLabel();
        IssueLabel = new JLabel();
        Physical_RadioButton = new JRadioButton();
        MentalRadioButton = new JRadioButton();
        Issue_ComboBox = new JComboBox<>();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Appointment_Label.setFont(new Font("Arial", 1, 24));
        Appointment_Label.setForeground(new Color(255, 255, 255));
        Appointment_Label.setText("Appointment");
        getContentPane().add(Appointment_Label);
        Appointment_Label.setBounds(270, 80, 178, 47);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(190, 130, 320, 10);

        Back.setFont(new Font("Segoe UI Semilight", 1, 24));
        Back.setText("<-");
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(6, 30, 67, 43);

        Forward.setFont(new Font("Segoe UI Semilight", 1, 24));
        Forward.setText("->");
        Forward.setEnabled(false);
        getContentPane().add(Forward);
        Forward.setBounds(79, 30, 67, 43);

        Time_ComboBox.setFont(new Font("Arial", 0, 24));
        Time_ComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Time", "10 AM", "4 PM", "8 PM" }));
        getContentPane().add(Time_ComboBox);
        Time_ComboBox.setBounds(130, 260, 450, 50);

        Venue_ComboBox.setFont(new Font("Arial", 0, 24));
        Venue_ComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Select Venue", "Mirpur - 1", "Mirpur - 10", "Mirpur - 12", "Dhanmondi", "Bashundhara R/A", "Banani", "Gulshan" }));
        getContentPane().add(Venue_ComboBox);
        Venue_ComboBox.setBounds(130, 350, 450, 50);

        TimeLabel.setFont(new Font("Arial", 1, 24));
        TimeLabel.setForeground(new Color(255, 255, 255));
        TimeLabel.setText("Time");
        getContentPane().add(TimeLabel);
        TimeLabel.setBounds(130, 230, 71, 22);

        VenueLabel.setFont(new Font("Arial", 1, 24));
        VenueLabel.setForeground(new Color(255, 255, 255));
        VenueLabel.setText("Venue");
        getContentPane().add(VenueLabel);
        VenueLabel.setBounds(130, 310, 90, 40);

        Confirm_Button.setFont(new Font("Arial", 1, 24));
        Confirm_Button.setText("Confirm");
        Confirm_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Confirm_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm_Button);
        Confirm_Button.setBounds(450, 540, 125, 45);

        AppointmentNameField.setFont(new Font("Arial", 1, 24));
        getContentPane().add(AppointmentNameField);
        AppointmentNameField.setBounds(130, 170, 450, 50);

        AppointmentName.setFont(new Font("Arial", 1, 24));
        AppointmentName.setForeground(new Color(255, 255, 255));
        AppointmentName.setText("Name");
        getContentPane().add(AppointmentName);
        AppointmentName.setBounds(130, 140, 90, 30);

        IssueLabel.setFont(new Font("Arial", 1, 24));
        IssueLabel.setForeground(new Color(255, 255, 255));
        IssueLabel.setText("Issue");
        getContentPane().add(IssueLabel);
        IssueLabel.setBounds(130, 420, 70, 30);

        buttonGroup1.add(Physical_RadioButton);
        Physical_RadioButton.setFont(new Font("Arial", 0, 18));
        Physical_RadioButton.setForeground(new Color(255, 255, 255));
        Physical_RadioButton.setText("Physical");
        Physical_RadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Physical_RadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Physical_RadioButton);
        Physical_RadioButton.setBounds(210, 421, 90, 30);

        buttonGroup1.add(MentalRadioButton);
        MentalRadioButton.setFont(new Font("Arial", 0, 18));
        MentalRadioButton.setForeground(new Color(255, 255, 255));
        MentalRadioButton.setText("Mental");
        MentalRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MentalRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MentalRadioButton);
        MentalRadioButton.setBounds(330, 420, 98, 30);

        Issue_ComboBox.setFont(new Font("Arial", 0, 18));
        Issue_ComboBox.setEnabled(false);
        Issue_ComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Issue_ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(Issue_ComboBox);
        Issue_ComboBox.setBounds(130, 470, 450, 50);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        UserPortal up = new UserPortal();
        up.setVisible(true);
        setVisible(false);
    }

    private void Confirm_ButtonActionPerformed(ActionEvent evt) {

        String FileName="Data";
        String uname = AppointmentNameField.getText();
        String CheckupTime = Time_ComboBox.getSelectedItem().toString();
        String Venue = Venue_ComboBox.getSelectedItem().toString();
        String Issue = Issue_ComboBox.getSelectedItem().toString();

        File folder = new File(FileName);
        if (!folder.exists()) {
            folder.mkdir();
        }

        FileWriter fw;
            try {
                fw = new FileWriter("Data/Appointment.txt");
                fw.write("Name,Checkup Time,Venue,Problem,Appointment Time\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        File file = new File(folder, "Appointment.txt");

        try (FileWriter raf = new FileWriter(file.getAbsoluteFile(),true);) {

                LocalDateTime currentTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedTime = currentTime.format(formatter);

                String signupInfo =  uname+"/"+ CheckupTime+"/"+Venue+"/"+Issue+"/"+formattedTime;
                raf.write(signupInfo+"\n");
                JOptionPane.showMessageDialog(null, "Successfully Completed Appointment", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error Completing Appointment!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void Physical_RadioButtonActionPerformed(ActionEvent evt) {

        if(Physical_RadioButton.isSelected()){
            Issue_ComboBox.enable(true);
            Issue_ComboBox.removeItem("Select Physical Problem");
            Issue_ComboBox.removeItem("Select Mental Problem");

            Issue_ComboBox.removeItem("Physical Problem 1");
            Issue_ComboBox.removeItem("Physical Problem 2");
            Issue_ComboBox.removeItem("Physical Problem 3");

            Issue_ComboBox.removeItem("Mental Problem 1");
            Issue_ComboBox.removeItem("Mental Problem 2");
            Issue_ComboBox.removeItem("Mental Problem 3");

            Issue_ComboBox.addItem("Select Physical Problem");
            Issue_ComboBox.addItem("Physical Problem 1");
            Issue_ComboBox.addItem("Physical Problem 2");
            Issue_ComboBox.addItem("Physical Problem 3");

        }
    }

    private void MentalRadioButtonActionPerformed(ActionEvent evt) {

        if(MentalRadioButton.isSelected()){
            Issue_ComboBox.enable(true);
            Issue_ComboBox.removeItem("Select Physical Problem");
            Issue_ComboBox.removeItem("Select Mental Problem");

            Issue_ComboBox.removeItem("Physical Problem 1");
            Issue_ComboBox.removeItem("Physical Problem 2");
            Issue_ComboBox.removeItem("Physical Problem 3");
            Issue_ComboBox.removeItem("Mental Problem 1");
            Issue_ComboBox.removeItem("Mental Problem 2");
            Issue_ComboBox.removeItem("Mental Problem 3");

            Issue_ComboBox.addItem("Select Mental Problem");
            Issue_ComboBox.addItem("Mental Problem 1");
            Issue_ComboBox.addItem("Mental Problem 2");
            Issue_ComboBox.addItem("Mental Problem 3");
        }
    }

    private void Issue_ComboBoxActionPerformed(ActionEvent evt) {

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
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment().setVisible(true);
            }
        });
    }

    private JLabel AppointmentName;
    private JTextField AppointmentNameField;
    private JLabel Appointment_Label;
    private JButton Back;
    private JLabel BackgroundImage;
    private JButton Confirm_Button;
    private JButton Forward;
    private JLabel IssueLabel;
    private JComboBox<String> Issue_ComboBox;
    private JRadioButton MentalRadioButton;
    private JRadioButton Physical_RadioButton;
    private JLabel TimeLabel;
    private JComboBox<String> Time_ComboBox;
    private JLabel VenueLabel;
    private JComboBox<String> Venue_ComboBox;
    private ButtonGroup buttonGroup1;
    private JSeparator jSeparator;

}
