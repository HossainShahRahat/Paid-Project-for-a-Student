import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class DoctorList extends JFrame {

    public DoctorList() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        DoctorList = new JLabel();
        jSeparator = new JSeparator();
        Back = new JButton();
        Forward = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        DoctorList.setFont(new Font("Arial", 1, 24));
        DoctorList.setForeground(new Color(255, 255, 255));
        DoctorList.setText("Doctor List");
        getContentPane().add(DoctorList);
        DoctorList.setBounds(296, 10, 140, 49);
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

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Age", "Category"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 680, 590);

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        AdminPortal ap = new AdminPortal();
        ap.setVisible(true);
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
            Logger.getLogger(DoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DoctorList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DoctorList.class.getName()).log(Level.SEVERE, null, ex);
        }


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorList().setVisible(true);
            }
        });
    }

    private JButton Back;
    private JLabel BackgroundImage;
    private JLabel DoctorList;
    private JButton Forward;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator;
    private JTable jTable1;
}
