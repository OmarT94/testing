package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSources;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void summe_richtig_wenn_10plus10_ist20() {
        int a = 10;
        int b = 10;
        int rictigeSumme = 20;

        int actualeSumme =Main.summe(a,b);
       assertEquals(rictigeSumme,actualeSumme);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 10, 20",
            "14, 7, 21"
    })

    void summe2_richtig_wenn_10plus10_ist20(int a, int b, int rictigeSumme) {

        int actualeSumme =Main.summe(a,b);
        assertEquals(rictigeSumme,actualeSumme);
    }

    @Test
    void istGeradeZahl_returnTrue() {
        int a = 18;
        boolean result = Main.istGeradeZahl(a);
        assertTrue(result);
    }

    @Test
    void summeMult_2nummer_returnCorrectProduct() {
        int a = 6;
        int b = 6;
        int result = 36;
        int resultMain = Main.summeMult(a,b);
        assertEquals(resultMain,result);


    }

    @Test
    void toUppercase() {

            String result =Main.toUppercase("hello world");

            assertEquals("HELLO WORLD", result);

    }

    @Test
    void zahlIstPositv_wennGrosserAlsNullIst() {
        int zah=8;

        boolean res=Main.zahlIstPositv(zah);
        assertTrue(res);
    }
}