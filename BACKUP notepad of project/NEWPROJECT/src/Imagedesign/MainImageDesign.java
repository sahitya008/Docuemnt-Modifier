package Imagedesign;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import MergerDesign.*;
import java.awt.Dialog;



public class MainImageDesign extends javax.swing.JFrame {
   // public MainImageDesign(JDialog mainjd, ModalityType modalityType) 
    public MainImageDesign() 
    {
            initComponents();
           /* this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent)
                {
                    setExtendedState(JFrame.ICONIFIED); 
                } });
        */
        resetButton.setEnabled(false);
        frameProperties();
        saveButton.setEnabled(false);
        sizeTextField.setEditable(false);
        sourceTextField.setEditable(false);
        destinationTextField.setEditable(false);
      }
    
     ButtonGroup bg= new ButtonGroup();
     static JFileChooser sourceChooser;
     static JFileChooser destinationChooser;
     static BufferedImage scaledImg;
     static String i=null;
     static BufferedImage imgSize;
     static  File outputfile; 
     static File arr;     


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sourceTextField = new javax.swing.JTextField();
        sourceBrowseBtn = new javax.swing.JButton();
        destinationBrowseBtn = new javax.swing.JButton();
        destinationTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        widthTextField = new javax.swing.JTextField();
        destinationLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        widthLabel = new javax.swing.JLabel();
        sourceLabel = new javax.swing.JLabel();
        getSizeButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        sizeLabel = new javax.swing.JLabel();
        sizeTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        ProjectNameLabel = new javax.swing.JLabel();
        MainLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Image Converter\n");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jPanel1.setLayout(null);
        jPanel1.add(sourceTextField);
        sourceTextField.setBounds(140, 80, 120, 40);

