import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Josh
 */
public class BlackjackDriver
{
    public static void main(String[] args)
    {
	BlackjackGame test = new BlackjackGame();
	test.dealCards();
	System.out.println(test);
    }
}

