package ch.heigvd.gen.labo;

public class IncomeTaxSquare extends Square {
    /**
     * Square class constructor
     *
     * @param name Square name
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        int w = p.getNetWorth();

        int tenPercent = (int)(w * 0.1);

        int amount = Math.min(200, tenPercent);

        p.reduceCash(amount);

    }
}
