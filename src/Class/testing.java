
package Class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class testing {
    private static int iii=0;
    public static void m(){
        try{
         File f1= new File("E://optician//theekshana//IncorrectLogs.txt");
         FileReader fr1=new FileReader(f1);
         BufferedReader b1=new BufferedReader(fr1);
         String s=b1.readLine();
         System.out.println(s);
//        //int i=1+Integer.parseInt(s);
//        //int i1=i+1;
//          if(iii>0){
//             System.out.println("o kala");
//         FileWriter fr2=new FileWriter(f1);
//        BufferedWriter b2=new BufferedWriter(fr2);
//         b2.write("0");
//        b2.flush();
//        b2.close();
//         }
 String read=Read.m();
        File f= new File("E://optician//theekshana//IncorrectLogs.txt");
        FileWriter fr=new FileWriter(f);
        BufferedWriter b=new BufferedWriter(fr);
        int i=Integer.parseInt(read);
        int i1=i+1;
        System.out.println(i1);
        
        b.write(String.valueOf(i1));
     // b.write("h");
        b.flush();
        b.close();
        System.out.println("liwwa");
//        iii++;
          //  System.out.println(iii);
    }catch(Exception e){

}}
}
 class Read{
 
     public static String m() throws Exception{
         File f= new File("C:/Users/kavindya/Documents/NisacoP/IncorrectLogs.txt");
         FileReader fr=new FileReader(f);
         BufferedReader b=new BufferedReader(fr);
         String s=b.readLine();
         System.out.println(s);
         return s;
     }
}
