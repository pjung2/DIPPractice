package dippractice;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class MessageService
{
    private OutputStrategy out;
    private InputStrategy in;
    
    public MessageService(OutputStrategy out, InputStrategy in)
    {
        this.out = out;
        this.in = in;  
    }
    
    public void outputMessage()
    {
        String input = in.inputMessage();
        out.outputMessage(input);
    }
}
