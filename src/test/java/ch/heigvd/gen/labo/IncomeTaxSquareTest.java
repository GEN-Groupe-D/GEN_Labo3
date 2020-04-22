/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {

    Player player;
    Board board;
    Square oldLoc;
    Square newLoc;

    @BeforeEach
    public void constructTest() {
        board = new Board();
        player = new Player("player_1", new Cup(MonopolyGame.NB_DICE), board);

        oldLoc = player.getPiece().getLocation();
        newLoc = board.getSquare(oldLoc, Board.INCOME_TAX_SQUARE_POS);
    }

    @Test
    public void reducePlayerCashWithPercentNetWorth() {
        player.getPiece().setLocation(newLoc);
        newLoc.landedOn(player);

        assertEquals((1 - IncomeTaxSquare.REDUCE_PERCENT_NET_WORTH) * Player.INITIAL_CASH, player.getNetWorth());
    }

    @Test
    public void reducePlayerCashWithFixedValue() {
        player.addCash(1000);
        player.getPiece().setLocation(newLoc);
        newLoc.landedOn(player);

        assertEquals(Player.INITIAL_CASH + 1000 - IncomeTaxSquare.REDUCE_MAX_VALUE, player.getNetWorth());
    }

}
