/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    @RepeatedTest(20)
    void cupRollTest(){
        Cup cup = new Cup(MonopolyGame.NB_DICE);

        cup.roll();

        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
    }

    @Test
    void cupRollRepeatedTestWithSameInstance() {
        Cup cup = new Cup(MonopolyGame.NB_DICE);

        for (int i = 0; i < 100; i++) {
            cup.roll();
            assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
        }
    }
}
