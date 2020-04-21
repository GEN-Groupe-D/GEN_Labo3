package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {

    Player player;
    Board board;

    @Test
    public void reducePlayerCashTest() {

        ArrayList<Die> dices = new ArrayList<Die>();
        for (int i = 0; i < MonopolyGame.NB_DICE; i++) {
            dices.add(new Die());
        }

        board = new Board();

        player = new Player("player_1", dices, board);
        player.addCash(300);

        Square oldLoc = player.getPiece().getLocation();

        //10 is the location of IncomeTaxSquare
        Square newLoc = board.getSquare(oldLoc, 10);

        player.getPiece().setLocation(newLoc);
        newLoc.landedOn(player);

        assertEquals(270, player.getNetWorth());
    }

}
