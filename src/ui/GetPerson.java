package ui;

import data.Person;
import datastorage.DataStorage;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class GetPerson extends javax.swing.JFrame {
    
    static int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 300;
    static int height = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 200;
    DataStorage data = new DataStorage();

    public GetPerson() {
        initComponents();
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getPersonLabel = new javax.swing.JLabel();
        personIDTextField = new javax.swing.JTextField();
        personIDLabel = new javax.swing.JLabel();
        getPersonButton = new javax.swing.JButton();
        exitButton = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getPersonLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        getPersonLabel.setForeground(new java.awt.Color(255, 255, 255));
        getPersonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getPersonLabel.setText("Hae henkilö");
        getContentPane().add(getPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 12, 219, 42));
        getContentPane().add(personIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 131, 154, -1));

        personIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        personIDLabel.setText("Henkilötunnus");
        getContentPane().add(personIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 110, 154, -1));

        getPersonButton.setText("Hae henkilö");
        getPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPersonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(getPersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 168, -1, -1));

        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/background.jpg"))); // NOI18N
        backgroundLabel.setText("jLabel2");
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
    this.dispose();
    }//GEN-LAST:event_exitButtonMouseReleased

    private void getPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPersonButtonActionPerformed
    if (!personIDTextField.getText().equalsIgnoreCase("")) {
        try {
        Person p1 = data.getPerson(personIDTextField.getText());   
        JOptionPane.showMessageDialog(this, p1);
        } catch (Exception e) {
        }
        this.dispose();
    }
    }//GEN-LAST:event_getPersonButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GetPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel exitButton;
    private javax.swing.JButton getPersonButton;
    private javax.swing.JLabel getPersonLabel;
    private javax.swing.JLabel personIDLabel;
    private javax.swing.JTextField personIDTextField;
    // End of variables declaration//GEN-END:variables
}
