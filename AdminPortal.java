import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class AdminPortal extends JFrame {

    public AdminPortal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        AboutLabel = new JLabel();
        jSeparator = new JSeparator();
        Back = new JButton();
        Forward = new JButton();
        LogOut = new JButton();
        UserListButton = new JButton();
        DoctorListButton = new JButton();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        AboutLabel.setFont(new Font("Arial", 1, 24));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setText("Admin Portal");
        getContentPane().add(AboutLabel);
        AboutLabel.setBounds(276, 10, 160, 49);
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

        LogOut.setFont(new Font("Arial", 1, 24));
        LogOut.setText("Log out");
        LogOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(140, 410, 430, 60);

        UserListButton.setFont(new Font("Arial", 1, 24));
        UserListButton.setText("User List");
        UserListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UserListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UserListButton);
        UserListButton.setBounds(140, 240, 430, 60);

        DoctorListButton.setFont(new Font("Arial", 1, 24));
        DoctorListButton.setText("Doctor List");
        DoctorListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DoctorListButton);
        DoctorListButton.setBounds(140, 330, 430, 60);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        setVisible(false);
    }

    private void LogOutActionPerformed(ActionEvent evt) {

        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        setVisible(false);
    }

    private void UserListButtonActionPerformed(ActionEvent evt) {

        UserList ul = new UserList();
        ul.setVisible(true);
        setVisible(false);
    }

    private void DoctorListButtonActionPerformed(ActionEvent evt) {

        DoctorList dl = new DoctorList();
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
            Logger.getLogger(AdminPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AdminPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AdminPortal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AdminPortal.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    private JLabel AboutLabel;
    private JButton Back;
    private JLabel BackgroundImage;
    private JButton DoctorListButton;
    private JButton Forward;
    private JButton LogOut;
    private JButton UserListButton;
    private JSeparator jSeparator;

}
