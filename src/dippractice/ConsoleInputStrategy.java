/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author Dallas
 */
import java.util.*;
public class ConsoleInputStrategy implements InputStrategy{
    Scanner scanner = new Scanner(System.in);
    public String inputMessage(){
        System.out.println("Enter input: ");
        String in = scanner.nextLine();
        return in;
    }
}
