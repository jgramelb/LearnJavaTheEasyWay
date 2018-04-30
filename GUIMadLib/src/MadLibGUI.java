import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MadLibGUI extends JFrame {
	private JTextField txtColor;
	private JTextField txtVerbed;
	private JTextField txtNoun;
	private JTextField txtAdjective;
	private JLabel lblOutput;
	//public String message;
	//public JButton btnGenerateMadLib;
	
	public void enterWords() {
		String color = txtColor.getText();
		String verbed = txtVerbed.getText();
		String adjective = txtAdjective.getText();
		String noun = txtNoun.getText();
		String message = "";
		try {
			message = "The " + color + " dragon " + verbed + " at the " + adjective + " " + noun +
					". \nAnd everyone lived happily ever after." + "\nThe end.";
			//newGame();
		}
		catch (Exception e) {
			message = "Enter a color, verb, adjective, and/or a noun";
		}
		finally {
			lblOutput.setText(message);
			txtColor.requestFocus();
			txtVerbed.requestFocus();
			txtAdjective.requestFocus();
			txtNoun.requestFocus();
			txtColor.selectAll();	
			txtVerbed.requestFocus();
			txtAdjective.requestFocus();
			txtNoun.requestFocus();
			
		}
		
	}
	public void newGame() {
		//message = " ";
		/*txtColor.setText("");
		txtVerbed.setText("");
		txtAdjective.setText("");
		txtNoun.setText("");
		*/
		//lblOutput.setText("");
	}
	public MadLibGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Jeannie's Wacky Mad Lib Game");
		getContentPane().setLayout(null);
		
		JLabel lblJeanniesWackyMadlibs = new JLabel("Jeannie's Wacky MadLibs App");
		lblJeanniesWackyMadlibs.setHorizontalAlignment(SwingConstants.CENTER);
		lblJeanniesWackyMadlibs.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblJeanniesWackyMadlibs.setBounds(72, 13, 458, 42);
		getContentPane().add(lblJeanniesWackyMadlibs);
		
		JButton btnGenerateMadLib = new JButton("Click Here to Generate Your MadLib Creation!");
		btnGenerateMadLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});
		btnGenerateMadLib.setBounds(123, 165, 360, 25);
		getContentPane().add(btnGenerateMadLib);
		
		
		
		JLabel lblOutput = new JLabel("");
		lblOutput.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblOutput.setVerticalAlignment(SwingConstants.TOP);
		lblOutput.setHorizontalAlignment(SwingConstants.LEFT);
		lblOutput.setBounds(12, 203, 558, 87);
		getContentPane().add(lblOutput);
		/*btnGenerateMadLib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});*/
		
		txtColor = new JTextField();
		txtColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});
		txtColor.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtColor.setBounds(475, 81, 95, 22);
		getContentPane().add(txtColor);
		txtColor.setColumns(10);

		
		JLabel lblEnterAColor = new JLabel("Enter a color:");
		lblEnterAColor.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblEnterAColor.setBounds(352, 80, 118, 21);
		getContentPane().add(lblEnterAColor);
		
		JLabel lblEnterANoun = new JLabel("Enter a noun:");
		lblEnterANoun.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblEnterANoun.setBounds(352, 131, 118, 21);
		getContentPane().add(lblEnterANoun);
		
		txtVerbed = new JTextField();
		txtVerbed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});
		txtVerbed.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtVerbed.setColumns(10);
		txtVerbed.setBounds(245, 132, 95, 22);
		getContentPane().add(txtVerbed);

		
		txtNoun = new JTextField();
		txtNoun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});
		txtNoun.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNoun.setColumns(10);
		txtNoun.setBounds(475, 132, 95, 22);
		getContentPane().add(txtNoun);

		
		txtAdjective = new JTextField();
		txtAdjective.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterWords();
			}
		});
		txtAdjective.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtAdjective.setColumns(10);
		txtAdjective.setBounds(245, 81, 95, 22);
		getContentPane().add(txtAdjective);

		
		JLabel lblEnterAnAdjective = new JLabel("Enter an Adjective:");
		lblEnterAnAdjective.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblEnterAnAdjective.setBounds(72, 80, 161, 21);
		getContentPane().add(lblEnterAnAdjective);
		
		JLabel lblEnterAVerb = new JLabel("Enter a Verb Ending in -ed:");
		lblEnterAVerb.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblEnterAVerb.setBounds(12, 131, 224, 21);
		getContentPane().add(lblEnterAVerb);
	}

	public static void main(String[] args) {
		MadLibGUI MadLibGUIGame = new MadLibGUI();
		MadLibGUIGame.newGame();
		MadLibGUIGame.setSize(new Dimension(600,350));
		MadLibGUIGame.setVisible(true);

	}
}
