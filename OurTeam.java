import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
import java.util.logging.Level.*;

public class OurTeam extends JFrame {

    public OurTeam() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jSeparator = new JSeparator();
        AboutLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        OurTeamLabel = new JLabel();
        jSeparator1 = new JSeparator();
        Rohan = new JLabel();
        Rohan1 = new JLabel();
        Rohan2 = new JLabel();
        RohanLabel = new JLabel();
        RohanIDLabel = new JLabel();
        SupervisorLabel = new JLabel();
        jSeparator2 = new JSeparator();
        ShakilLabel1 = new JLabel();
        ShakilLabel = new JLabel();
        ShakilIDLabel = new JLabel();
        AbdullahLabel = new JLabel();
        AbdullahIDLabel = new JLabel();
        Back = new JButton();
        Forward = new JButton();
        BackgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator);
        jSeparator.setBounds(200, 130, 300, 10);

        AboutLabel.setFont(new Font("Arial", 1, 24));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setText("About HealthGuide");
        getContentPane().add(AboutLabel);
        AboutLabel.setBounds(230, 80, 290, 60);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Arial", 0, 18));
        jTextArea1.setRows(5);
        jTextArea1.setText("HealthGuide is a comprehensive health and wellness platform that \nprovides personalized information, guidance, and support for individuals to achieve\nand maintain optimal health. \nIt covers various aspects of health, offers evidence-based recommendations,\nand includes features such as health assessments, goal tracking, meal planning,\nand access to acommunity of health experts and peers.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 150, 720, 160);

        OurTeamLabel.setFont(new Font("Arial", 1, 24));
        OurTeamLabel.setForeground(new Color(255, 255, 255));
        OurTeamLabel.setText("Our Team");
        getContentPane().add(OurTeamLabel);
        OurTeamLabel.setBounds(280, 310, 120, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(190, 620, 300, 10);

        Rohan.setIcon(new ImageIcon(getClass().getResource("/icon/Rohan.jpg")));
        Rohan.setText("jLabel1");
        Rohan.setMaximumSize(new Dimension(520, 520));
        Rohan.setMinimumSize(new Dimension(520, 520));
        Rohan.setPreferredSize(new Dimension(520, 520));
        getContentPane().add(Rohan);
        Rohan.setBounds(480, 380, 140, 140);

        Rohan1.setIcon(new ImageIcon(getClass().getResource("/icon/Abdullah.jpg")));
        Rohan1.setText("jLabel1");
        Rohan1.setMaximumSize(new Dimension(520, 520));
        Rohan1.setMinimumSize(new Dimension(520, 520));
        Rohan1.setPreferredSize(new Dimension(520, 520));
        getContentPane().add(Rohan1);
        Rohan1.setBounds(280, 380, 140, 140);

        Rohan2.setIcon(new ImageIcon(getClass().getResource("/icon/Shakil.jpeg")));
        Rohan2.setText("jLabel1");
        Rohan2.setMaximumSize(new Dimension(520, 520));
        Rohan2.setMinimumSize(new Dimension(520, 520));
        Rohan2.setPreferredSize(new Dimension(520, 520));
        getContentPane().add(Rohan2);
        Rohan2.setBounds(70, 380, 140, 140);

        RohanLabel.setFont(new Font("Arial", 1, 14));
        RohanLabel.setForeground(new Color(255, 255, 255));
        RohanLabel.setText("Robayed Mahmud Rohan");
        getContentPane().add(RohanLabel);
        RohanLabel.setBounds(460, 540, 180, 22);

        RohanIDLabel.setFont(new Font("Arial", 0, 14));
        RohanIDLabel.setForeground(new Color(255, 255, 255));
        RohanIDLabel.setText("ID:22-49475-3");
        getContentPane().add(RohanIDLabel);
        RohanIDLabel.setBounds(490, 560, 100, 17);

        SupervisorLabel.setFont(new Font("Arial", 1, 24));
        SupervisorLabel.setForeground(new Color(255, 255, 255));
        SupervisorLabel.setText("Supervisor");
        getContentPane().add(SupervisorLabel);
        SupervisorLabel.setBounds(270, 590, 130, 28);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(200, 360, 300, 10);

        ShakilLabel1.setFont(new Font("Arial", 1, 18));
        ShakilLabel1.setForeground(new Color(255, 255, 255));
        ShakilLabel1.setText("MD. NAZMUL HOSSAIN");
        getContentPane().add(ShakilLabel1);
        ShakilLabel1.setBounds(240, 640, 220, 22);

        ShakilLabel.setFont(new Font("Arial", 1, 14));
        ShakilLabel.setForeground(new Color(255, 255, 255));
        ShakilLabel.setText("Rakibul Hasan Shakil");
        getContentPane().add(ShakilLabel);
        ShakilLabel.setBounds(60, 540, 180, 22);

        ShakilIDLabel.setFont(new Font("Arial", 0, 14));
        ShakilIDLabel.setForeground(new Color(255, 255, 255));
        ShakilIDLabel.setText("ID:22-49462-3");
        getContentPane().add(ShakilIDLabel);
        ShakilIDLabel.setBounds(90, 560, 100, 17);

        AbdullahLabel.setFont(new Font("Arial", 1, 14));
        AbdullahLabel.setForeground(new Color(255, 255, 255));
        AbdullahLabel.setText("Abdul Rahman");
        getContentPane().add(AbdullahLabel);
        AbdullahLabel.setBounds(290, 540, 110, 22);

        AbdullahIDLabel.setFont(new Font("Arial", 0, 14));
        AbdullahIDLabel.setForeground(new Color(255, 255, 255));
        AbdullahIDLabel.setText("ID:22-49444-3");
        getContentPane().add(AbdullahIDLabel);
        AbdullahIDLabel.setBounds(300, 560, 100, 17);

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

        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText(" BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, -20, 740, 750);

        setSize(new Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void BackActionPerformed(ActionEvent evt) {

        Home home = new Home();
        home.setVisible(true);
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
            Logger.getLogger(OurTeam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(OurTeam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(OurTeam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(OurTeam.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OurTeam().setVisible(true);
            }
        });
    }

    private JLabel AbdullahIDLabel;
    private JLabel AbdullahLabel;
    private JLabel AboutLabel;
    private JButton Back;
    private JLabel BackgroundImage;
    private JButton Forward;
    private JLabel OurTeamLabel;
    private JLabel Rohan;
    private JLabel Rohan1;
    private JLabel Rohan2;
    private JLabel RohanIDLabel;
    private JLabel RohanLabel;
    private JLabel ShakilIDLabel;
    private JLabel ShakilLabel;
    private JLabel ShakilLabel1;
    private JLabel SupervisorLabel;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextArea jTextArea1;

}
