/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

class Player {
    public static final int INITIAL_CASH = 1500;

    private String name;
    private Cup cup;
    private Board board;
    private Piece piece;
    private int cash;

    /**
     * Player class constructor
     * @param name Player name
     * @param cup cup od Dices
     * @param board Board of the game
     */
    public Player(String name, Cup cup, Board board) {
        this.name = name;
        this.cup = cup;
        this.board = board;
        cash = INITIAL_CASH;
        piece = new Piece("piece_" + name, board.getFirstSquare());
    }

    /**
     * Play player turn
     */
    public void takeTurn() {
        int total;
        Square oldLoc, newLoc;

        cup.roll();
        System.out.println(name + " rolled " + cup.getTotal());

        total = cup.getTotal();

        // 2. Calculate the new square location
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, total);

        // 3. Move the player's piece from the old location to the new location
        piece.setLocation(newLoc);
        newLoc.landedOn(this);
        System.out.println(name + " landed on " + newLoc.getName());
    }

    public void setLocation(Square newLoc) {

        piece.setLocation(newLoc);
        newLoc.landedOn(this);
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
     * @param sumToAdd Amount of cash to add
     */
    public void addCash(int sumToAdd) {
        this.cash += sumToAdd;
    }

    /**
     * remove some cash to the player
     * @param sumToSub Amount of cash to remove
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
