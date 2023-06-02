public class Game {
    public Player Dealer;
    public Player Player;
//    public Card card1;
//    public Card card2;
    public Card[][] deck;


    public static void main(String[] args) {
        Game blackjack = new Game();







    }
    public Game(){
        Player Dealer = new Player();
        Player player = new Player();
        Dealer.isDealer=true;
        deck= new Card[52][12];
//        card1=new Card(1,1);
//        card2=new Card(2,4);
//        card1.printCard();
//        card2.printCard();
        fillDeck();


    }




    public void fillDeck(){
        for (int c = 0; c<13;c++)
            for (int i = 0; i<4; i++){
                //fill each spot in the deck with a card
               deck[c][i]=new Card(c,i);
               deck[c][i].printCard();







            }
    }


    public void printLength() {
        System.out.println(deck.length);

    }




}
