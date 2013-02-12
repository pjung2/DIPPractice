package dippractice;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class ConsoleOutPutStrategy implements OutputStrategy
{
    @Override
    public void outputMessage(String msg)
    {
        System.out.println("You typed " + msg);
    }
}
