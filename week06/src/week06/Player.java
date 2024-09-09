
import java.util.*;

public class Player {

    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name = "";

    public Player(String name){
        this.name = name;
        this.hand = hand;
        this.score = score;
    }

    public List<Card> getHand(List<Card> hand) {
        return this.hand;
    }

    public void setHand(Card card) {
        hand.add(card);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public void incrementScore(){
        this.score += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card flip(){
        Card card = this.hand.remove(0);
        return card;
    }

    public void describe(){
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Score: " + this.score);
        System.out.println(this.name + "'s hand contains:");
        List<Card> handList = this.hand;
        for(Card card: handList){
            card.describe();
        }
    }

}
