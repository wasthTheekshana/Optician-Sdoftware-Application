package Class;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Theekshana
 */
public class Chooser {
    

    public static File chooserpath(String placetoopen, String joptionpanemessege, JPanel j, String joptiontypemessege, JTextField SetName, int width, int high) {
        {
            try {
                JFileChooser fc = new JFileChooser();
                fc.setCurrentDirectory(new File(System.getProperty(placetoopen)));
                FileNameExtensionFilter filter = new FileNameExtensionFilter(".png", ".jpg");
                fc.addChoosableFileFilter(filter);
                int result = fc.showSaveDialog(j);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedfile = fc.getSelectedFile();
                    String path = selectedfile.getAbsolutePath();
                    BufferedImage image = new BufferedImage(high, width, BufferedImage.TYPE_INT_ARGB);  
                     try {
                         image = ImageIO.read(selectedfile);                
                        if(!image.equals(fc)){
                           SetName.setText(path); 
                           return selectedfile;
                        }
                         
                    } catch (Exception e) {
                        SetName.setText(null);
                        JOptionPane.showMessageDialog(j, joptionpanemessege, joptiontypemessege, JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    
                   
                }
            } catch (Exception e) {
                e.printStackTrace();
                SetName.setText(null);
                JOptionPane.showMessageDialog(j, joptionpanemessege, joptiontypemessege, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return null;
    }
    public static File chooseImage(String placetoopen, String joptionpanemessege, JPanel j, String joptiontypemessege, JLabel Setimage, int width, int high) {
        {
            try {
                JFileChooser fc = new JFileChooser();
                fc.setCurrentDirectory(new File(System.getProperty(placetoopen)));
                FileNameExtensionFilter filter = new FileNameExtensionFilter(".png", ".jpg");
                fc.addChoosableFileFilter(filter);
                int result = fc.showSaveDialog(j);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedfile = fc.getSelectedFile();
                    String path = selectedfile.getAbsolutePath();
                      
                     try {
                         Image image = ImageIO.read(selectedfile);
                         image =image.getScaledInstance(Setimage.getWidth(),Setimage.getHeight(),Image.SCALE_SMOOTH );
                        if(!image.equals(fc)){
                          Setimage.setIcon(new ImageIcon(image));
                          return selectedfile;
                        }
                         
                    } catch (Exception e) {
                        
                        JOptionPane.showMessageDialog(j, joptionpanemessege, joptiontypemessege, JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    
                   
                }
            } catch (Exception e) {
                e.printStackTrace();
              
                JOptionPane.showMessageDialog(j, joptionpanemessege, joptiontypemessege, JOptionPane.INFORMATION_MESSAGE);
            }
        }
        return null;
    }
}
