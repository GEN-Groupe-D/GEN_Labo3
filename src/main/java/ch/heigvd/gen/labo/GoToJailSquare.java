package ch.heigvd.gen.labo;

public class GoToJailSquare extends Square {
    /**
     * Square class constructor
     *
     * @param name Square name
     */

    private Square jailSquare;

    public GoToJailSquare(String name, Square jailSquare) {
        super(name);
        this.jailSquare = jailSquare;
    }

    @Override
    public void landedOn(Player p) {

        p.setLocation(jailSquare);
    }
}
