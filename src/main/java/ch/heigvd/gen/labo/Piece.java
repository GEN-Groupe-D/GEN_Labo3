package ch.heigvd.gen.labo;

class Piece {
    private String name;
    private Square location;

    /**
     * Piece class constructor
     * @param name Piece name
     * @param location Piece initial location
     */
    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    /**
     * @return Get piece location on the board
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Set new location to current piece
     * @param newLocation Location to move to.
     */
    public void setLocation(Square newLocation) {
        this.location = newLocation;
    }

    /**
     * @return Get piece name
     */
    public String getName() {
        return name;
    }
}
