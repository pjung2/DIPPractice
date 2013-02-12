package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class GUIOutPutStrategy implements OutputStrategy
{
    @Override
    public void outputMessage(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }
}
