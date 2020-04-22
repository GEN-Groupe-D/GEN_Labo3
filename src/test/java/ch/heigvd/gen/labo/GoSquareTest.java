/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {


    Player player;
    Board board;

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 5})
    public void addCashTest(int turn) {


        board = new Board();

        player = new Player("player_1", new Cup(MonopolyGame.NB_DICE), board);

        Square oldLoc = player.getPiece().getLocation();

        for(int i = 0; i < turn; i++){

            oldLoc.landedOn(player);
        }

        assertEquals(Player.INITIAL_CASH + (turn * GoSquare.ADD_CASH_AMOUNT), player.getNetWorth());
    }
}
