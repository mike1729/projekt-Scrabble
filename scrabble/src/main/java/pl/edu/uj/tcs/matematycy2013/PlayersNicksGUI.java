package pl.edu.uj.tcs.matematycy2013;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class PlayersNicksGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	JTextField[] players = new JTextField[2];
	int active = 0;

	 public PlayersNicksGUI(String nick1, String nick2) {
		 setPreferredSize(new Dimension(150,100));
		players[0] = new JTextField(nick1);
		players[1] = new JTextField(nick2);
		for (int i=0; i<2; i++) {
			players[i].setMinimumSize(new Dimension(150, 50));
			players[i].setFont(new Font("Serif", Font.PLAIN, 30));
			players[i].setHorizontalAlignment(JTextField.CENTER);
			players[i].setEditable(false);
		}
		format();
	 }

	 private void format() {
		 setLayout(new GridLayout(2,1));
		 add(players[0]);
		 add(players[1]);
		 updateActive();
	}

	 private void updateActive() {

		players[active].setFont(new Font("Serif", Font.BOLD, 30 ));
		players[active].setBackground(Color.YELLOW);
		players[(active+1)%2].setFont(new Font("Serif", Font.PLAIN, 20));
		players[(active+1)%2].setBackground(Color.LIGHT_GRAY);

	 }

	 public void changeActivePlayer() {
		 active = (active +1) % 2;
		 updateActive();
	 }


}
