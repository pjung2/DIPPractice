/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Dallas
 */
public class GUIOutPutStrategy implements OutputStrategy{
    public void outputMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
