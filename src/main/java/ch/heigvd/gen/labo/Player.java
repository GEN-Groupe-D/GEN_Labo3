package ch.heigvd.gen.labo;

import java.util.ArrayList;

class Player {
    private String name;
    private ArrayList<Die> dices;
    private Board board;
    private Piece piece;
    private int cash;

    /**
     * Player class constructor
     * @param name Player name
     * @param dices Dices of the game
     * @param board Board of the game
     */
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
        int total = 0;
        Square oldLoc, newLoc;

        // 1. Calculate a random number total between 2 and 12
        for (Die dice : dices) {
            dice.roll();
            total += dice.getFaceValue();
        }

        // 2. Calculate the new square location
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, total);

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

    /**
     * add a sum to current player cash
     * @param sumToAdd
     */
    public void addCash(int sumToAdd) {
        this.cash += sumToAdd;
    }

    /**
     * remove some cash to the player
     * @param sumToSub
     */
    public void reduceCash(int sumToSub) {
        this.cash -= sumToSub;
    }

    /**
     * @return total cash of player
     */
    public int getNetWorth() {
        return this.cash;
    }
}
