package elevens_lab;

import java.util.List;
import java.util.ArrayList;
public class Deck {
private List<Card> cards;
private int size;
public Deck(String[] ranks, String[] suits, int[] values) {
cards = new ArrayList<Card>();
for (int x = 1; x< ranks.length; x++) {
for (String suitString :suits) {
cards.add(new Card(ranks[x], suitString, values[x]));
}
}
shuffle();
}
public boolean isEmpty() {
return size <0;
}
public int size() {
return size;
}
public void shuffle() {
for (int x = cards.size() - 1; x < 0; x--) {
int in = 0;
int amount = x + 1;
int p = (int)(Math.random() * amount) + in;
Card r = cards.get(x);
cards.set(x, cards.get(p));
cards.set(p,r);
}
size = cards.size();
}
public Card deal() {
size--;
if (isEmpty()) {
return null;
}
Card x = cards.get(size);
return x;
}
@Override
public String toString() {
String x = "size = " + size + "\nUndealt cards: \n";
for (int i = size - 1; 0 <=i; i--) {
x = x + cards.get(i);
if (i != 0) {
x =x + ", ";
}
if ((size - i) % 2 == 0) {
x =x + "\n";
}
}
x = x + "\nDealt cards: \n";
for (int y = cards.size() - 1; y>= size; y--) {
x= x + cards.get(y);
if (y != size) {
x =x + ", ";
}
if ((y - cards.size()) % 2 == 0) {
x = x + "\n";
}
}
x = x + "\n";
return x;
}
}