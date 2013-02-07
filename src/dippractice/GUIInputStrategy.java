/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Dallas
 */
import javax.swing.JOptionPane;
public class GUIInputStrategy implements InputStrategy{
    public String inputMessage(){
        String in = JOptionPane.showInputDialog("Enter input: ", "");
        return in;
    }
}
