package me.dev;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.lang.management.PlatformLoggingMXBean;

public class PeliTest extends TestCase {
    private Peli testiPeli = new Peli();

        @Test
        public void testaaVoittaja() {
            Pelaaja player1 = new Pelaaja();
            player1.valitseManual(0);

            Pelaaja player2 = new Pelaaja();
            player2.valitseManual(1);

            assertTrue(Peli.voittaja(player1, player2) instanceof Peli.Voittaja);
        }
}