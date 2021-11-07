
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class data {
    
    private static final  String url ="jdbc:mysql://localhost:3306/optician_system";
    private static final  String us ="root";
    private static final  String pw ="123";
    private static Connection c;
    private static final String driver ="com.mysql.jdbc.Driver";
    
    private data(){}
    
    public static synchronized Connection get(){
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, us, pw);
        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }
    
   public static void iud(String query){
          
              try {
                   get().createStatement().executeUpdate(query);
                 
              } catch (Exception e) {
                  System.out.println(e);
              }
          }
          
          public static ResultSet search(String query){
              
              ResultSet rs = null;
              try {
                  rs= get().createStatement().executeQuery(query);
                 
              } catch (Exception e) {
                  System.out.println(e);
              }
          return rs;
          }
    
}
