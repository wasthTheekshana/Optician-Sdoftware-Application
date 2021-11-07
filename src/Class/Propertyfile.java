//package Class;
//
//import gui.login;
////import GUI.SETSTART;
//import java.awt.TextField;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutput;
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//import java.io.Serializable;
//import java.util.Properties;
//import javax.swing.JFrame;
//
///**
// *
// * @author Theekshana
// */
//public class Propertyfile implements Serializable {
//
//    private Properties prop;
//
//    public void property(String servername, String port, String Databasename, String UserName, String Password,JFrame j) {
//        int i = Class.FileCeate.CreateFile("C:\\ProgramData\\optician\\ConfigBD");
//        if (i == 2) {
//            prop = new Properties();
//            OutputStream output = null;
//            ObjectOutputStream ou = null;
//
//            try {
//                Propertyfile p = new Propertyfile();
//                output = new FileOutputStream("C:\\ProgramData\\Basco\\ConfigBD\\config.properties.ser");
//                ou = new ObjectOutputStream(output);
//
//                prop.setProperty("ServerName", servername);
//                prop.setProperty("Port", port);
//                prop.setProperty("DataBaseName", Databasename);
//                prop.setProperty("UserName", UserName);
//                prop.setProperty("Password", Password);
//
//                // prop.store(output,null);
//                ou.writeObject(prop);
//                ou.close();
////                LOGIN l=new LOGIN();
////                l.setVisible(true);
//                j.dispose();
//            } catch (IOException io) {
//                io.printStackTrace();
//            } finally {
//                if (output != null) {
//                    try {
//                        output.close();
//                    } catch (IOException io) {
//                        io.printStackTrace();
//                    }
//
//                }
//            }
//
//        } else {
//            Properties prop = new Properties();
//            OutputStream output = null;
//            ObjectOutputStream ou = null;
//
//            try {
//                Propertyfile p = new Propertyfile();
//                output = new FileOutputStream("C:\\ProgramData\\Basco\\ConfigBD\\config.properties.ser");
//                ou = new ObjectOutputStream(output);
//
//                prop.setProperty("ServerName",servername);
//                prop.setProperty("Port",port);
//                prop.setProperty("DataBaseName",Databasename);
//                prop.setProperty("UserName",UserName);
//                prop.setProperty("Password",Password);
//                System.out.println("");
//                // prop.store(output,null);
//                ou.writeObject(prop);
//                ou.close();
////                LOGIN l=new LOGIN();
////                l.setVisible(true);
//                j.dispose();
//         } catch (IOException io) {
//                io.printStackTrace();
//            } finally {
//                if (output != null) {
//                    try {
//                        output.close();
//                    } catch (IOException io) {
//                        io.printStackTrace();
//                    }
//
//                }
//            }
//
//        }
//
//    }
//
//    public String propertyfileReader() {
//        try {
//            FileInputStream is = new FileInputStream("C:\\ProgramData\\Basco\\ConfigBD\\config.properties.ser");
//            ObjectInputStream oi = new ObjectInputStream(is);
//            //   BufferedReader br=new BufferedReader(oi);
//            
//            Properties pf = (Properties) oi.readObject();
//            String sn = pf.getProperty("ServerName");
//            String po = pf.getProperty("Port");
//            String Db = pf.getProperty("DataBaseName");
//            String Un = pf.getProperty("UserName");
//            String Pa = pf.getProperty("Password");
//            
//            
//            System.out.println(sn);
//            System.out.println(po);
//            System.out.println(Db);
//            System.out.println(Un);
//            System.out.println(Pa);
//            oi.close();  
//          //  Array
//            return sn;
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//
//    }
//}
