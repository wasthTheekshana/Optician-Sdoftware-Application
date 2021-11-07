
package Class;
import database.data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
//import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;

public class Calculation {
    
    public static void m(String NIC){
        
        try {
              ResultSet r = data.search("select nic  from user where nic= '" + NIC+ "' ");
                    String nic = null;
                    while (r.next()) {
                        nic = r.getString("nic");  
                       
                    }
                int i=sub(nic);
                int i1=i;
                int i2=i1-100+150-17+256;
                int i3=i2-111;   
            
        } catch (Exception e) {
    }
        
}
  public static int sub(String idno) {
        
            return Integer.parseInt(idno.substring(1,4));
  
  }


}

