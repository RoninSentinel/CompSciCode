package elevens_lab;

public class CardTester {
public static void main(String[] args) {
Card c1 = new Card("Clubs", "10", 10);
Card c2 = new Card("Heart", "King", 13);
Card c3 = new Card("Clubs", "10", 10);
	
System.out.println("Card 1 = Card 3: " + c3.matches(c1));
System.out.println("Card 2 = Card 1: " + c2.matches(c1));
	}
}

