/*
 * GEN Labo3 - Monopoly
 * Authors  : Julien Béguin & Thomas Rieder
 * Date     : 22.04.2020
 */

package ch.heigvd.gen.labo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void squareInitializedWithCorrectName() {
        String name = "Square 1";
        Square square = new RegularSquare(name);
        assertEquals(square.getName(), name);
    }
}
