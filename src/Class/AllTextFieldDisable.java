
package Class;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AllTextFieldDisable {

    public static boolean isAllFieldsNull(JTextField... fields) {
        boolean b = true;
        for (JTextField field : fields) {
            if (field.getText().isEmpty()) {
                
                b = false;
            }
        }
        return b;

    }

    public static void setNull(JLabel l,ButtonGroup i, JTextField... fields) {

        for (JTextField field : fields) {
            
                field.setText(null);
                l.setText(null);
                i.clearSelection();
            
        }
    }

    public static void EditableTrue(JTextField t, JTextField... fields) {

        for (JTextField field : fields) {
            if (!t.getText().isEmpty()) {
                field.setEditable(true);
            }
        }
    }


   
}
