
package me.dev;

/**
 * The `Pelaaja` class represents a player in the rock-paper-scissors game.
 * It keeps track of the player's wins and provides methods for making a random choice and updating win count.
 *
 * @author Sampo Savolainen
 */
public class Pelaaja {

    int voitot;      // Voittojen lukumäärä

    /**
     * Generates a random choice among "kivi" (rock), "paperi" (paper), or "sakset" (scissors).
     *
     * @return A randomly chosen string representing the player's choice.
     */
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }
    /**
     * Generates a choice among "kivi" (rock), "paperi" (paper), or "sakset" (scissors) based on the given integer.
     * @param choiceInt The integer representing the player's choice.
     * @return A string representing the player's choice.
     */
    public String valitseManual(int choiceInt) {
        String valinta = "";
        switch (choiceInt) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }
    /**
     * Increments the win count and returns the total number of wins.
     *
     * @return The updated total number of wins after incrementing.
     */

    public int incrementVoitot() {
        int voitotYhteensä = voitot++;
        return voitotYhteensä;
    }
    /**
     * Gets the current number of wins for the player.
     *
     * @return The current number of wins.
     */

    public int getVoitot() {
        return (voitot);
    }
}
