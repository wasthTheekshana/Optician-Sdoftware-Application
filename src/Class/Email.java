/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Theekshana
 */
public class Email {
   

    public static String isValidEmail(String mail){
    
    String validity;
    String email=mail;
   String expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
  
         
 Pattern p=Pattern.compile(expression,Pattern.CASE_INSENSITIVE);

      
        Matcher m=p.matcher(email);
        boolean b=m.matches();
        if (b==true) {
            validity="valid email id";
        }else{
        validity="invalid email id";
        }
    return validity;
    }
     public static  void isNumeric(KeyEvent evt){
    
        if (!Character.isDigit(evt.getKeyChar())) {

            evt.consume();
            
        }
        
    }
    
    public static void checkLength(KeyEvent evt,String text,int length1){

           if (text.length()>length1) {
               evt.consume();
            
        }
    }
public static void numbersOnly(String s,JPanel p,java.awt.event.KeyEvent ev,JTextField t){

        Pattern pattern=Pattern.compile("\\d{10}");
        Matcher matcher=pattern.matcher(s);
          System.out.println(s);
        if(matcher.matches()){
         t.setForeground(Color.BLACK);
           
        }else{
         t.setForeground(Color.RED);
        }
        
}
}



