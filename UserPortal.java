public class UserPortal extends javax.swing.JFrame {

    public UserPortal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        DoctorList = new javax.swing.JButton();
        Appointment = new javax.swing.JButton();
        About = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        DoctorList.setFont(new java.awt.Font("Arial", 1, 24));
        DoctorList.setText("Doctor List");
        DoctorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorListActionPerformed(evt);
            }
        });
        getContentPane().add(DoctorList);
        DoctorList.setBounds(150, 220, 430, 80);

        Appointment.setFont(new java.awt.Font("Arial", 1, 24));
        Appointment.setText("Appointment");
        Appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(Appointment);
        Appointment.setBounds(150, 330, 430, 80);

        About.setFont(new java.awt.Font("Arial", 1, 24));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        getContentPane().add(About);
        About.setBounds(150, 430, 430, 80);

        LogOut.setFont(new java.awt.Font("Arial", 1, 24));
        LogOut.setText("Log out");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut);
        LogOut.setBounds(150, 540, 430, 80);

        jPanel1.setBackground(new java.awt.Color(0, 156, 242));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 156, 242));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Welcome to Mentle-Guide");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 330, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 100);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blue.png")));
        BackgroundImage.setText("BackgroundImage");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 740, 740);

        setSize(new java.awt.Dimension(750, 750));
        setLocationRelativeTo(null);
    }

    private void AppointmentActionPerformed(java.awt.event.ActionEvent evt) {

        Appointment App = new Appointment();
        App.setVisible(true);
        setVisible(false);
    }

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {

        About about = new About();
        about.setVisible(true);
        setVisible(false);
    }

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {

        UserLogin ul = new UserLogin();
        ul.setVisible(true);
        setVisible(false);
    }

    private void DoctorListActionPerformed(java.awt.event.ActionEvent evt) {

        UserDoctorCheck udc = new UserDoctorCheck();
        udc.setVisible(true);
        setVisible(false);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPortal().setVisible(true);
            }
        });
    }

    private javax.swing.JButton About;
    private javax.swing.JButton Appointment;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton DoctorList;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;

}
