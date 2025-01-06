public class Card {
    private Integer Number;
    private String Colour;
    public Card(Integer Number, String Colour){
        this.Number = Number;
        this.Colour= Colour;
    }

    public Integer GetNumber(){
        return Number;
    }

    public String GetColour(){
        return Colour;
    }

    public static void main(String[] args){
        Card card1 = new Card(1, "red");
        Card card2 = new Card(2, "red");
        Card card3 = new Card(3, "red");
        Card card4 = new Card(4, "red");
        Card card5 = new Card(5, "red");
        Card card6 = new Card(1, "blue");
        Card card7 = new Card(2, "blue");
        Card card8 = new Card(3, "blue");
        Card card9 = new Card(4, "blue");
        Card card10 = new Card(5, "blue");
        Card card11 = new Card(1, "yellow");
        Card card12 = new Card(2, "yellow");
        Card card13 = new Card(3, "yellow");
        Card card14 = new Card(4, "yellow");
        Card card15 = new Card(5, "yellow");

        Hand player1 = new Hand(card1,card2, card3, card4, card11);

        int player1_score = Hand.CalculateScore(player1);

        Hand player2 = new Hand(card12, card13, card14, card15, card6);

        int player2_score = Hand.CalculateScore(player2);

        if(player1_score == player2_score){
            System.out.println("Match is draw, Equal points of: "+ player1_score);
        } else if (player1_score > player2_score) {
            System.out.println("Player 1 is the winner with "+ player1_score + " points, Player 2: "+ player2_score);
        } else{
            System.out.println("Player 2 is the winner with "+ player2_score + " points, Player 1: "+ player1_score);
        }
    }

}
