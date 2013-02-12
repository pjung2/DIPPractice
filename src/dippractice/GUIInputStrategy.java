package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class GUIInputStrategy implements InputStrategy
{
    @Override
    public String inputMessage()
    {
        String in = JOptionPane.showInputDialog("Enter input: ", "");
        return in;
    }
}
