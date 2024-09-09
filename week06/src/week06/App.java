public class App {
    public static void main(String[] args) throws Exception {

        Deck gameDeck = new Deck();
        System.out.println("*** Deck created ***");

        gameDeck.shuffle();
        System.out.println("*** Deck shuffled***");

        Player player1 = new Player("Player 1");
        System.out.println("*** Player 1 created ***");

        Player player2 = new Player("Player 2");
        System.out.println("*** Player 2 created ***");

        System.out.println();

        // Deal hands to players
        for(int i = 0; i < 52; i++){
            Card topCard = gameDeck.draw();
            if(i % 2 == 0){
                player1.setHand(topCard);
            }else {
                player2.setHand(topCard);
            }
        }

        // Play game
        for(int i = 0; i < 26; i++){
            Card p1Card = player1.flip();
            Card p2Card = player2.flip();
            System.out.print("Player 1: ");
            p1Card.describe();
            System.out.print("Player 2: ");
            p2Card.describe();
            if(p1Card.getValue() == p2Card.getValue()){
                System.out.println("DRAW !");
            } else if (p1Card.getValue() > p2Card.getValue()){
                player1.incrementScore();
                System.out.println("Player 1 wins");
            } else {
                player2.incrementScore();
                System.out.println("Player 2 wins");
            }
            System.out.println("**Scores**");
            System.out.print("Player 1: ");
            System.out.println(player1.getScore());
            System.out.print("Player 2: ");
            System.out.println(player2.getScore());
            System.out.println();
        }

        System.err.println("***FINAL SCORE***");
        System.out.print("Player 1: ");
        System.out.println(player1.getScore());
        System.out.print("Player 2: ");
        System.out.println(player2.getScore());
        if(player1.getScore() == player2.getScore()){
            System.out.println("DRAW!!");
        } else if (player1.getScore() > player2.getScore()){
            System.out.println("PLAYER 1 WINS!!!");
        } else {
            System.out.println("PLAYER 2 WINS!!!");
        }
    }
}
