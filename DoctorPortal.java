import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class DoctorPortal extends JFrame {

    public DoctorPortal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        DoctorLabel = new JLabel();
        jSeparator = new JSeparator();
        AppointmentListButton = new JButton();
        LogOut = new JButton();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        DoctorLabel.setFont(new Font("Arial", 1, 28));
        DoctorLabel.setForeground(new Color(255, 255, 255));
        DoctorLabel.setText("Doctor Portal");
        getContentPane().add(DoctorLabel);
        DoctorLabel.setBounds(250, 30, 190, 49);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(210, 80, 280, 10);

        AppointmentListButton.setFont(new Font("Arial", 1, 24));
        AppointmentListButton.setText("Appointment List");
        AppointmentListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AppointmentListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AppointmentListButton);
        AppointmentListButton.setBounds(130, 140, 430, 60);

        LogOut.setFont(new Font("Arial", 1, 24));
        LogOut.setText("Log out");
        LogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(130, 230, 430, 60);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void LogOutActionPerformed(ActionEvent evt) {

        DoctorLogin al = new DoctorLogin();
        al.setVisible(true);
        setVisible(false);
    }

    private void AppointmentListButtonActionPerformed(ActionEvent evt) {

        AppointmentList al = new AppointmentList();
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
            Logger.getLogger(DoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DoctorPortal.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPortal().setVisible(true);
            }
        });
    }

    private JButton AppointmentListButton;
    private JLabel BackgroundImage;
    private JLabel DoctorLabel;
    private JButton LogOut;
    private JSeparator jSeparator;

}
