package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {


    Player player;
    Board board;

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 5})
    public void addCashTest(int turn) {


        board = new Board();

        player = new Player("player_1", new Cup(), board);

        Square oldLoc = player.getPiece().getLocation();

        for(int i = 0; i < turn; i++){

            oldLoc.landedOn(player);
        }

        assertEquals(turn * 200, player.getNetWorth());
    }
}
