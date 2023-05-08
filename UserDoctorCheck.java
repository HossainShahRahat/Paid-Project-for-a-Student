import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class UserDoctorCheck extends JFrame {

    public UserDoctorCheck() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        Mental = new JButton();
        DoctorType = new JLabel();
        Physical = new JButton();
        jSeparator1 = new JSeparator();
        Forward = new JButton();
        Back = new JButton();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Mental.setFont(new Font("Arial", 1, 24));
        Mental.setText("Mental");
        Mental.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MentalActionPerformed(evt);
            }
        });
        getContentPane().add(Mental);
        Mental.setBounds(410, 220, 180, 80);

        DoctorType.setFont(new Font("Arial", 1, 36));
        DoctorType.setForeground(new Color(255, 255, 255));
        DoctorType.setText("Doctor Type");
        getContentPane().add(DoctorType);
        DoctorType.setBounds(260, 90, 220, 50);

        Physical.setFont(new Font("Arial", 1, 24));
        Physical.setText("Physical");
        Physical.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PhysicalActionPerformed(evt);
            }
        });
        getContentPane().add(Physical);
        Physical.setBounds(130, 220, 180, 80);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(160, 150, 440, 10);

        Forward.setFont(new Font("Segoe UI Semilight", 1, 24));
        Forward.setText("->");
        Forward.setEnabled(false);
        getContentPane().add(Forward);
        Forward.setBounds(79, 18, 67, 43);

        Back.setFont(new Font("Segoe UI Semilight", 1, 24));
        Back.setText("<-");
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(6, 18, 67, 43);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void PhysicalActionPerformed(ActionEvent evt) {

        PhysicalDoctorList pdl = new PhysicalDoctorList();
        pdl.setVisible(true);
        setVisible(false);
    }

    private void MentalActionPerformed(ActionEvent evt) {

        MentalDoctorList mdl = new MentalDoctorList();
        mdl.setVisible(true);
        setVisible(false);
    }

    private void BackActionPerformed(ActionEvent evt) {

        UserPortal up = new UserPortal();
        up.setVisible(true);
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
            Logger.getLogger(UserDoctorCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UserDoctorCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UserDoctorCheck.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserDoctorCheck.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDoctorCheck().setVisible(true);
            }
        });
    }


    private JButton Back;
    private JLabel BackgroundImage;
    private JLabel DoctorType;
    private JButton Forward;
    private JButton Mental;
    private JButton Physical;
    private JSeparator jSeparator1;

}
