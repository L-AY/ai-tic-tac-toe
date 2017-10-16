import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class gui extends JFrame implements ActionListener{

	public static void main(String[] args){
		
		new gui().setVisible(true);
	
	}
	
	public gui() {
		
		super("Tic Tac Toe");
		setSize(260,500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		
		JButton logoBtn = new JButton("");
		
		try{
			Image img = ImageIO.read(getClass().getResource("/logo.png"));
			logoBtn.setIcon(new ImageIcon(img));
			}catch (IOException ex){
		}	
		
		logoBtn.addActionListener(this);
		JButton playBtn = new JButton("Play");
		playBtn.addActionListener(this);
		JButton rulesBtn = new JButton("Rules");
		rulesBtn.addActionListener(this);
		JButton quitBtn = new JButton("Quit");
		quitBtn.addActionListener(this);
		
		add(logoBtn);
		add(playBtn);
		add(rulesBtn);
		add(quitBtn);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		if(name.equals("Play")){
		boardAndGame bg = new boardAndGame();
		bg.play();
			
		}else if (name.equals("Rules")){
			JOptionPane.showMessageDialog (
					null,
					  " The player (you) are crosses - X\n"
					+ " The computer (the enemy) is noughts - O\n"
					+ " Due to the computer being an absolute genius the player\n"
					+ " is given the enjoyment of going first!\n"  
				    + " \n"
					+ " Rules:\n"
				    + " 1. The player will choose a position where he will place his cross\n"
					+ " 2. The computer, who is a very quick thinker, will choose a position where he will place his nought\n"
					+ " 3. You must get three in a row or column or diagonally before the computer to beat him!\n"
					+ " Good Luck!"
					+ " \n"
					+ " \n"
					+ " Notes.\n"
					+ " i) Once you have started a game you must wait until outcome of match, \n"
					+ " this game isn't designed for quitters!\n"
					+ " ii) After you have made a move your selected position on the board will\n"
					+ " turn grey; this is to indicate to the computer that he cannot make his move there.\n"
					+ " The similar is true for the player, after the computer has made a move in his box \n"
					+ " the player will not be able to choose that box as it'll turn grey. All this\n"
					+ " is to reduce the possibilities of errors within the program."
					+ " \n"
					+ " \n", 
					"Rules", 
					JOptionPane.INFORMATION_MESSAGE); 
		}else if (name.equals("Quit")){
			System.exit(0);
		}
		
		
	}

	
}
