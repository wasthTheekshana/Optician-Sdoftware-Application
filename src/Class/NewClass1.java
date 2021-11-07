/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import groovyjarjarasm.asm.tree.TryCatchBlockNode;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author Theekshana
 */
public class NewClass1 {

    public static void main(String[] args)throws Exception{
//        File dir = new File("txt");      
//    	dir.mkdir();
//
//    	File file = new File(dir,"ijts.txt");      
//    	 file.createNewFile();
//
//    	 System.out.println(dir.isDirectory());
//    	 System.out.println(dir.isFile());
//    	 
//	System.out.println(file.isDirectory());
//    	 System.out.println(file.isFile());
//    }
//     File file = new File("scjp.txt");
//      FileWriter fw =  new FileWriter(file);  
//      fw.write("Sun Certified Java Programmer");       
//
//      fw.flush();
//      fw.close();


String textToAppend = "Happy !!";
     
    BufferedWriter writer = new BufferedWriter(
                                new FileWriter("D:/samplefile.txt", true)  //Set true for append mode
                            );  
    
    
    writer.newLine();   //Add new line
    writer.write(textToAppend);
    writer.close();
    }



}
