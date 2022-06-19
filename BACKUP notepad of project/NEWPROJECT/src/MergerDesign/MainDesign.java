package MergerDesign;

import DocumentConverter.*;    
import Imagedesign.MainImageDesign;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.UIManager;
/**
 *
 * @author Sahitya Ratan
 */
public class MainDesign extends javax.swing.JFrame {
    public MainDesign() 
    {
       initComponents();
       frameIconChange();   
        //imageConverterButton.setBorderPainted(false); 
       // imageConverterButton.setContentAreaFilled(false); 
       // imageConverterButton.setFocusPainted(false); 
       // imageConverterButton.setOpaque(false);
    
    }
     MainImageDesign imageObject=  new MainImageDesign();
     NewJFrame  documentObject = new NewJFrame();
     // JDialog mainjd= new JDialog(this);
      
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ProjectNameLabel = new javax.swing.JLabel();
        documentConverterButton = new javax.swing.JButton();
        imageConverterButton = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setLayout(null);

        ProjectNameLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 48)); // NOI18N
        ProjectNameLabel.setForeground(new java.awt.Color(255, 51, 51));
        ProjectNameLabel.setText("Project Report");
        ProjectNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainPanel.add(ProjectNameLabel);
        ProjectNameLabel.setBounds(220, 10, 290, 90);

        documentConverterButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        documentConverterButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahitya Ratan\\Documents\\NetBeansProjects\\changingDocuments\\NEWPROJECT\\src\\MergerDesign\\DirectoryIcon-300x300.png")); // NOI18N
        documentConverterButton.setText("Document Converter");
        documentConverterButton.setBorder(new javax.swing.border.MatteBorder(null));
        documentConverterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        documentConverterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                documentConverterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                documentConverterButtonMouseExited(evt);
            }
        });
        documentConverterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentConverterButtonActionPerformed(evt);
            }
        });
        MainPanel.add(documentConverterButton);
        documentConverterButton.setBounds(50, 170, 240, 240);

        imageConverterButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 26)); // NOI18N
        imageConverterButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahitya Ratan\\Documents\\NetBeansProjects\\changingDocuments\\NEWPROJECT\\src\\MergerDesign\\imagesConvertBtn.jpg")); // NOI18N
        imageConverterButton.setText("Image Converter");
        imageConverterButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imageConverterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imageConverterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageConverterButtonMouseExited(evt);
            }
        });
        imageConverterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageConverterButtonActionPerformed(evt);
            }
        });
        MainPanel.add(imageConverterButton);
        imageConverterButton.setBounds(350, 170, 240, 240);

        mainLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahitya Ratan\\Documents\\NetBeansProjects\\changingDocuments\\NEWPROJECT\\src\\MergerDesign\\future science fiction stasis 2560x1600 wallpaper_www.wall321.com_81.jpg")); // NOI18N
        MainPanel.add(mainLabel);
        mainLabel.setBounds(0, 0, 660, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageConverterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageConverterButtonMouseEntered
        imageConverterButton.setBackground(Color.red);
    }//GEN-LAST:event_imageConverterButtonMouseEntered

    private void imageConverterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageConverterButtonActionPerformed
      if(!imageObject.isActive())
       {
        imageObject.setVisible(true);
        documentConverterButton.setEnabled(false);
        imageConverterButton.setEnabled(false);
       }
      imageObject.addWindowListener(new WindowAdapter() 
      {
        public void windowClosing(WindowEvent e) 
            {
                imageObject.setVisible(false);
                imageObject.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                imageObject.dispose();
                documentConverterButton.setEnabled(true);
                imageConverterButton.setEnabled(true);
            }
      });       
    }//GEN-LAST:event_imageConverterButtonActionPerformed

    private void imageConverterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageConverterButtonMouseExited
               imageConverterButton.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_imageConverterButtonMouseExited

    private void documentConverterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentConverterButtonMouseEntered
                 documentConverterButton.setBackground(Color.red);
    }//GEN-LAST:event_documentConverterButtonMouseEntered

    private void documentConverterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentConverterButtonMouseExited
               documentConverterButton.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_documentConverterButtonMouseExited

    private void documentConverterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentConverterButtonActionPerformed

        
           if(!documentObject.isActive())
      {
          documentObject.setVisible(true);
         documentConverterButton.setEnabled(false);
         imageConverterButton.setEnabled(false);
      }
      documentObject.addWindowListener(new WindowAdapter() 
      {
        public void windowClosing(WindowEvent e) 
            {
                documentObject.setVisible(false);
                documentObject.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                documentObject.dispose();
                documentConverterButton.setEnabled(true);
                imageConverterButton.setEnabled(true);
            }
      });
    }//GEN-LAST:event_documentConverterButtonActionPerformed
 
    private void frameIconChange()
      {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mergerFrameIcon.png")));
        setResizable(false);
        setTitle("Project - Sahitya Ratan");
      }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDesign().setVisible(true);
            }
        });
   }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ProjectNameLabel;
    private javax.swing.JButton documentConverterButton;
    private javax.swing.JButton imageConverterButton;
    private javax.swing.JLabel mainLabel;
    // End of variables declaration//GEN-END:variables
}
