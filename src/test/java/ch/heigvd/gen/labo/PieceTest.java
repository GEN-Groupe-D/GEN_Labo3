package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {

    @Test
    public void getNameTest() {
        String pieceName = "Cheval";
        Piece piece = new Piece(pieceName, new RegularSquare("Go"));
        assertEquals(piece.getName(), pieceName);
    }

    @Test
    public void getLocationTest() {
        String squareName = "Go";
        Piece piece = new Piece("Cheval", new RegularSquare(squareName));
        assertEquals(piece.getLocation().getName(), squareName);
    }

    @Test
    public void setLocationTest() {
        String squareName = "Square 1";
        Piece piece = new Piece("Cheval", new RegularSquare("Go"));
        piece.setLocation(new RegularSquare(squareName));
        assertEquals(piece.getLocation().getName(), squareName);
    }
}
