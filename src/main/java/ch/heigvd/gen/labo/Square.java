/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

abstract class Square {
    private String name;

    /**
     * Square class constructor
     * @param name Square name
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * @return Get square name
     */
    public String getName() {
        return name;
    }

    abstract public void landedOn(Player p);
}
