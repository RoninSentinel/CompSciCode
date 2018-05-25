package elevens_lab;
import java.util.List;
import java.util.ArrayList;
public abstract class Board {
private Card[] cards;
private Deck deck;
private static final boolean I_AM_DEBUGGING = false;
public Board(int size, String[] ranks, String[] suits, int[] pointValues) {
cards = new Card[size];
deck = new Deck(ranks, suits, pointValues);
if (I_AM_DEBUGGING) {
System.out.println(deck);
System.out.println("----------");
}
dealMyCards();
}
public void newGame() {
deck.shuffle();
dealMyCards();
}
public int size() {
return cards.length;
}
public boolean isEmpty() {
for (int x =0; x < cards.length;x++) {
if (cards[x] != null) {
return false;
}
}
return true;
}
public void deal(int y) {
cards[y] = deck.deal();
}
public int deckSize() {
return deck.size();
}
public Card cardAt(int y) {
return cards[y];
}
public void replaceSelectedCards(List<Integer> selectedCards) {
for (Integer z : selectedCards) {
deal(z.intValue());
}
}
public List<Integer> cardIndexes() {
List<Integer> taken = new ArrayList<Integer>();
for (int x=0;x < cards.length; x++) {
if (cards[x] != null) {
taken.add(new Integer(x));
}
}
return taken;
}
public String toString() {
String x = "";
for (int i = 0; i < cards.length; i++) {
x = x + i + ": " + cards[i] + "\n";
}
return x;
}
public boolean gameIsWon() {
if (deck.isEmpty()) {
for (Card x :cards) {
if (x != null) {
return false;
}
}
return true;
}
return false;
}
public abstract boolean isLegal(List<Integer> selectedCards);
public abstract boolean anotherPlayIsPossible();
private void dealMyCards() {
for (int x = 0; x< cards.length;x++) {
cards[x] = deck.deal();
}
}
}