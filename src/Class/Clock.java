/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Theekshana
 */
public class Clock {
    public void currentTime(JLabel time,JLabel date) {

        Thread clock = new Thread() {

            public void run() {

                for (;;) {
                    java.util.Date d = new java.util.Date();
                    SimpleDateFormat sdt = new SimpleDateFormat("HH:mm:ss");
                    time.setText(sdt.format(d));
                    SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");
                    date.setText(sdd.format(d));

                }
            }
        };
        clock.start();
        clock.setPriority(10);
    }
    
    
     public void currentdate(JLabel date) {

         Thread clock = new Thread() {

            public void run() {

                for (;;) {
                    java.util.Date d = new java.util.Date();
                    
                    SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");
                    date.setText(sdd.format(d));

                }
            }
        };
        clock.start();
        clock.setPriority(10);
    }
}
