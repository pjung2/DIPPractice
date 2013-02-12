package dippractice;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class DIPPractice
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        OutputStrategy out = new ConsoleOutPutStrategy();
        //InputStrategy in = new ConsoleInputStrategy();
        InputStrategy in = new GUIInputStrategy();
        MessageService service = new MessageService(out, in);
        service.outputMessage();
    }
}
