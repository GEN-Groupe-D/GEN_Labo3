package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {

    Player player;
    Board board;

    @Test
    public void reducePlayerCashTest() {

        board = new Board();

        player = new Player("player_1", new Cup(), board);
        player.addCash(300);

        Square oldLoc = player.getPiece().getLocation();

        //10 is the location of IncomeTaxSquare
        Square newLoc = board.getSquare(oldLoc, Board.INCOME_TAX_SQUARE_POS);

        player.getPiece().setLocation(newLoc);
        newLoc.landedOn(player);

        assertEquals(270, player.getNetWorth());
    }

}
