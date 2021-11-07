/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import gui.login;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author Theekshana
 */
public class Loger {
     public static Logger log = Logger.getLogger(login.class);
    public  static void initLogger(){
        try {
        String path = "E://optician//LOG//loger.txt";
        PatternLayout layout = new PatternLayout("%-3p %-10d %m %L %n");
        RollingFileAppender appender=new RollingFileAppender(layout, path);
        appender.setName("loggerData");
        appender.setMaxFileSize("1MB");
        appender.activateOptions();
            log.getRootLogger().addAppender(appender);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
}


    
    
