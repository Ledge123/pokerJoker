import java.util.*;

public class Card {

	private char number;
	private char suit;
	private String ANSI_RED = "\u001B[31m";
	private String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	private String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RESET = "\u001B[0m";

	//constructor
	Card(char number, char suit){
		this.number = number;
		this.suit = suit;

	}

	//getters
	public char getSuit(){
		return this.suit;
	}

	public char getNumber(){
		return this.number;
	}

	//setters
	public void setNumber(char number){
		this.number = number;
	}

	public void setSuit(char suit){
		this.suit = suit;
	}

	//toString
	public String toString(){

		if(this.getSuit() == '♦' || this.getSuit() == '♥'){
			return ANSI_WHITE_BACKGROUND + ANSI_RED + this.getNumber() + this.getSuit() + " " + ANSI_RESET +"\n";
		}
		else{
			return ANSI_WHITE_BACKGROUND + ANSI_BLACK + this.getNumber() + this.getSuit() + " " + ANSI_RESET +"\n";
		}
	}
}