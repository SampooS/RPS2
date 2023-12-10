package me.dev;

/**
 * The `Peli` class represents a simple rock-paper-scissors game between two players.
 * The game is played until one player reaches three wins.
 *
 * @author Sampo Savolainen
 */
public class Peli {
    /**
     * The main method initializes two players, plays the game, and determines the winner.
     *
     * @param args Command line arguments (not used in this program).
     */

    public static void main(String[] args) {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        boolean peliLoppui = false;
        int eraNro = 1; // Pelattujen pelien lkm
        int p1Voitot = p1.voitot; // Pelaaja 1:n voittojen lkm
        int p2Voitot = p2.voitot; // Pelaaja 2:n voittojen lkm
        int tasapelit = 0; // Tasapelien lkm
        String p1Valinta;
        String p2Valinta;

        do {
            System.out.print("Erä: "
                    + eraNro + " =====================\n");
            System.out.println("Tasapelien lukumäärä: "
                    + tasapelit + "\n");
            System.out.println("Voitot: "
                    + "Pelaaja 1: " + p1Voitot
                    + "\n\tPelaaja 2: " + p2Voitot + "\n");
            
            p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1 valinta: " + p1Valinta);

            p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2 valinta : " + p2Valinta + "\n");


            switch (voittaja(p1, p2)) {
                case p1:
                    System.out.println("Pelaaja 1 voitti erän!");
                    p1.incrementVoitot();
                    p1Voitot = p1.getVoitot();
                    break;
                case p2:
                    System.out.println("Pelaaja 2 voitti erän!");
                    p2.incrementVoitot();
                    p2Voitot = p2.getVoitot();
                    break;
                default:
                    System.out.println("Tasapeli!");
                    tasapelit++;
                    break;
            }

            eraNro++;

            if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
                peliLoppui = true;
                System.out.println("\nKOLME VOITTOA - PELI PÄÄTTYY");

                if (p1.getVoitot() > 2) {
                    System.out.println("Pelaaja 1 voitti pelin!");
                } else {
                    System.out.println("Pelaaja 2 voitti pelin!");
                }
            }
        } while (!peliLoppui);
    }
    /**
     * Determines the winner of a round based on the choices made by two players.
     *
     * @param p1 Player 1
     * @param p2 Player 2
     * @return The winner of the round (p1, p2, or tasapeli - tie)
     */

    public static Voittaja voittaja(Pelaaja p1, Pelaaja p2) {
        switch (p1.pelaajanValinta()) {
            case "kivi":
                switch (p2.pelaajanValinta()) {
                    case "kivi":
                        return Voittaja.tasapeli;
                    case "paperi":
                        return Voittaja.p2;
                    case "sakset":
                        return Voittaja.p1;
                }
            case "paperi":
                switch (p2.pelaajanValinta()) {
                    case "kivi":
                        return Voittaja.p1;
                    case "paperi":
                        return Voittaja.tasapeli;
                    case "sakset":
                        return Voittaja.p2;
                }
            case "sakset":
                switch (p2.pelaajanValinta()) {
                    case "kivi":
                        return Voittaja.p2;
                    case "paperi":
                        return Voittaja.p1;
                    case "sakset":
                        return Voittaja.tasapeli;
                }
        }
        throw new AssertionError();
    }
    /**
     * Enumeration representing the possible outcomes of a game: Player 1 wins (p1),
     * Player 2 wins (p2), or it's a tie (tasapeli).
     * @p1 Player 1
     * @p2 Player 2
     * @tasapeli Tie
     */

    public enum Voittaja {
        p1, p2, tasapeli
    }
}
