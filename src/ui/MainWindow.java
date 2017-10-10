package ui;

import java.awt.Frame;
import java.awt.Toolkit;
import data.*;
import datastorage.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class MainWindow extends javax.swing.JFrame {

    // Initialize variables
    // Get the screen's height and width for window's correct placement
    static int width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 300;
    static int height = (Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 200;
    int xMouse;
    int yMouse;
    DataStorage data = new DataStorage();

    public MainWindow() {
        initComponents();
        getAllPersons();

        // Let's get all the persons from database
        this.setLocation(width, height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        minimizeButton = new javax.swing.JLabel();
        addPersonButton = new javax.swing.JButton();
        deletePersonButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        personsList = new javax.swing.JList<Person>(new DefaultListModel<Person>());
        refreshPersonsButton = new javax.swing.JButton();
        getPersonButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        personLabel.setForeground(new java.awt.Color(255, 255, 255));
        personLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personLabel.setText("Henkilö");
        getContentPane().add(personLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 21, 229, 43));

        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitButtonMouseReleased(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, -1));

        minimizeButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        minimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        minimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeButton.setText("-");
        minimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeButtonMouseReleased(evt);
            }
        });
        getContentPane().add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 20, 20));

        addPersonButton.setText("Lisää henkilö");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addPersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, 40));

        deletePersonButton.setText("Poista henkilö");
        deletePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deletePersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, 40));

        jScrollPane2.setViewportView(personsList);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 270, -1));

        refreshPersonsButton.setText("Päivitä");
        refreshPersonsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPersonsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(refreshPersonsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 160, 40));

        getPersonButton.setText("Hae henkilö");
        getPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPersonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(getPersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 160, 40));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/background.jpg"))); // NOI18N
        backgroundLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundLabelMouseDragged(evt);
            }
        });
        backgroundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundLabelMousePressed(evt);
            }
        });
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseReleased
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseReleased

    private void minimizeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeButtonMouseReleased
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonMouseReleased

    private void backgroundLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundLabelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_backgroundLabelMousePressed

    private void backgroundLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundLabelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_backgroundLabelMouseDragged

    private void deletePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonButtonActionPerformed
        if (personsList.getSelectedValue() != null) {
            try {
  

            data.deletePerson(personsList.getSelectedValue().getPersonID());
            } catch (DataStorageError vt) {
                JOptionPane.showMessageDialog(this, vt, "virhe", JOptionPane.ERROR_MESSAGE);
            }
            
            getAllPersons();

        }
    }//GEN-LAST:event_deletePersonButtonActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
      new AddPerson().setVisible(true);
    }//GEN-LAST:event_addPersonButtonActionPerformed

    private void refreshPersonsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPersonsButtonActionPerformed
    getAllPersons(); 
    }//GEN-LAST:event_refreshPersonsButtonActionPerformed

    private void getPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPersonButtonActionPerformed
     new GetPerson().setVisible(true);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPersonButton;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton deletePersonButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JButton getPersonButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minimizeButton;
    private javax.swing.JLabel personLabel;
    private javax.swing.JList<Person> personsList;
    private javax.swing.JButton refreshPersonsButton;
    // End of variables declaration//GEN-END:variables

    private void getAllPersons() {
        try {
            String names = "";
            int count = personsList.getModel().getSize();
            for (int i = 0; i < count; i++) {
                ((DefaultListModel)personsList.getModel()).removeElementAt(0);
            }
            for (Person alkio : data.getAllPersons()) {
                ((DefaultListModel) personsList.getModel()).addElement(alkio);
            }
        } catch (DataStorageError vt) {
            JOptionPane.showMessageDialog(this, vt, "virhe", JOptionPane.ERROR_MESSAGE);
        }
    }

}
