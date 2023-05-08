import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class PhysicalDoctorAbout2 extends JFrame {

    public PhysicalDoctorAbout2() {
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
        ProfileLabel1 = new JLabel();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTextArea.setEditable(false);
        jTextArea.setColumns(20);
        jTextArea.setFont(new Font("Arial", 0, 17));
        jTextArea.setRows(5);
        jTextArea.setText("Dr. Md. Arif Hossain is a highly skilled and experienced General, Laparoscopic, and \nColorectal Surgeon based in Dhaka, Bangladesh.\n\nHe holds an MBBS degree from Dhaka Medical College (DMC) and \nis certified by the Bangladesh Civil Service (BCS) in Health.\n\nHe has also earned prestigious international qualifications including FCPS (Surgery)\nfrom Bangladesh,\nFACS (Fellow of the American College of Surgeons) from the United States,\nFMAS (Fellowship in Minimal Access Surgery) from India, and\nEFIAGES (Fellow of the Indian Association of Gastrointestinal Endo Surgeons) from India.");
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 710, 250);

        AboutLabel.setFont(new Font("Arial", 1, 24));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setText("About Dr. Md. Arif Hossain");
        getContentPane().add(AboutLabel);
        AboutLabel.setBounds(210, 100, 350, 49);
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

        ProfileLabel1.setIcon(new ImageIcon(getClass().getResource("/icon/dr-md-arif-hossain.png")));
        ProfileLabel1.setText("jLabel1");
        getContentPane().add(ProfileLabel1);
        ProfileLabel1.setBounds(280, 180, 130, 130);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        PhysicalDoctorList pdl = new PhysicalDoctorList();
        pdl.setVisible(true);
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
            Logger.getLogger(PhysicalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PhysicalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PhysicalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PhysicalDoctorAbout2.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysicalDoctorAbout2().setVisible(true);
            }
        });
    }

    private JLabel AboutLabel;
    private JButton Back;
    private JLabel BackgroundImage;
    private JButton Forward;
    private JLabel ProfileLabel1;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator;
    private JTextArea jTextArea;

}
