package Class;

import Class.*;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javafx.scene.chart.StackedBarChart;
import javax.swing.JFrame;

/**
 *
 * @author Theekshana
 */
public class FileCreate {

    public static String m(String path,String Filename){
       
       try {
           
            System.out.println(path);
            File file=new File(Filename);
            boolean b=file.exists();
            System.out.println(b);
            if(b==false){
                boolean b1=file.mkdir();
                String path2=file.getAbsolutePath();
                System.out.println(b1);
                return path2;
            }
            
       } catch (Exception e) {
           e.printStackTrace();
           
           
       }return null;
}}

//    private int mainFile(String path) {
//        File f = new File(path);
//        boolean min = f.exists();
//        if(min==true){
//            System.out.println("thynawa");
//        return 1;//thynawa
//            
//        }else{
//            System.out.println("na");
//        return 2;//na file 1
//        }
//    }
//
//    
//    public void createMk(String path){
//        int i=mainFile(path);
//        if(i==2){
//        File f=new File(path);
//        f.mkdir();
//                
//        }
//   
//  
//    
//    }
//}