        sourceBrowseBtn.setBackground(new java.awt.Color(204, 204, 204));
        sourceBrowseBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        sourceBrowseBtn.setText("Browse");
        sourceBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceBrowseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sourceBrowseBtn);
        sourceBrowseBtn.setBounds(280, 80, 90, 40);

        destinationBrowseBtn.setBackground(new java.awt.Color(204, 204, 204));
        destinationBrowseBtn.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        destinationBrowseBtn.setText("Browse");
        destinationBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationBrowseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(destinationBrowseBtn);
        destinationBrowseBtn.setBounds(280, 140, 90, 40);
        jPanel1.add(destinationTextField);
        destinationTextField.setBounds(140, 140, 120, 40);
        jPanel1.add(heightTextField);
        heightTextField.setBounds(140, 200, 80, 30);
        jPanel1.add(widthTextField);
        widthTextField.setBounds(320, 200, 80, 30);

        destinationLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        destinationLabel.setForeground(new java.awt.Color(255, 0, 41));
        destinationLabel.setText("Destination");
        jPanel1.add(destinationLabel);
        destinationLabel.setBounds(10, 130, 120, 50);

        heightLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        heightLabel.setForeground(new java.awt.Color(255, 0, 41));
        heightLabel.setText("Height");
        jPanel1.add(heightLabel);
        heightLabel.setBounds(40, 200, 70, 40);

        widthLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        widthLabel.setForeground(new java.awt.Color(255, 0, 41));
        widthLabel.setText("  Width");
        jPanel1.add(widthLabel);
        widthLabel.setBounds(240, 200, 70, 40);

        sourceLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        sourceLabel.setForeground(new java.awt.Color(255, 0, 41));
        sourceLabel.setText("   Source");
        jPanel1.add(sourceLabel);
        sourceLabel.setBounds(10, 80, 110, 40);

        getSizeButton.setBackground(new java.awt.Color(0, 0, 0));
        getSizeButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        getSizeButton.setForeground(new java.awt.Color(255, 255, 255));
        getSizeButton.setText("Get Size");
        getSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSizeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(getSizeButton);
        getSizeButton.setBounds(470, 200, 100, 40);

        resetButton.setBackground(new java.awt.Color(0, 0, 0));
        resetButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 51, 51));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resetButton);
        resetButton.setBounds(470, 270, 100, 40);

        sizeLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 20)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(255, 0, 41));
        sizeLabel.setText(" File Size");
        jPanel1.add(sizeLabel);
        sizeLabel.setBounds(30, 260, 80, 40);
        jPanel1.add(sizeTextField);
        sizeTextField.setBounds(140, 270, 80, 30);

        saveButton.setBackground(new java.awt.Color(0, 0, 255));
        saveButton.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(saveButton);
        saveButton.setBounds(220, 330, 90, 40);

        ProjectNameLabel.setBackground(new java.awt.Color(226, 136, 12));
        ProjectNameLabel.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        ProjectNameLabel.setText("     Project Name");
        ProjectNameLabel.setOpaque(true);
        jPanel1.add(ProjectNameLabel);
        ProjectNameLabel.setBounds(200, 10, 200, 50);

        MainLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahitya Ratan\\Documents\\NetBeansProjects\\changingDocuments\\NEWPROJECT\\src\\Imagedesign\\project backgroyund.jpg")); // NOI18N
        jPanel1.add(MainLabel);
        MainLabel.setBounds(0, 0, 630, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

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

    private void sourceBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceBrowseBtnActionPerformed
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
       
        sourceChooser= new JFileChooser();
        sourceChooser.showOpenDialog(this);
        String c = String.valueOf(sourceChooser.getSelectedFile());
        sourceTextField.setText(c);
        
    }//GEN-LAST:event_sourceBrowseBtnActionPerformed

    private void destinationBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationBrowseBtnActionPerformed
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }
           destinationChooser= new JFileChooser();
           destinationChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           destinationChooser.showOpenDialog(this);
           String c = String.valueOf(destinationChooser.getSelectedFile());
           destinationTextField.setText(c);    
           //String selectedFileName=sourceChooser.getName();
           //System.out.print(selectedFileName);
          
        
    }//GEN-LAST:event_destinationBrowseBtnActionPerformed

    private void getSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSizeButtonActionPerformed
        if(!heightTextField.getText().equals("")&& !widthTextField.getText().equals("")&& !sourceTextField.getText().equals("")&& !destinationTextField.getText().equals(""))
         {
            String newImageName= "NewImage.jpg";
            String tempheight=heightTextField.getText();
            int ImageHeight= Integer.parseInt(tempheight);
            String tempwidth= widthTextField.getText();
            int ImageWidth= Integer.parseInt(tempwidth);
            arr= sourceChooser.getSelectedFile();
         
            // DECREASING SIZE BY PIXELS
            try {
                 BufferedImage img1= ImageIO.read(arr);
                 scaledImg = Scalr.resize(img1,ImageWidth, ImageHeight);
                }
            catch (IOException ex) 
                {
                   ex.printStackTrace();
                }
            outputfile= new File(newImageName);
            try {
                ImageIO.write(scaledImg, "jpg", outputfile);
               //FINDING SIZE
                long bytes = outputfile.length();
                long kilobytes = ((bytes / 1024)+1);
                if(kilobytes<1000)
                {
                System.out.print(kilobytes);
                    String FileSizeinKB=  String.valueOf(kilobytes);
                    String kB= "KB";
                    String FinalString= FileSizeinKB+kB;
                    sizeTextField.setText(FinalString);
                }
                else
                {
                    double megabytes= (double) kilobytes;
                    double megaBytes=((megabytes/1024));
                    String FileSizeinMB=  String.valueOf(megaBytes);
                    String mb= "MB";
                    String FinalString= FileSizeinMB+ mb;
                    sizeTextField.setText(FinalString);
                }
                
            }
                  catch (IOException ex) 
                {
                    ex.printStackTrace();
                }
              resetButton.setEnabled(true);
              saveButton.setEnabled(true);
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
        }
                
            
    }//GEN-LAST:event_getSizeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        heightTextField.setText("");
        widthTextField.setText("");
        sizeTextField.setText(""); 
        outputfile.delete();
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
                   
    if(!sizeTextField.getText().equals(""))
    {
          String path= destinationTextField.getText();
          String newImageName= "NewImage.jpg";
          String newPath= path+ newImageName;
          String tempheight=heightTextField.getText();
          int ImageHeight= Integer.parseInt(tempheight);
          String tempwidth= widthTextField.getText();
          int ImageWidth= Integer.parseInt(tempwidth);
          arr= sourceChooser.getSelectedFile();
         
            // DECREASING SIZE BY PIXELS
          try 
             {
               BufferedImage img1= ImageIO.read(arr);
               scaledImg = Imagedesign.Scalr.resize(img1,ImageWidth, ImageHeight);
             }
          catch (IOException ex) 
            {
                ex.printStackTrace();
            }
         File finalOutputfile= new File(newPath);
          try 
            {
                ImageIO.write(scaledImg, "jpg", finalOutputfile);
                outputfile.delete();
            }
          catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        JOptionPane.showMessageDialog(this, "Image created. Changes Saved!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
    }                    
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if(!sizeTextField.getText().equals(""))
       {
        outputfile.delete();
       }
       //System.exit(0);
    }//GEN-LAST:event_formWindowClosing
    
    
    private void frameProperties()
    {
     setResizable(false);
     setTitle("Image Converter");
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("projectIcon.jpg")));
       
    }
    
   SystemTray tray;
   TrayIcon trayIcon;
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new MainImageDesign(JDialog , DEFAULT_MODALITY_TYPE).setVisible(true);
                new MainImageDesign().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainLabel;
    private javax.swing.JLabel ProjectNameLabel;
    private javax.swing.JButton destinationBrowseBtn;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JButton getSizeButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JButton sourceBrowseBtn;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JTextField sourceTextField;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
