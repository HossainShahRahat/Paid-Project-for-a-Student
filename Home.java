import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class Home extends JFrame {

    public Home() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        DOCTOR = new JButton();
        USER = new JButton();
        ADMIN = new JButton();
        LoginPortal_Label = new JLabel();
        OurTeam = new JLabel();
        jLabel1 = new JLabel();
        jSeparator1 = new JSeparator();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        DOCTOR.setFont(new Font("Arial", 1, 24));
        DOCTOR.setText("DOCTOR");
        DOCTOR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DOCTORActionPerformed(evt);
            }
        });
        getContentPane().add(DOCTOR);
        DOCTOR.setBounds(130, 480, 460, 70);

        USER.setFont(new Font("Arial", 1, 24));
        USER.setText("USER");
        USER.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                USERActionPerformed(evt);
            }
        });
        getContentPane().add(USER);
        USER.setBounds(130, 390, 460, 70);

        ADMIN.setFont(new Font("Arial", 1, 24));
        ADMIN.setText("ADMIN");
        ADMIN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ADMINActionPerformed(evt);
            }
        });
        getContentPane().add(ADMIN);
        ADMIN.setBounds(130, 310, 460, 70);

        LoginPortal_Label.setFont(new Font("Arial", 1, 48));
        LoginPortal_Label.setForeground(new Color(255, 255, 255));
        LoginPortal_Label.setText("Login Portal");
        getContentPane().add(LoginPortal_Label);
        LoginPortal_Label.setBounds(210, 70, 300, 50);

        OurTeam.setFont(new Font("Arial", 0, 18));
        OurTeam.setForeground(new Color(255, 255, 255));
        OurTeam.setText(" Our Team");
        OurTeam.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                OurTeamMouseClicked(evt);
            }
        });
        getContentPane().add(OurTeam);
        OurTeam.setBounds(10, 680, 90, 30);

        jLabel1.setFont(new Font("Arial", 0, 24));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Who are you?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 250, 200, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(130, 150, 430, 20);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void ADMINActionPerformed(ActionEvent evt) {

        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        setVisible(false);
    }

    private void USERActionPerformed(ActionEvent evt) {

        UserLogin ul = new UserLogin();
        ul.setVisible(true);
        setVisible(false);
    }

    private void OurTeamMouseClicked(MouseEvent evt) {

        OurTeam ot = new OurTeam();
        ot.setVisible(true);
        setVisible(false);
    }

    private void DOCTORActionPerformed(ActionEvent evt) {

        DoctorLogin dl = new DoctorLogin();
        dl.setVisible(true);
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
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Home().setVisible(true);
            }
        });
    }


    private JButton ADMIN;
    public JLabel BackgroundImage;
    private JButton DOCTOR;
    private JLabel LoginPortal_Label;
    private JLabel OurTeam;
    private JButton USER;
    private JLabel jLabel1;
    private JSeparator jSeparator1;

}
