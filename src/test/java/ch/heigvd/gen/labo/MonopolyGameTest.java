package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void normalGame() {
        assertAll(()->{
            MonopolyGame mg = new MonopolyGame(MonopolyGame.MIN_PLAYER_NB);
            mg.playGame();
        });
    }
}
