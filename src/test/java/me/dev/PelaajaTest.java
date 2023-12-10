package me.dev;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class PelaajaTest extends TestCase {
    Pelaaja testPlayer = new Pelaaja();
    public void setUp() throws Exception {
        testPlayer.pelaajanValinta();
        super.setUp();
    }
    @Test
    public void testPelaajanValinta() {
        assertTrue("Return type is String",  testPlayer.pelaajanValinta() instanceof java.lang.String);
    }
    @Test
    public void testSetVoitot() {
        int first = testPlayer.getVoitot();
        testPlayer.incrementVoitot();
        assertEquals(first+1, testPlayer.getVoitot());
    }
    @Test
    public void testGetVoitot() {
        assertTrue(Integer.class.isInstance(testPlayer.getVoitot()));
    }

    @Test
    public void testValitseManual() {
        assertEquals("kivi", testPlayer.valitseManual(0));
        assertEquals("paperi", testPlayer.valitseManual(1));
        assertEquals("sakset", testPlayer.valitseManual(2));
    }
}