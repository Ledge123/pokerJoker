import java.util.*;

public class Deck{

	ArrayList<Card> deck = new ArrayList<>();



	Deck(){

		this.deck = InitialiseDeck();
	}


	private ArrayList<Card> InitialiseDeck(){

		ArrayList<Character> numberArray = new ArrayList<>(Arrays.asList('A', '2', '3', '4', '5','6','7','8','9','1','J','Q','K'));
		ArrayList<Character> suitArray = new ArrayList<>(Arrays.asList('♦', '♥', '♣', '♠'));
		ArrayList<Card> deckInit = new ArrayList<>();

		for(int i=0;i<numberArray.size();i++){
			for(int j=0;j<suitArray.size();j++){
				deckInit.add(new Card(numberArray.get(i), suitArray.get(j)));
			}
		}
		return deckInit;

	}

}