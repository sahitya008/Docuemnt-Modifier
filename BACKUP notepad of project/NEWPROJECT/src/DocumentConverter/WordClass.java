package DocumentConverter;

import com.itextpdf.text.Image;
import com.lowagie.text.rtf.RtfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class WordClass extends  NewJFrame 
{
     public void singleFile(JTextField destinationTextField)
            {
                try
                 {
                  documentforWord = new com.lowagie.text.Document();
                  com.lowagie.text.Image imageForWord = null;
                  //DESTINATION
                  destinationPath= destinationTextField.getText();
                  fileName="\\ProjectWord.doc";
                  newPath= destinationPath+fileName;
                  OutputStream fos = new FileOutputStream(newPath);
                  RtfWriter  writer=RtfWriter.getInstance(documentforWord, fos);
                  documentforWord.open();
                   for(int i=0;i<selectedFileNumber;i++)
                     {
                        File wordFiles[]=   sourceChooser.getSelectedFiles();
                        ard= wordFiles[i].getPath();
                        SetImageToWord(documentforWord, ard, imageForWord);
                     }
                   }
                  catch(Exception e) 
                    {
                        e.printStackTrace();
                    } 
                 documentforWord.close();
             } 
 public void multipleFiles(JTextField destinationTextField)
        {
         // CREATE MULTIPLE FILES
       com.lowagie.text.Document multipleWordDocument = null;
       OutputStream fos=null;
       try
         {
           for(int i=0; i<selectedFileNumber;i++)
              {    
                File ft[]=   sourceChooser.getSelectedFiles();
                ard= ft[i].getPath();
                destinationPath=destinationTextField.getText();
                fileName="\\"+i+".doc";
                newPath= destinationPath+fileName;
                multipleWordDocument= new com.lowagie.text.Document();
                fos  = new FileOutputStream(newPath);
                RtfWriter  writer=RtfWriter.getInstance(multipleWordDocument, fos);
                multipleWordDocument.open();
                com.lowagie.text.Image image = com.lowagie.text.Image.getInstance(ard);
                multipleWordDocument.setPageSize(image);
                image.scaleToFit(1500, 900);
                image.setAlignment(Image.MIDDLE);
                multipleWordDocument.add(image);
                multipleWordDocument.close(); 
             } 
           } 
           catch(Exception e) 
            {
             System.out.println(e);
            } 
      }


 private void SetImageToWord(com.lowagie.text.Document documentforWord, String ard, com.lowagie.text.Image imageForWord) {
      try 
         {
            try {
                     imageForWord = com.lowagie.text.Image.getInstance(ard);
            } catch (com.lowagie.text.BadElementException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
                        //documentforWord.setPageSize();
            imageForWord.scaleToFit(1500, 900);
            imageForWord.setAlignment(Image.MIDDLE);
            documentforWord.add(imageForWord);
            int i=0;
            if(i<selectedFileNumber)   //(i<selectedFileNumber-1)      TRY THIS
               {
                 documentforWord.newPage();  
                }
         }
          catch (com.lowagie.text.DocumentException ex) 
          {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
   }
}
