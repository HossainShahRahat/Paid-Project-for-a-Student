import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class MentalDoctorAbout2 extends JFrame {

    public MentalDoctorAbout2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTextArea = new JTextArea();
        AboutLabel = new JLabel();
        jSeparator = new JSeparator();
        Back = new JButton();
        Forward = new JButton();
        ProfileLabel = new JLabel();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setFont(new Font("Arial", 0, 18));
        jTextArea.setRows(5);
        jTextArea.setText("Dr. Md. Harunur Rashid is a highly qualified psychiatrist based in Bangladesh.\nHe received his MBBS degree from Dhaka University and \ncompleted his M.Phil in psychiatry from Bangabandhu Sheikh Mujib Medical University \n(BSMMU).\nHe also holds MCPS and FCPS degrees in Psychiatry.\n");
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 720, 200);

        AboutLabel.setFont(new Font("Arial", 1, 24));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setText("About Dr. Md. Harunur Rashid");
        getContentPane().add(AboutLabel);
        AboutLabel.setBounds(180, 100, 380, 49);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(130, 150, 470, 20);

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

        ProfileLabel.setIcon(new ImageIcon(getClass().getResource("/icon/dr-md-harunur-rashid.png")));
        ProfileLabel.setText("jLabel1");
        getContentPane().add(ProfileLabel);
        ProfileLabel.setBounds(290, 170, 130, 130);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        MentalDoctorList mdl = new MentalDoctorList();
        mdl.setVisible(true);
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
            Logger.getLogger(MentalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MentalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MentalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MentalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalDoctorAbout2().setVisible(true);
            }
        });
    }

    private JLabel AboutLabel;
    private JButton Back;
    private JLabel BackgroundImage;
    private JButton Forward;
    private JLabel ProfileLabel;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator;
    private JTextArea jTextArea;

}
