/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {

    @Test
    public void onePlayerGame() {
        assertThrows(
                IllegalArgumentException.class,
                ()->{
                    new MonopolyGame(1);
                }
        );
    }

    @Test
    public void tooMuchPlayersInGame() {
        assertThrows(
                IllegalArgumentException.class,
                ()->{
                    new MonopolyGame(MonopolyGame.MAX_PLAYER_NB + 1);
                }
        );
    }

    @Test
    public void normalGameDontCrash() {
        assertAll(()->{
            MonopolyGame mg = new MonopolyGame(MonopolyGame.MIN_PLAYER_NB);
            mg.playGame();
        });
    }

    @Test
    public void gameFinishInTime() {
        assertTimeout(Duration.ofSeconds(10), () -> {
            new MonopolyGame(MonopolyGame.MAX_PLAYER_NB);
        });
    }
}
