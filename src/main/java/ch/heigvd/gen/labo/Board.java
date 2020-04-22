/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import java.util.ArrayList;

class Board {
    public static final int SQUARE_NB = 40;
    public static final int INCOME_TAX_SQUARE_POS = 20;
    public static final int PRISON_SQUARE_POS = 10;
    public static final int GO_TO_JAIL_SQUARE_POS = 30;

    private ArrayList<Square> squares;

    /**
     * Board class constructor
     */
    public Board() {
        squares = new ArrayList<Square>();

        squares.add(new GoSquare("Go"));
        for (int i = 1; i < SQUARE_NB; i++) {
            switch (i){
                case INCOME_TAX_SQUARE_POS:
                    squares.add(new IncomeTaxSquare("IncomeTaxSquare"));
                    break;
                case PRISON_SQUARE_POS:
                    squares.add(new RegularSquare("PrisonSquare"));
                    break;
                case GO_TO_JAIL_SQUARE_POS:
                    squares.add(new GoToJailSquare("GoToJailSquare", squares.get(PRISON_SQUARE_POS)));
                    break;
                default:
                    squares.add(new RegularSquare("Square " + i));

            }
        }
    }

    /**
     * Get new square by adding "moveNb" to "initialSquare"
     * @param initialSquare Initial square
     * @param moveNb Number of square to move
     * @return New square
     */
    public Square getSquare(Square initialSquare, int moveNb) {
        return squares.get((squares.indexOf(initialSquare) + moveNb) % squares.size());
    }

    /**
     * @return Get board's first square (Go square)
     */
    public Square getFirstSquare() {
        return squares.get(0);
    }

}
