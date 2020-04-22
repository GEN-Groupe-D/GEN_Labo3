/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

public class IncomeTaxSquare extends Square {
    public static final double REDUCE_PERCENT_NET_WORTH = 0.1;
    public static final int REDUCE_MAX_VALUE = 200;

    /**
     * Square class constructor
     *
     * @param name Square name
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.reduceCash(Math.min(REDUCE_MAX_VALUE, (int)(p.getNetWorth() * REDUCE_PERCENT_NET_WORTH)));
    }
}
