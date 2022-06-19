package DocumentConverter;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;


public class PdfClass extends NewJFrame {
 public  void singleFile(JTextField destinationTextField)
       {    
             //SPECIFYING FILE DESTINATION
             destinationPath= destinationTextField.getText();
             fileName="\\ProjectPdf.pdf";
             newPath= destinationPath+fileName;
             //SPECIFYING FILE SOURCE
             documentForPdf= new Document();
             try 
             {
                try 
                {
                    PdfWriter.getInstance(documentForPdf, new FileOutputStream(newPath));
                } 
                catch (FileNotFoundException ex) 
                {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
             } 
             catch (DocumentException ex) 
             {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
             documentForPdf.open();
             Image img = null;
             for(int i=0;i<selectedFileNumber;i++)
             {
                 File ft[]=   sourceChooser.getSelectedFiles();
                 ard= ft[i].getPath();
                 setImageToPdf(documentForPdf, img, ard, newPath);
             }
            documentForPdf.close();
        } 
 
 //MULTIPLE FILES GENERATION
       public void multipleFiles(JTextField destinationTextField )
           { 
            System.out.print("multiple button selected");
            Image img = null;
            //NEW DOCUMENT GENERATION
            for(int i=0;i<selectedFileNumber;i++)
             {
                File ft[]=   sourceChooser.getSelectedFiles();
                ard= ft[i].getPath();
                //DESTINATION PATH
                destinationPath=destinationTextField.getText();
                pdffileName="\\"+i+".pdf";
                newPath= destinationPath+pdffileName;
                //NEW DOCUMENT CREATED
                Document MultiplePdfdocument = new Document();
                try 
                {
                try 
                    {
                        PdfWriter.getInstance(MultiplePdfdocument, new FileOutputStream(newPath));
                    }    
                catch (FileNotFoundException ex) 
                    {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                catch (DocumentException ex) 
                    {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                MultiplePdfdocument.open();
                try {
                    img = Image.getInstance(ard);
                } catch (BadElementException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //ONE IMAGE ADDED PER PAGE
                MultiplePdfdocument.setPageSize(img);
                MultiplePdfdocument.newPage();
                float fitWidth = 1500;
                float fitHeight = 1500;
                img.scaleToFit(fitWidth, fitHeight);
                img.setAlignment(Image.MIDDLE);
                try 
                    {
                        MultiplePdfdocument.add(img);
                    }
                catch (DocumentException ex) 
                    {
                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                MultiplePdfdocument.close();
             }  
          
       } 


   public void setImageToPdf(Document document1,Image img,String IMAGES, String newPath)
      {
        try
          {   
            try {
            img = Image.getInstance(IMAGES);       //CHANGES MADE
            } catch (BadElementException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            documentForPdf.setPageSize(img);
            documentForPdf.newPage();
            float fitWidth = 1500;
            float fitHeight = 1500;
            img.scaleToFit(fitWidth, fitHeight);
            img.setAlignment(Image.MIDDLE);
            try 
            {
             documentForPdf.add(img);
             }
             catch (DocumentException ex) 
             {
              Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
            catch(Exception e) 
             {
              System.out.println(e);
             }
        }
     
    
    
}
