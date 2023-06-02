
public class Card {
    public String suit;
    public int value;
    public String name;
    public Boolean isDealt;

    public Card(int pName, int pSuit){
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

        if(pName==0){
            name = "Ace";
            value=11;

        }
        if(pName==1){
            name = "Two";
            value=2;

        }
        if(pName==2){
            name = "Three";
            value=3;

        }
        if(pName==3){
            name = "Four";
            value=4;

        }
        if(pName==4){
            name = "Five";
            value=5;

        }
        if(pName==5){
            name = "Six";
            value=6;

        }
        if(pName==6){
            name = "Seven";
            value=7;

        }
        if(pName==7){
            name = "Eight";
            value=8;

        }
        if(pName==8){
            name = "Nine";
            value=9;

        }
        if(pName==9){
            name = "Ten";
            value=10;

        }
        if(pName==10){
            name = "Jack";
            value=10;

        }
        if(pName==11){
            name = "Queen";
            value=10;

        }
        if(pName==12){
            name = "King";
            value=10;
        }
        isDealt=false;


    }
    public void printCard(){
        System.out.println("There is a " +name+" of "+suit+" which has a value of "+value);
    }
}
