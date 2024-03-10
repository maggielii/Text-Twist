package code;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Scanner;

public class TextTwist {

	public static boolean canMake (String word, String letters) 
	{
		
		char[] lettersArray = letters.toCharArray();
		char[] wordArray = word.toCharArray();
		
		boolean canMake = false;
		
		for(int x = 0; x < wordArray.length; x++)
		{
			canMake = false;
			for(int y = 0; y < lettersArray.length; y++)
			{
				if(wordArray[x] == lettersArray[y])
				{
					canMake = true;
					lettersArray[y] = '~'; 
					break; //change only first one 
				}
			}
			
			if(!canMake)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) throws Exception {

		File infile = new File("dictionary.txt");
		
		Scanner input = new Scanner(infile);
		
		String[] wordArray = new String[4086];
		
		Scanner keyboard = new Scanner(System.in);
		
		String letters = keyboard.next();
		
		Robot robotKeyboard = new Robot();
		Thread.sleep(5000);	
		
		for(int x = 0; x < wordArray.length; x++)
		{
			wordArray[x] = input.next();

			if(canMake(wordArray[x], letters))
			{
				//System.out.println(wordArray[x]);
				
				for(int y = 0; y < wordArray[x].length(); y++)
				{
					char letter = wordArray[x].charAt(y);
					if(letter == 'a') robotKeyboard.keyPress(KeyEvent.VK_A);
					else if(letter == 'b') robotKeyboard.keyPress(KeyEvent.VK_B);
					else if(letter == 'c') robotKeyboard.keyPress(KeyEvent.VK_C);
					else if(letter == 'd') robotKeyboard.keyPress(KeyEvent.VK_D);
					else if(letter == 'e') robotKeyboard.keyPress(KeyEvent.VK_E);
					else if(letter == 'f') robotKeyboard.keyPress(KeyEvent.VK_F);
					else if(letter == 'g') robotKeyboard.keyPress(KeyEvent.VK_G);
					else if(letter == 'h') robotKeyboard.keyPress(KeyEvent.VK_H);
					else if(letter == 'i') robotKeyboard.keyPress(KeyEvent.VK_I);
					else if(letter == 'j') robotKeyboard.keyPress(KeyEvent.VK_J);
					else if(letter == 'k') robotKeyboard.keyPress(KeyEvent.VK_K);
					else if(letter == 'l') robotKeyboard.keyPress(KeyEvent.VK_L);
					else if(letter == 'm') robotKeyboard.keyPress(KeyEvent.VK_M);
					else if(letter == 'n') robotKeyboard.keyPress(KeyEvent.VK_N);
					else if(letter == 'o') robotKeyboard.keyPress(KeyEvent.VK_O);
					else if(letter == 'p') robotKeyboard.keyPress(KeyEvent.VK_P);
					else if(letter == 'q') robotKeyboard.keyPress(KeyEvent.VK_Q);
					else if(letter == 'r') robotKeyboard.keyPress(KeyEvent.VK_R);
					else if(letter == 's') robotKeyboard.keyPress(KeyEvent.VK_S);
					else if(letter == 't') robotKeyboard.keyPress(KeyEvent.VK_T);
					else if(letter == 'u') robotKeyboard.keyPress(KeyEvent.VK_U);
					else if(letter == 'v') robotKeyboard.keyPress(KeyEvent.VK_V);
					else if(letter == 'w') robotKeyboard.keyPress(KeyEvent.VK_W);
					else if(letter == 'x') robotKeyboard.keyPress(KeyEvent.VK_X);
					else if(letter == 'y') robotKeyboard.keyPress(KeyEvent.VK_Y);
					else if(letter == 'z') robotKeyboard.keyPress(KeyEvent.VK_Z);
				}
				
				robotKeyboard.keyPress(KeyEvent.VK_ENTER);
			}
		}	
		
	}
		
}
