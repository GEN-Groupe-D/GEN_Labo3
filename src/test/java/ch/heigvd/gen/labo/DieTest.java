package ch.heigvd.gen.labo;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    @RepeatedTest(200)
    public void diceValueInRange() {
        Die dice = new Die();
        dice.roll();
        assertTrue(dice.getFaceValue() >= 1);
        assertFalse(dice.getFaceValue() > 6);
    }
}
