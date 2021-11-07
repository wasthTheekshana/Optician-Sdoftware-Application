package Class;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextOnlyValidation {
    public TextOnlyValidation() {}

    public TextOnlyValidation(JTextField ja, int la, char ca, JTextField t) {
        this.j  = ja;
        this.l = la;
        this.c = ca;
        this.t = t;
        this.s=s;

    }
    JTextField j;
    int l;
    char c;
    KeyEvent evt;
    JTextField t;
    String s;
    JPanel p;

    public void textOnlyValidation(java.awt.event.KeyEvent ev) {

        this.evt = ev;
        if (Character.isDigit(c)) {
            evt.consume();
        }
       else if (j.getText().length() == l) {
            evt.consume();

        }

    }
      public void LettersOnly(String s,JPanel p,java.awt.event.KeyEvent ev,JTextField t){
          this.s=s;
          this.p=p;
          this.evt=ev;
          this.t=t;
        Pattern pattern=Pattern.compile("[a-zA-Z]+");
        Matcher matcher=pattern.matcher(s);
          System.out.println(s);
        if(matcher.matches()){
         t.setForeground(Color.BLACK);
           
        }else{
         t.setForeground(Color.RED);
        }
        
   
}
}
