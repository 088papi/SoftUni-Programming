package Task3;

public class Card {

    private CardRanks rank;
    private CardSuit suit;
    private int power;

    public Card(CardRanks rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
        calculatePower();
    }

    private int calculatePower(){
        return this.power = rank.getRankPower() + suit.getValue();
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank, this.suit.name(), this.power);
    }
}
