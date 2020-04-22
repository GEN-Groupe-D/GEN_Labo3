package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoToJailSquareTest {

    Player player;
    Board board;

    @Test
    public void reducePlayerCashTest() {


        board = new Board();

        player = new Player("player_1", new Cup(MonopolyGame.NB_DICE), board);

        Square oldLoc = player.getPiece().getLocation();

        Square newLoc = board.getSquare(oldLoc, Board.GO_TO_JAIL_SQUARE_POS);

        player.getPiece().setLocation(newLoc);
        newLoc.landedOn(player);

        assertEquals("PrisonSquare", player.getPiece().getLocation().getName());
    }
}
