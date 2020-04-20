package ch.heigvd.gen.labo;

import java.util.ArrayList;

public class Board {
    private static final int SQUARE_NB = 40;

    private ArrayList<Square> squares;

    /**
     * Board class constructor
     */
    public Board() {
        squares = new ArrayList<Square>();

        squares.add(new Square("Go"));
        for (int i = 1; i < SQUARE_NB; i++) {
            squares.add(new Square("Square " + i));
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
}
