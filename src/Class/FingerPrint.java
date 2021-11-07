/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Maneesha
 */
public class FingerPrint {
     
      //
      public static String read(String path) {
        try{
            java.io.File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                   // System.out.println("c");
                if (i != 0) {
                    System.out.println("d");
                  String id =line;
                    System.out.println(id);
                    String fid=id;
             return fid;
                }
            i++;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
          return null;
         


}}
