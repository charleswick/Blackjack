
public class Card {
    public String suit;
    public int value;
    public String name;
    public Boolean isDealt;

    public Card(int pSuit, int pName){
        if (pSuit == 0){
            suit = "diamonds";

        }
        if (pSuit == 1){
            suit = "clubs";

        }
        if (pSuit == 2){
            suit = "spades";

        }
        if (pSuit == 3){
            suit = "hearts";

        }




    }
}
