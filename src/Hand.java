import java.util.Objects;

public class Hand{
    private static Card[] Cards = new Card[10];
    private Integer FirstCard;
    private Integer NumberCards;

    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5){
        Cards[0] = card1;
        Cards[1] = card2;
        Cards[2] = card3;
        Cards[3] = card4;
        Cards[4] = card5;
        FirstCard = 0;
        NumberCards = 5;
    }

    public Card GetCard(int index){
        return Cards[index];
    }

    public static int CalculateScore(Hand player){
        int score = 0;
        for (int i = 0; i < 5; i++) {

            score = score + Cards[i].GetNumber();
            if(Objects.equals(Cards[i].GetColour(), "red")){
                score = score + 5;
            } else if (Objects.equals(Cards[i].GetColour(), "blue")) {
                score = score +10;
            } else if (Objects.equals(Cards[i].GetColour(), "yellow")){
                score = score + 15;
            }
        }
        return score;
    }
}

