package DocumentConverter;

import Imagedesign.MainImageDesign;
import com.itextpdf.text.Document;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        bg.add(SingleImageBtn);
        bg.add(multipleImageBtn);
        pdfGenerateBtn.setEnabled(false);
        docGenerateBtn.setEnabled(false);
        getContentPane().setBackground(Color.orange);
        frameImageChange();
        sourceTextField.setEditable(false);
        destinationTextField.setEditable(false);
   
    }
     ButtonGroup bg= new ButtonGroup();
    File[] path;
    File f;
    static String pdffileName="";
    static String wordFileName="";
    static String fileName= "";
    static String destinationPath="";
    static  String newPath="";
    static JFileChooser sourceChooser; 
    static  String c="";
    static int selectedFileNumber=0;
    static Document documentForPdf = null;
    static String ard = null;
    static com.lowagie.text.Document documentforWord=null;
    SystemTray tray;
    TrayIcon trayIcon;
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pdfGenerateBtn = new javax.swing.JButton();
        docGenerateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SingleImageBtn = new javax.swing.JRadioButton();
        multipleImageBtn = new javax.swing.JRadioButton();
        documentNumberLabel = new javax.swing.JLabel();
        sourceLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        sourceTextField = new javax.swing.JTextField();
        destinationTextField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        SourceBrowserButton = new javax.swing.JButton();
        destinationBrowserButton = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel1.setLayout(null);

        pdfGenerateBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        pdfGenerateBtn.setText("Generate Pdf");
        pdfGenerateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdfGenerateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdfGenerateBtnMouseExited(evt);
            }
        });
        pdfGenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfGenerateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(pdfGenerateBtn);
        pdfGenerateBtn.setBounds(60, 320, 170, 50);

        docGenerateBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        docGenerateBtn.setText("Generate Word");
        docGenerateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                docGenerateBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                docGenerateBtnMouseExited(evt);
            }
        });
        docGenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docGenerateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(docGenerateBtn);
        docGenerateBtn.setBounds(260, 320, 180, 50);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setText("  Project Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 190, 40);

        SingleImageBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        SingleImageBtn.setForeground(new java.awt.Color(255, 255, 51));
        SingleImageBtn.setText("Single");
        SingleImageBtn.setOpaque(false);
        SingleImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleImageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SingleImageBtn);
        SingleImageBtn.setBounds(260, 220, 80, 30);

        multipleImageBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        multipleImageBtn.setForeground(new java.awt.Color(255, 255, 51));
        multipleImageBtn.setText("Multiple");
        multipleImageBtn.setOpaque(false);
        multipleImageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleImageBtnActionPerformed(evt);
            }
        });
        jPanel1.add(multipleImageBtn);
        multipleImageBtn.setBounds(360, 220, 90, 30);

        documentNumberLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        documentNumberLabel.setForeground(new java.awt.Color(255, 51, 51));
        documentNumberLabel.setText("Number Of Documents");
        jPanel1.add(documentNumberLabel);
        documentNumberLabel.setBounds(10, 210, 220, 50);

        sourceLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 28)); // NOI18N
        sourceLabel.setForeground(new java.awt.Color(255, 51, 51));
        sourceLabel.setText("Source");
        jPanel1.add(sourceLabel);
        sourceLabel.setBounds(40, 70, 140, 40);

        destinationLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 28)); // NOI18N
        destinationLabel.setForeground(new java.awt.Color(255, 51, 51));
        destinationLabel.setText("Destination");
        jPanel1.add(destinationLabel);
        destinationLabel.setBounds(40, 120, 150, 50);
        jPanel1.add(sourceTextField);
        sourceTextField.setBounds(230, 70, 150, 40);
        jPanel1.add(destinationTextField);
        destinationTextField.setBounds(230, 120, 150, 40);

        resetButton.setBackground(new java.awt.Color(255, 0, 0));
        resetButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        resetButton.setBounds(470, 280, 80, 40);

        SourceBrowserButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        SourceBrowserButton.setText("Browse");
        SourceBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceBrowserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SourceBrowserButton);
        SourceBrowserButton.setBounds(410, 70, 120, 40);

        destinationBrowserButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        destinationBrowserButton.setText("Browse");
        destinationBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationBrowserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(destinationBrowserButton);
        destinationBrowserButton.setBounds(410, 130, 120, 40);

        mainLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahitya Ratan\\Documents\\NetBeansProjects\\changingDocuments\\NEWPROJECT\\src\\DocumentConverter\\project backgroyund.jpg")); // NOI18N
        jPanel1.add(mainLabel);
        mainLabel.setBounds(0, 0, 590, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multipleImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleImageBtnActionPerformed
        if(multipleImageBtn.isSelected())
        {
            pdfGenerateBtn.setEnabled(true);
            docGenerateBtn.setEnabled(true);
        }  
    }//GEN-LAST:event_multipleImageBtnActionPerformed

    private void SingleImageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleImageBtnActionPerformed
       if(SingleImageBtn.isSelected())
        {
            pdfGenerateBtn.setEnabled(true);
            docGenerateBtn.setEnabled(true);
        }
    }//GEN-LAST:event_SingleImageBtnActionPerformed

    private void SourceBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceBrowserButtonActionPerformed
  try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
        sourceChooser = new JFileChooser();
        sourceChooser.setMultiSelectionEnabled(true);
        sourceChooser.showOpenDialog(this);
        File selectedFile = sourceChooser.getSelectedFile();
        if (selectedFile != null)
            {
             c = String.valueOf(sourceChooser.getSelectedFile());
             path = sourceChooser.getSelectedFiles();
             selectedFileNumber= path.length;
             String tempname1= String.valueOf(selectedFileNumber);
             String tempName2= " Files Selected";
             String finalName= tempname1+tempName2;
             sourceTextField.setText(finalName); 
            }
   
    
    }//GEN-LAST:event_SourceBrowserButtonActionPerformed

    private void destinationBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationBrowserButtonActionPerformed
    try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
        JFileChooser destinationChooser = new JFileChooser();
        destinationChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        destinationChooser.showOpenDialog(this);
        File selectedFile = destinationChooser.getSelectedFile();
        if (selectedFile != null)
            {
             String c = String.valueOf(destinationChooser.getSelectedFile());
             destinationTextField.setText(c);
             f = destinationChooser.getSelectedFile();
             path = f.listFiles();
            }
    }//GEN-LAST:event_destinationBrowserButtonActionPerformed

    private void pdfGenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfGenerateBtnActionPerformed
       String s= getSelectedButtonText(bg);  
       PdfClass pdfClass = new PdfClass();
       if(!sourceTextField.getText().equals(""))
         {
            if(!destinationTextField.getText().equals(""))
                {   
                    if(s.equals("Single"))
                        {
                         pdfClass.singleFile(destinationTextField);
                        }
                    else
                    {
                    pdfClass.multipleFiles(destinationTextField);
                    }
                } 
          }
    }//GEN-LAST:event_pdfGenerateBtnActionPerformed

    private void docGenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docGenerateBtnActionPerformed
       String s= getSelectedButtonText(bg);  
     WordClass wordClass = new WordClass();
             
       if(!sourceTextField.getText().equals(""))
     {
       if(!destinationTextField.getText().equals(""))
         {   
            if(s.equals("Single"))
             {
              wordClass.singleFile(destinationTextField);
             
             }
         else
            {
             wordClass.multipleFiles(destinationTextField);
            }
         }
      }
    }//GEN-LAST:event_docGenerateBtnActionPerformed

    private void pdfGenerateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfGenerateBtnMouseEntered
      pdfGenerateBtn.setBackground(Color.GREEN);
    }//GEN-LAST:event_pdfGenerateBtnMouseEntered

    private void pdfGenerateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdfGenerateBtnMouseExited
          pdfGenerateBtn.setBackground(UIManager.getColor("control"));
    }//GEN-LAST:event_pdfGenerateBtnMouseExited

    private void docGenerateBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docGenerateBtnMouseEntered
         docGenerateBtn.setBackground(Color.GREEN);       
    }//GEN-LAST:event_docGenerateBtnMouseEntered

    private void docGenerateBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docGenerateBtnMouseExited
          docGenerateBtn.setBackground(UIManager.getColor("control"));    
    }//GEN-LAST:event_docGenerateBtnMouseExited

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
      if (evt.getNewState() == ICONIFIED) 
       {
         try 
          {
             tray= SystemTray.getSystemTray();
             Image image=null;       
             try 
                {
                    image = ImageIO.read(getClass().getResource("projectIcon.jpg"));
                } 
             catch (IOException ex) 
                {
                    Logger.getLogger(MainImageDesign.class.getName()).log(Level.SEVERE, null, ex);
                }
        PopupMenu popup = new PopupMenu();
        //MenuItem exitItem = new MenuItem("Exit");
        //ActionListener exitListener = null;
       // exitItem.addActionListener(exitListener);
        MenuItem openItem = new MenuItem("Open");
        openItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
            {
                setVisible(true);
                setExtendedState(JFrame.NORMAL);
                tray.remove(trayIcon);
            }
        });
        //popup.add(exitItem);     
        popup.add(openItem);
             trayIcon = new TrayIcon(image, "Image Converter App", popup);
             trayIcon.setImageAutoSize(true);
             tray.add(trayIcon);
             setVisible(false);
          } 
        catch (AWTException ex) 
        {
         System.out.print("incorect code");
        }
        }               
    }//GEN-LAST:event_formWindowStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        sourceTextField.setText("");
        destinationTextField.setText("");
        bg.clearSelection();
        pdfGenerateBtn.setEnabled(false);
        docGenerateBtn.setEnabled(false);
    }//GEN-LAST:event_resetButtonActionPerformed

      private void frameImageChange() 
      {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("projectIcon.jpg")));
        setResizable(false);
        setTitle("Document Converter");
      }
   
    
    public void clearFields()
    {
      sourceTextField.setText("");
      destinationTextField.setText("");
    }
      
      
      public String getSelectedButtonText(ButtonGroup buttonGroup) 
    {
       for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
        {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) 
                {
                     return button.getText();
                }
        }

        return null;
    }
    
      
      
      
      public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton SingleImageBtn;
    private javax.swing.JButton SourceBrowserButton;
    private javax.swing.JButton destinationBrowserButton;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JButton docGenerateBtn;
    private javax.swing.JLabel documentNumberLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JRadioButton multipleImageBtn;
    private javax.swing.JButton pdfGenerateBtn;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JTextField sourceTextField;
    // End of variables declaration//GEN-END:variables
}
