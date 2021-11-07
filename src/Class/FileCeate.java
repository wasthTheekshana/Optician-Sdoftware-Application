
package Class;


import java.io.File;
import java.nio.file.Files;
import javafx.scene.chart.StackedBarChart;
import javax.swing.JFrame;

/**
 *
 * @author Theekshana
 */
public class FileCeate {
     public static int CreateFile(String path){
     
     File file =new File(path);
     
         if(!file.exists()){
             boolean b=file.mkdir();
             System.out.println(b);
         }else{
             return 1;
         }
         return 2;
        
        
     } 
     
     
     

}

