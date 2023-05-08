import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class MentalDoctorAbout1 extends JFrame {

    public MentalDoctorAbout1() {
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
        jTextArea.setFont(new Font("Arial", 0, 17));
        jTextArea.setRows(5);
        jTextArea.setText("Dr. Mekhala Sarkar is a renowned physician who specializes in internal medicine and \nhas made significant contributions to the field of healthcare. \nShe is known for her expertise in diagnosing and treating a wide range of medical conditions,\nwith a particular focus on managing chronic diseases and promoting preventive care.\n\nDr. Sarkar obtained her medical degree from a prestigious medical school and\ncompleted her residency in internal medicine at a renowned hospital.\nShe has been practicing medicine for over 20 years and has gained extensive experience\nin providing compassionate and evidence-based care to her patients.\n");
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 720, 230);

        AboutLabel.setFont(new Font("Arial", 1, 24));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setText("About Dr. Mekhala Sarkar");
        getContentPane().add(AboutLabel);
        AboutLabel.setBounds(170, 100, 320, 49);
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

        ProfileLabel.setIcon(new ImageIcon(getClass().getResource("/icon/dr_mekhala_sarkar.png")));
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
            java.util.logging.Logger.getLogger(MentalDoctorAbout1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MentalDoctorAbout1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MentalDoctorAbout1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MentalDoctorAbout1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalDoctorAbout1().setVisible(true);
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
