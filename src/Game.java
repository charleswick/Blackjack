public class Game {
    public Player Dealer;
    public Player Player;
    //    public Card card1;
//    public Card card2;
    public Card[] deck;
    public int count = 0;


    public static void main(String[] args) {
        Game blackjack = new Game();


    }

    public Game() {
        Player Dealer = new Player();
        Player player = new Player();
        Dealer.isDealer = true;
        deck = new Card[52];
//        card1=new Card(1,1);
//        card2=new Card(2,4);
//        card1.printCard();
//        card2.printCard();
        fillDeck();
        System.out.println("--------------");
        shuffleDeck();


    }


    public void fillDeck() {
        for (int c = 0; c < 4; c++)
            for (int i = 0; i < 13; i++) {
                //fill each spot in the deck with a card
                deck[count] = new Card(i, c);
                //deck[count].printCard();
                count++;



            }
    }

    public void shuffleDeck() {

                // shuffle the deck
        Card[] shuffledDeck = new Card[52];

        for(int t =0; t<shuffledDeck.length;t++){
            int randomCard = (int)(Math.random()*52);
            Card shuffleCard = deck[randomCard];
            while(deck[randomCard].isShuffled==true){
                randomCard = (int)(Math.random()*52);
                shuffleCard = deck[randomCard];

            }
            deck[randomCard].isShuffled=true;
            shuffleCard.printCard();
            shuffledDeck[t]=shuffleCard;






        }
        deck=shuffledDeck;








    }
}
