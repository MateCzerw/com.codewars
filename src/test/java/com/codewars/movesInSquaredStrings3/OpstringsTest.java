package com.codewars.movesInSquaredStrings3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpstringsTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        String s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu";
        String r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw";
        testing(Opstrings.oper(Opstrings::vertMirror, s), r);
    }

    @Test
    public void test2() {
        String s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx";
        String r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP";
        testing(Opstrings.oper(Opstrings::vertMirror, s), r);
    }

    @Test
    public void test3() {

        String s = "lVHt\nJVhv\nCSbg\nyeCt";
        String r = "yeCt\nCSbg\nJVhv\nlVHt";
        testing(Opstrings.oper(Opstrings::horMirror, s), r);
    }    @Test
    public void test4() {
        String s = "njMK\ndbrZ\nLPKo\ncEYz";
        String r = "cEYz\nLPKo\ndbrZ\nnjMK";
        testing(Opstrings.oper(Opstrings::horMirror, s), r);
    }
}