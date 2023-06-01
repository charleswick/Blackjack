import java.util.ArrayList;

public class Player {
    public int currentValue;
    public Boolean isBust;
    public Boolean isDealer;
    public ArrayList<Card> hand = new ArrayList<Card>();
    public Player() {
        for (Card b: hand){
            currentValue+= b.value;
        }

        isBust=false;
        isDealer=false;
        if (currentValue>21){
            isBust=true;
        }


    }
}
