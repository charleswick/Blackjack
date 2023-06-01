public class Game {
    public Player Dealer;
    public Player Player;


    public static void main(String[] args) {
        Game blackjack = new Game();
        Player Dealer = new Player();
        Player player = new Player();
        Dealer.isDealer=true;




    }



    public int deck[]= new int[52];

    public void fillDeck(){
        for (int i = 0; i<deck.length; i++){

        }
    }


    public void printLength() {
        // how many total plants are there in the row?
        System.out.println(deck.length);

    }




}
