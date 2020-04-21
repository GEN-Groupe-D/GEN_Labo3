package ch.heigvd.gen.labo;

class Die {
    private int faceValue;

    /**
     * Roll die
     */
    public void roll() {
        faceValue = 1 + (int)(Math.random() * 6);
    }

    /**
     * @return die's value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
