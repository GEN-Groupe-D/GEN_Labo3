package ch.heigvd.gen.labo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    private Board board;

    @BeforeEach
    void constructBoard() {
        board = new Board();
    }

    @Test
    public void firstSquareIsGo() {
        Square square = board.getFirstSquare();
        assertEquals(square.getName(), "Go");
    }

    @Test
    public void incrementSquare() {
        Square square1 = board.getFirstSquare();

        Square square2 = board.getSquare(square1, 9);
        assertEquals(square2.getName(), "Square 9");

        Square square3 = board.getSquare(square2, 1);
        assertEquals(square3.getName(), "Square 10");
    }

    @Test
    public void lastSquareToGoSquare() {
        Square lastSquare = board.getSquare(board.getFirstSquare(), Board.SQUARE_NB - 1);
        assertEquals(lastSquare.getName(), "Square " + (Board.SQUARE_NB - 1));

        Square firstSquare = board.getSquare(lastSquare, 1);
        assertEquals(firstSquare.getName(), "Go");
    }
}
