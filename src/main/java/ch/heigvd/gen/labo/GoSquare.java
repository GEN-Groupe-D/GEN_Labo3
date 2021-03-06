/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

public class GoSquare extends Square {
    public final static int ADD_CASH_AMOUNT = 200;

    /**
     * Square class constructor
     *
     * @param name Square name
     */
    public GoSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {

        p.addCash(ADD_CASH_AMOUNT);
    }
}
