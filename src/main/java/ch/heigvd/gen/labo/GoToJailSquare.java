/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

public class GoToJailSquare extends Square {

    private Square jailSquare;

    /**
     * Square class constructor
     *
     * @param name Square name
     * @param jailSquare Jail Square
     */
    public GoToJailSquare(String name, Square jailSquare) {
        super(name);
        this.jailSquare = jailSquare;
    }

    @Override
    public void landedOn(Player p) {

        p.setLocation(jailSquare);
    }
}
