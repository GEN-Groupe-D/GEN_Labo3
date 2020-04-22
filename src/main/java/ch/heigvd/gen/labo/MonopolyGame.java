package ch.heigvd.gen.labo;

import java.util.ArrayList;

public class MonopolyGame {
    public static final int MAX_ROUND_NB = 20;
    public static final int MIN_PLAYER_NB = 2;
    public static final int MAX_PLAYER_NB = 8;
    public static final int NB_DICE = 2;

    private Board board;
    private ArrayList<Player> players;
    private Cup cup;

    /**
     * MonopolyGame class constructor
     * @param nbPlayer Number of player in the game
     */
    public MonopolyGame(int nbPlayer) {
        if (nbPlayer < MIN_PLAYER_NB || nbPlayer > MAX_PLAYER_NB) {
            throw new IllegalArgumentException("Number of player must be between " + MIN_PLAYER_NB + " and " + MAX_PLAYER_NB + " (included).");
        }

        board = new Board();
        cup = new Cup(NB_DICE);

        players = new ArrayList<Player>();
        for (int i = 0; i < nbPlayer; i++) {
            players.add(new Player("player_" + (i + 1), cup, board));
        }
    }

    /**
     * Play a game of monopoly
     */
    public void playGame() {
        for (int roundCnt = 0; roundCnt < MAX_ROUND_NB; roundCnt++) {
            playRound();
        }
    }

    /**
     * Play one round
     */
    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }

}
