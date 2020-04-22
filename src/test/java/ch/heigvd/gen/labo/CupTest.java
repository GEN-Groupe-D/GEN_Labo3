package ch.heigvd.gen.labo;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    @RepeatedTest(20)
    void cupRollTest(){
        Cup cup = new Cup(MonopolyGame.NB_DICE);

        cup.roll();

        assertTrue(cup.getTotal() >= 2 && cup.getTotal() <= 12);
    }
}
