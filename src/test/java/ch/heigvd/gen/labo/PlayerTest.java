/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void initialCashTest() {
        assertEquals(Player.INITIAL_CASH, player.getNetWorth());
    }

    @Test
    public void addCashTest() {
        player.addCash(200);
        assertEquals(Player.INITIAL_CASH + 200, player.getNetWorth());
    }

    @Test
    public void reduceCashTest() {
        player.reduceCash(500);
        assertEquals(Player.INITIAL_CASH - 500, player.getNetWorth());
    }
}
