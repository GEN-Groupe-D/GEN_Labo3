package ch.heigvd.gen.labo;

import java.util.ArrayList;

public class Cup {

    private ArrayList<Die> dices = new ArrayList<Die>();
    private int total;

    public Cup() {

        this.total = 0;

        for (int i = 0; i < MonopolyGame.NB_DICE; i++) {

            this.dices.add(new Die());
        }
    }

    /**
     * roll the dices generate number and add to total
     */
    public void roll() {

        // Calculate a random number total between 2 and 12
        for (Die dice : this.dices) {
            dice.roll();
            this.total += dice.getFaceValue();
        }
    }

    /**
     * @return int between 2 and 12
     */
    public int getTotal() {
        return this.total;
    }
}
