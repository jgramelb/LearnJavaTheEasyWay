import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	private int numberOfTries;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			int guess = Integer.parseInt(guessText);
			numberOfTries = numberOfTries + 1;
			if (guess < theNumber) {
				message = guess + " is too low. Try again.";
			}
			else if (guess > theNumber) {
				message = guess + " is too high. Try again.";
			}
			else {
				numberOfTries = numberOfTries + 1;
				message = guess + " is correct. You win! It only took you " + numberOfTries + " tries.";
				newGame();
			}
		}
		catch (Exception e) {
			message = "Enter a whole number between 1 and 100";
		}
		finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();	
		}		
	}
	public void newGame() {
		theNumber = (int)(Math.random()*100+1);
		numberOfTries = 0;
	}
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Jeannie's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblJeanniesHiloGuessing = new JLabel("Jeannie's Hi-Lo Guessing Game");
		lblJeanniesHiloGuessing.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJeanniesHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeanniesHiloGuessing.setBounds(12, 43, 408, 27);
		getContentPane().add(lblJeanniesHiloGuessing);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGuessANumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGuessANumber.setBounds(12, 113, 283, 27);
		getContentPane().add(lblGuessANumber);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGuess.setHorizontalAlignment(SwingConstants.LEFT);
		txtGuess.setBounds(303, 113, 85, 27);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGuess.setBounds(168, 145, 97, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOutput.setBounds(12, 183, 408, 27);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);

	}
}
