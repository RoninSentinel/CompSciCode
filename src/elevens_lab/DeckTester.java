package elevens_lab;
public class DeckTester {
public static void main(String[] args) {
First();
Second();
Third();
}
//shuffled cards
private static void First() {
String[] x = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
String[] y = {"spades", "hearts", "diamonds", "clubs"};
int[] z = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
Deck a = new Deck(x, y, z);
Deck b = new Deck(x, y, z);
assert a != b : "Decks d1 and d2 are the same physical object.";
assert a.size() == b.size() : "Deck d1 size of " + a.size()
+ " does not match deck d2 size of " + b.size() + ".";
boolean equiv = true;
while (!a.isEmpty()) {
Card c = a.deal();
Card d = b.deal();
if (!c.matches(d)) {
equiv = false;
}
}
assert !equiv : "Unquivalent";
}
//single ace card
private static void Second() {
String[] x = {"spades"};
String[] y = {"ace"};
int[] z = {1};
Deck d = new Deck(y, x, z);
testOneCard(d, new Card("ace", "spades", 1));
testEmpty(d);
d.shuffle();
testOneCard(d, new Card("ace", "spades", 1));
testEmpty(d);
}
private static void Third() {
String[] x = {"hearts"};
String[] y = {"ace", "2"};
int[] z = {1, 2};
Deck d = new Deck(y, x, z);
boolean one, two;
assert d.size() == 2 : "size = " + d.size();
assert !d.isEmpty() : "empty";
Card c = d.deal();
assert c != null : "one = blank";
two= c.matches(new Card("2", "hearts", 2));
one = c.matches(new Card("ace", "hearts", 1));
assert (two ||one) : "first card" + c;
assert d.size() == 1 : "new size" + d.size();
assert !d.isEmpty() : "empty";
c = d.deal();
assert c != null : "second = blank";
if (one) {
assert c.matches(new Card("2", "hearts", 2))	: "second card";
} else {
assert c.matches(new Card("ace", "hearts", 1)) : "second card ";
}
testEmpty(d);
d.shuffle();
c = d.deal();
assert c != null : "one = blank";
two = c.matches(new Card("2", "hearts", 2));
one = c.matches(new Card("ace", "hearts", 1));
assert (one || two) : "first card ";
assert d.size() == 1 : "Size is " + d.size();
assert !d.isEmpty() : "empty";
c = d.deal();
assert c != null : "second = blank";
if (one) {
assert c.matches(new Card("2", "hearts", 2)) : "two = " + c;
} 
else {
assert c.matches(new Card("ace", "hearts", 1)): "two = " + c;
}
testEmpty(d);
}
private static void testEmpty(Deck d) {
assert d.size() == 0 :  "size = " + d.size();
assert d.isEmpty() : "empty";
Card c = d.deal();
assert c == null : "card = " + c;
}
private static void testOneCard(Deck d, Card c) {
assert d.size() == 1 : "Size is " + d.size();
assert !d.isEmpty() : "empty";
Card x= d.deal();
assert x != null : "one = blank";
assert x.matches(c) : "first card";
}
}