/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Dallas
 */
public class MessageService {
    private OutputStrategy out;
    private InputStrategy in;
    
    public MessageService(OutputStrategy out, InputStrategy in){
        this.out = out;
        this.in = in;
        
    }
    
    public void outputMessage(){
        String input = in.inputMessage();
        out.outputMessage(input);
    }
}
