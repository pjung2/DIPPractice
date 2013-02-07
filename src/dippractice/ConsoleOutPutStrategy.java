/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Dallas
 */
public class ConsoleOutPutStrategy implements OutputStrategy{
    public void outputMessage(String msg){
        System.out.println(msg);
    }
}
