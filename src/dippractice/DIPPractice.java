/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Dallas
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OutputStrategy out = new ConsoleOutPutStrategy();
        InputStrategy in = new GUIInputStrategy();
        MessageService service = new MessageService(out, in);
        service.outputMessage();
    }
}
