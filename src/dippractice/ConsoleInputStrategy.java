package dippractice;

import java.util.*;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class ConsoleInputStrategy implements InputStrategy
{
    Scanner scanner = new Scanner(System.in);
    
    @Override
    public String inputMessage()
    {
        System.out.println("Enter text: ");
        String in = scanner.nextLine();
        return in;
    }
}
