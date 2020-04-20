package ch.heigvd.gen.labo;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Die> dices;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dices, Board board) {
        this.name = name;
        this.dices = dices;
        this.board = board;
        piece = new Piece("piece_" + name, board.getFirstSquare());
    }

    /**
     * Play player turn
     */
    public void takeTurn() {
        int fvTot = 0;
        Square oldLoc, newLoc;

        // 1. Calculate a random number total between 2 and 12
        for (Die dice : dices) {
            dice.roll();
            fvTot += dice.getFaceValue();
        }

        // 2. Calculate the new square location
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, fvTot);

        // 3. Move the player's piece from the old location to the new location
        piece.setLocation(newLoc);
    }

    /**
     * @return Get player name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Get player piece
     */
    public Piece getPiece() {
        return piece;
    }
}
