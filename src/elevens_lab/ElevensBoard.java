package elevens_lab;
import java.util.List;
import java.util.ArrayList;
public class ElevensBoard extends Board {
private static final int BOARD_SIZE = 9;
private static final String[] RANKS = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
private static final String[] SUITS = {"spades", "hearts", "diamonds", "clubs"};
private static final int[] POINT_VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
private static final boolean I_AM_DEBUGGING = false;
public ElevensBoard() {
super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
}
@Override
public boolean isLegal(List<Integer> selectedCards) {
if (selectedCards.size() == 2) {
return containsPairSum11(selectedCards);
} 
else if (selectedCards.size() == 3) {
return containsJQK(selectedCards);
}
else {
return false;
}
}
@Override
public boolean anotherPlayIsPossible() {
List<Integer> cIndexes = cardIndexes();
return containsPairSum11(cIndexes) || containsJQK(cIndexes);
}
private boolean containsPairSum11(List<Integer> selectedCards) {
for (int x = 0; x < selectedCards.size(); x++) {
int a= selectedCards.get(x).intValue();
for (int y = x + 1; y < selectedCards.size(); y++) {
int b= selectedCards.get(y).intValue();
if (cardAt(a).pointValue() + cardAt(b).pointValue() == 11) {
return true;
}
}
}
return false;
}
private boolean containsJQK(List<Integer> selectedCards) {
boolean King = false;
boolean Queen = false;
boolean Jack = false;
for (Integer x : selectedCards) {
int y = x.intValue();
if (cardAt(y).rank().equals("king")) {
King = true;
} 
else if (cardAt(y).rank().equals("queen")) {
Queen = true;
}
else if (cardAt(y).rank().equals("jack")) {
Jack = true;
}
}
return Jack && Queen && King;
}
}