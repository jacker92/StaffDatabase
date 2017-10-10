
package ui;

import data.Person;
import datastorage.DataStorage;
import datastorage.DataStorageError;
import javax.swing.JOptionPane;


public class AddPerson extends javax.swing.JFrame {
    
    DataStorage data = new DataStorage();

   
    public AddPerson() {
        initComponents();
        this.setLocation(50+MainWindow.width, MainWindow.height);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPersonLabel = new javax.swing.JLabel();
        personIDTextField = new javax.swing.JTextField();
        personNameTextField = new javax.swing.JTextField();
        personAgeTextField = new javax.swing.JTextField();
        personIDLabel = new javax.swing.JLabel();
        personNameLabel = new javax.swing.JLabel();
        personAgeLabel = new javax.swing.JLabel();
        addPersonButton = new javax.swing.JButton();
        exitButton = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 350));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addPersonLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        addPersonLabel.setForeground(new java.awt.Color(255, 255, 255));
        addPersonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPersonLabel.setText("Lisää henkilö");
        getContentPane().add(addPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 250, 40));
        getContentPane().add(personIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, -1));
        getContentPane().add(personNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, -1));
        getContentPane().add(personAgeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, -1));

        personIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        personIDLabel.setText("Henkilötunnus");
        getContentPane().add(personIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        personNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        personNameLabel.setText("Nimi");
        getContentPane().add(personNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, -1));

        personAgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        personAgeLabel.setText("Ikä");
        getContentPane().add(personAgeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        addPersonButton.setText("Lisää henkilö");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addPersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/background.jpg"))); // NOI18N
        backgroundLabel.setMaximumSize(new java.awt.Dimension(500, 300));
        backgroundLabel.setMinimumSize(new java.awt.Dimension(500, 300));
        backgroundLabel.setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
     this.dispose();
    }//GEN-LAST:event_exitButtonMouseReleased

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
       if (!personNameTextField.getText().equalsIgnoreCase("") && !personIDTextField.getText().equalsIgnoreCase("") && !personAgeTextField.getText().equalsIgnoreCase("")) {
           Person p1 = new Person (personIDTextField.getText(), personNameTextField.getText(), Integer.parseInt(personAgeTextField.getText()));
          try {
           data.addPerson(p1);   
          } catch(DataStorageError vt) {
                JOptionPane.showMessageDialog(this, vt, "virhe", JOptionPane.ERROR_MESSAGE);
            }
           
        this.dispose();
       }    else {
        JOptionPane.showMessageDialog(this, "You did not fill all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
           }
          
       
    }//GEN-LAST:event_addPersonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPersonButton;
    private javax.swing.JLabel addPersonLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel personAgeLabel;
    private javax.swing.JTextField personAgeTextField;
    private javax.swing.JLabel personIDLabel;
    private javax.swing.JTextField personIDTextField;
    private javax.swing.JLabel personNameLabel;
    private javax.swing.JTextField personNameTextField;
    // End of variables declaration//GEN-END:variables
}
