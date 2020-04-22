/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import java.util.ArrayList;

public class Cup {

    private ArrayList<Die> dices = new ArrayList<Die>();
    private int total;

    public Cup(int nbDice) {
        for (int i = 0; i < nbDice; i++) {

            dices.add(new Die());
        }
    }

    /**
     * roll the dices generate number and add to total
     */
    public void roll() {
        total = 0;
        // Calculate a random number total between 2 and 12
        for (Die dice : dices) {
            dice.roll();
            total += dice.getFaceValue();
        }
    }

    /**
     * @return int between 2 and 12
     */
    public int getTotal() {
        return total;
    }
}
