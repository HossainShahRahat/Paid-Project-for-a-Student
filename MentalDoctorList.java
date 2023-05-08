import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class MentalDoctorList extends JFrame {

    public MentalDoctorList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        DoctorList = new JLabel();
        jSeparator = new JSeparator();
        Back = new JButton();
        Forward = new JButton();
        ProfileLabel = new JLabel();
        DoctorNameLabel = new JLabel();
        AboutDoctorLabel = new JLabel();
        KnowMoreButton = new JButton();
        ProfileLabel1 = new JLabel();
        DoctorNameLabel1 = new JLabel();
        AboutDoctorLabel1 = new JLabel();
        KnowMoreButton1 = new JButton();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        DoctorList.setFont(new Font("Arial", 1, 24));
        DoctorList.setForeground(new Color(255, 255, 255));
        DoctorList.setText("Mental Doctor List");
        getContentPane().add(DoctorList);
        DoctorList.setBounds(250, 10, 250, 49);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(244, 51, 240, 10);

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

        ProfileLabel.setIcon(new ImageIcon(getClass().getResource("/icon/dr_mekhala_sarkar.png")));
        ProfileLabel.setText("jLabel1");
        getContentPane().add(ProfileLabel);
        ProfileLabel.setBounds(90, 120, 130, 130);

        DoctorNameLabel.setFont(new Font("Arial", 1, 18));
        DoctorNameLabel.setForeground(new Color(255, 255, 255));
        DoctorNameLabel.setText("Name: Dr. Mekhala Sarkar");
        getContentPane().add(DoctorNameLabel);
        DoctorNameLabel.setBounds(240, 130, 310, 30);

        AboutDoctorLabel.setFont(new Font("Arial", 0, 14));
        AboutDoctorLabel.setForeground(new Color(255, 255, 255));
        AboutDoctorLabel.setText("MBBS, FCPS (Psychiatry), Fellow WPA (Turkey)");
        getContentPane().add(AboutDoctorLabel);
        AboutDoctorLabel.setBounds(240, 160, 350, 30);

        KnowMoreButton.setFont(new Font("Arial", 0, 18));
        KnowMoreButton.setText("Know more");
        KnowMoreButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                KnowMoreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(KnowMoreButton);
        KnowMoreButton.setBounds(240, 200, 120, 30);

        ProfileLabel1.setIcon(new ImageIcon(getClass().getResource("/icon/dr-md-harunur-rashid.png")));
        ProfileLabel1.setText("jLabel1");
        getContentPane().add(ProfileLabel1);
        ProfileLabel1.setBounds(90, 270, 130, 130);

        DoctorNameLabel1.setFont(new Font("Arial", 1, 18));
        DoctorNameLabel1.setForeground(new Color(255, 255, 255));
        DoctorNameLabel1.setText("Name: Dr. Md. Harunur Rashid");
        getContentPane().add(DoctorNameLabel1);
        DoctorNameLabel1.setBounds(240, 280, 310, 30);

        AboutDoctorLabel1.setFont(new Font("Arial", 0, 14));
        AboutDoctorLabel1.setForeground(new Color(255, 255, 255));
        AboutDoctorLabel1.setText("MBBS (DU), M.Phil (BSMMU), MCPS, FCPS (Psychiatry)");
        getContentPane().add(AboutDoctorLabel1);
        AboutDoctorLabel1.setBounds(240, 310, 380, 30);

        KnowMoreButton1.setFont(new Font("Arial", 0, 18));
        KnowMoreButton1.setText("Know more");
        KnowMoreButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                KnowMoreButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(KnowMoreButton1);
        KnowMoreButton1.setBounds(240, 350, 120, 30);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        UserDoctorCheck udc = new UserDoctorCheck();
        udc.setVisible(true);
        setVisible(false);
    }

    private void KnowMoreButtonActionPerformed(ActionEvent evt) {

        MentalDoctorAbout1 mda = new MentalDoctorAbout1();
        mda.setVisible(true);
        setVisible(false);
    }

    private void KnowMoreButton1ActionPerformed(ActionEvent evt) {

        MentalDoctorAbout2 mda = new MentalDoctorAbout2();
        mda.setVisible(true);
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
            Logger.getLogger(MentalDoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MentalDoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MentalDoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MentalDoctorList.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalDoctorList().setVisible(true);
            }
        });
    }

    private JLabel AboutDoctorLabel;
    private JLabel AboutDoctorLabel1;
    private JButton Back;
    private JLabel BackgroundImage;
    private JLabel DoctorList;
    private JLabel DoctorNameLabel;
    private JLabel DoctorNameLabel1;
    private JButton Forward;
    private JButton KnowMoreButton;
    private JButton KnowMoreButton1;
    private JLabel ProfileLabel;
    private JLabel ProfileLabel1;
    private JSeparator jSeparator;

}
