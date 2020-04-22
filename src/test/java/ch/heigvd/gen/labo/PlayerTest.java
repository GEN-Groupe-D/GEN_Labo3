package ch.heigvd.gen.labo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

public class PlayerTest {

    Player player;

    @BeforeEach
    void constructPlayer() {

        player = new Player("player_1", new Cup(MonopolyGame.NB_DICE), new Board());
    }

    @Test
    public void initializedNameTest() {
        assertEquals(player.getName(), "player_1");
    }

    @Test
    public void initializedPieceTest() {
        assertEquals(player.getPiece().getLocation().getName(), "Go");
    }

    @RepeatedTest(100)
    public void takeTurnTest() {
        player.takeTurn();
        assertTrue(player.getPiece().getLocation().getName().contains("Square"));
    }

    @Test
    public void addCashTest() {
        player.addCash(200);
        assertEquals(200, player.getNetWorth());
    }

    @Test
    public void reduceCashTest() {
        player.addCash(500);
        player.reduceCash(200);
        assertEquals(300, player.getNetWorth());
    }
}
