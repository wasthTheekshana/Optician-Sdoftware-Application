/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.awt.Color;

/**
 *
 * @author Theekshana
 */
public class editcolor {
    
        static Color c1;
    static Color c2;
    static Color c3;
    static Color c4;
    
     public Color buttonenter() {
        if (c1 == null) {
            c1 = new Color(71,73,184);
        }
        return c1;

    }

    public Color buttonclick() {
        if (c2 == null) {
            c2 = new Color(102, 153, 255);
        }
        return c2;
    }

    public Color buttonexit() {
        if (c3 == null) {
            c3 = new Color(117, 117, 117);
        }
        return c3;
    }

    public Color buttonreleas() {
        if (c4 == null) {
            c4 = new Color(183, 183, 183);
        }
        return c4;

    }
}
