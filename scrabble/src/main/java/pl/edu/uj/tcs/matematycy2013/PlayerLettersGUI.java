package pl.edu.uj.tcs.matematycy2013;


import java.awt.FlowLayout;

import javax.swing.JPanel;


public class PlayerLettersGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	LetterButton[] letters = new LetterButton[7];
	ButtonMouseListener btnMseLnr;

	public PlayerLettersGUI(Cell cell, ButtonMouseListener btnMseLnr) {
		this.btnMseLnr=btnMseLnr;
		setLayout(new FlowLayout());
		for (int i=0; i<7; i++) {
			letters[i] = new LetterButton(cell);
			letters[i].addMouseListener(btnMseLnr);
			add(letters[i]);
		}
	}
	public PlayerLettersGUI(Letter[] playerLetters, ButtonMouseListener btnMseLnr) {
		this(Cell.PLAYERLETTER,btnMseLnr);
		for (int i=0; i<7; i++) {
			if (playerLetters[i] != null) {
				letters[i].withLetter(playerLetters[i]);
			} else {
				letters[i].noLetter();
			}
		}
	}

	public void changePlayer(Letter[] newLetters) {
		for (int i=0; i<7; i++) {
			if (newLetters[i] != null) {
				letters[i].withLetter(newLetters[i]);
			} else {
				letters[i].noLetter();
			}
		}
	}

}
