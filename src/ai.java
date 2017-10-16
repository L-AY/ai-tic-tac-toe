import javax.swing.JButton;

public class ai {

	public static int compWinOrBlockMove(
			
		/* For the artificial intelligence to work, although I've populated the buttons within the boardAndGame class 
		 * via a for loop; to ensure each artificial intelligence pattern is achieved by the computer each button within 
		 * the system will be needed to referred individually through a JButton so all winning patterns can be exhausted.*/	
			
			JButton button1, JButton button2, JButton button3, 
			JButton button4, JButton button5, JButton button6, 
			JButton button7, JButton button8, JButton button9)	
	
	{
		
		/* Priority for the artificial intelligence is as follows:
		 * 
			 * 	Computer will:
			 * 	1st Priority: Look for the win first
			 *  2nd Priority: Look to block the user winning
			 *  3rd Priority: Look for middle space - middle is easier to code or I would have to elongate for 4 corner possibilities
		 *   
		 */
		
// ============================================================================
	
// LOOKING FOR THE WIN!
		
	// HORIZONTAL ARTIFICIAL INTELLIGENCE 
		
		// horizontal top [1][2][3]
			if	   (button1.getText().equals("O") && 
					button2.getText().equals("O") && 
					button3.getText().equals("."))
			
					return 3;
			
			else if(button2.getText().equals("O") && 
					button3.getText().equals("O") && 
					button1.getText().equals("."))
			
					return 1;
			
			else if(button1.getText().equals("O") && 
					button3.getText().equals("O") && 
					button2.getText().equals("."))
			
					return 2;
			
		// 	horizontal middle [4][5][6]
			else if(button4.getText().equals("O") && 
					button5.getText().equals("O") && 
					button6.getText().equals("."))
			
					return 6;
		
			else if(button4.getText().equals("O") && 
					button6.getText().equals("O") && 
					button5.getText().equals("."))
				
					return 5;
			
			else if(button5.getText().equals("O") && 
					button6.getText().equals("O") && 
					button4.getText().equals("."))
					
					return 4;
			
		//  horizontal bottom [7][8][9]	
			else if(button7.getText().equals("O") && 
					button8.getText().equals("O") && 
					button9.getText().equals("."))
			
					return 9;			
		
			else if(button8.getText().equals("O") && 
					button9.getText().equals("O") && 
					button7.getText().equals("."))
					
					return 7;		
		
			else if(button7.getText().equals("O") && 
					button9.getText().equals("O") && 
					button8.getText().equals("."))
			
					return 8;
			
// ============================================================================
	
	// VERTICAL ARTIFICIAL INTELLIGENCE 
			
		// vertical left [1][4][7]	
			else if(button1.getText().equals("O") && 
					button4.getText().equals("O") && 
					button7.getText().equals("."))
			
					return 7;
		
			else if(button4.getText().equals("O") && 
					button7.getText().equals("O") && 
					button1.getText().equals("."))
			
					return 1;
			
			else if(button1.getText().equals("O") && 
					button7.getText().equals("O") && 
					button4.getText().equals("."))
			
					return 4;
			
		// vertical middle [2][5][8]
			else if(button2.getText().equals("O") && 
					button5.getText().equals("O") && 
					button8.getText().equals("."))
			
					return 8;
		
			else if(button2.getText().equals("O") && 
					button8.getText().equals("O") && 
					button5.getText().equals("."))
					
					return 5;
			
			else if(button5.getText().equals("O") && 
					button8.getText().equals("O") && 
					button2.getText().equals("."))
					
					return 2;
			
		
		// vertical right [3][6][9]	
			else if(button3.getText().equals("O") && 
					button6.getText().equals("O") && 
					button9.getText().equals("."))
			
					return 9;
				
			else if(button6.getText().equals("O") && 
					button9.getText().equals("O") && 
					button3.getText().equals("."))
			
					return 3;
					
			else if(button3.getText().equals("O") && 
					button9.getText().equals("O") && 
					button6.getText().equals("."))
			
					return 6;

// ============================================================================
			
	// DIAGONAL ARTIFICIAL INTELLIGENCE - ensure you exhaust all SIX ways as there are two pattern diagonally 			
			
		// diagonal left top to bottom right [1][5][9]		
			else if(button1.getText().equals("O") && 
					button5.getText().equals("O") && 
					button9.getText().equals("."))
			
					return 9;
		
			else if(button5.getText().equals("O") && 
					button9.getText().equals("O") && 
					button1.getText().equals("."))
			
					return 1;
		
			else if(button1.getText().equals("O") && 
					button9.getText().equals("O") && 
					button5.getText().equals("."))
			
					return 5;
		
		// diagonal bottom right to left top or vice versa hahaha [7][5][3]
			else if(button3.getText().equals("O") && 
					button5.getText().equals("O") && 
					button7.getText().equals("."))
			
					return 7;
		
			else if(button7.getText().equals("O") && 
					button5.getText().equals("O") && 
					button3.getText().equals("."))
			
					return 3;
		
			else if(button7.getText().equals("O") && 
					button3.getText().equals("O") && 
					button5.getText().equals("."))
			
					return 5;
		
// ============================================================================
			
// LOOKING FOR THE BLOCK!
					
	// HORIZONTAL ARTIFICIAL INTELLIGENCE 
			
			// horizontal top [1][2][3]
			else if(button1.getText().equals("X") && 
					button2.getText().equals("X") && 
					button3.getText().equals("."))
			
					return 3;
		
			else if(button2.getText().equals("X") && 
					button3.getText().equals("X") && 
					button1.getText().equals("."))
			
					return 1;
			
			else if(button1.getText().equals("X") && 
					button3.getText().equals("X") && 
					button2.getText().equals("."))
					
					return 2;
			
			// horizontal middle [4][5][6]
			else if(button4.getText().equals("X") && 
					button5.getText().equals("X") && 
					button6.getText().equals("."))
		
					return 6;
		
			else if(button5.getText().equals("X") && 
					button6.getText().equals("X") && 
					button4.getText().equals("."))
		
					return 4;
			
			else if(button4.getText().equals("X") &&
					button6.getText().equals("X") && 
					button5.getText().equals("."))
			
					return 5;
			
			// horizontal bottom [7][8][9]
			else if(button7.getText().equals("X") && 
					button8.getText().equals("X") && 
					button9.getText().equals("."))
		
					return 9;
		
			else if(button8.getText().equals("X") && 
					button9.getText().equals("X") && 
					button7.getText().equals("."))
			
					return 7;
		
			else if(button7.getText().equals("X") && 
					button9.getText().equals("X") && 
					button8.getText().equals("."))
		
					return 8;
	
	// VERTICAL ARTIFICIAL INTELLIGENCE 			
			
			// vertical left [1][4][7]
			else if(button1.getText().equals("X") && 
					button4.getText().equals("X") && 
					button7.getText().equals("."))
			
					return 7;
			
			else if(button4.getText().equals("X") && 
					button7.getText().equals("X") && 
					button1.getText().equals("."))
			
					return 1;
			
			else if(button1.getText().equals("X") && 
					button7.getText().equals("X") && 
					button4.getText().equals("."))
			
					return 4;
			
			
			// vertical middle [2][5][8]
			else if(button2.getText().equals("X") && 
					button5.getText().equals("X") && 
					button8.getText().equals("."))
			
					return 8;
			
			else if(button5.getText().equals("X") && 
					button8.getText().equals("X") && 
					button2.getText().equals("."))
		
					return 2;
			
			else if(button2.getText().equals("X") && 
					button8.getText().equals("X") && 
					button5.getText().equals("."))
			
					return 5;
			
			// vertical left [3][6][9]
			else if(button3.getText().equals("X") && 
					button6.getText().equals("X") && 
					button9.getText().equals("."))
			
					return 9;
		
			else if(button6.getText().equals("X") && 
					button9.getText().equals("X") && 
					button3.getText().equals("."))
			
					return 3;
			
			else if(button3.getText().equals("X") && 
					button9.getText().equals("X") && 
					button6.getText().equals("."))
			
					return 6;
			
	// DIAGONAL ARTIFICIAL INTELLIGENCE	
		
			// diagonal left top to bottom right [1][5][9]
			else if(button1.getText().equals("X") && 
					button5.getText().equals("X") && 
					button9.getText().equals("."))
			
					return 9;
			
			else if(button5.getText().equals("X") && 
					button9.getText().equals("X") && 
					button1.getText().equals("."))
			
					return 1;
			
			else if(button1.getText().equals("X") && 
					button9.getText().equals("X") && 
					button5.getText().equals("."))
			
					return 5;
			
			// diagonal left bottom to top right [7][5][3]
			else if(button3.getText().equals("X") && 
					button5.getText().equals("X") && 
					button7.getText().equals("."))
			
					return 7;
			
			else if(button7.getText().equals("X") && 
					button5.getText().equals("X") && 
					button3.getText().equals("."))
		
					return 3;
			
			else if(button7.getText().equals("X") && 
					button3.getText().equals("X") && 
					button5.getText().equals("."))
		
					return 5;
		
// ============================================================================
			
// LOOKING FOR CENTRE BUTTON!
											
			else if(button1.getText().equals("X") && 
					button5.getText().equals("O") && 
					button9.getText().equals("X"))
			
					return 6;
			
			else if(button3.getText().equals("X") && 
					button5.getText().equals("O") && 
					button7.getText().equals("X")) 
			
					return 4;
		
			else if(button5.getText().equals("."))
			
					return 5;
		
			else if(button1.getText().equals("."))
			
					return 1;
			
			else
			
				return 0;
		}
	
	public static boolean compMoveRand(JButton button)	{
		
			if(button.getText().equals("O") || button.getText().equals("X"))
			
				return false;
		
			else{
			
				return true;
			
			}
			
		}
	
}