import java.util.*;

public class Person {

	private int playerNum;
	private string name;
	private ArrayList<Card> hand;
	private int stack;
	private int position;

	//constructor
	public Person(Table PokerTable, int buyIn){
		this.position = PokerTable.addPlayer();
		this.stack = buyIn;
	}

	public Person(){


	}

	//getters
	public int getPlayerNum(){
		return this.playerNum;
	}

	public string getName(){
		return this.name;
	}

	public ArrayList<Card> getHand(){
		return this.hand;
	}

	public int getStack(){
		return this.stack;
	}

	public int getPosition(){
		return this.position;
	}

	//setters
	public void setPlayerNum(int playerNum){
		this.playerNum = playerNum;
	}


	public void setName(string name){
		this.number = name;
	}

	public void setHand(ArrayList<Card> hand){
		this.hand = hand;
	}

	public void setStack(int stack){
		this.stack = stack;
	}

	public void setPosition(int position){
		this.position = position;
	}



}