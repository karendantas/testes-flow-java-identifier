package com.karendantas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("IdentifierTest")
public class IdentifierTest {

    private Identifier identifier;

    @BeforeEach
    public void setUp() {
        identifier = new Identifier();
    }

    @Test
    @DisplayName("has to return false for identifier start without letter")
    public void testIdentifierNotStartWithLetter(){
        assertFalse(identifier.validateIdentifier("1S43"));
    }

    @Test
    @DisplayName("has to return false for identifier with space")
    public void testIdentifierNotStartWithSpace(){
        assertFalse(identifier.validateIdentifier("1S4 3"));
    }

    @Test
    @DisplayName("has to return false if identifier has more than 6 caracters")
    public void testIdentifierHasMoreThan6Caracters(){
        assertFalse(identifier.validateIdentifier("sndjfks4123sjifd"));
    }

    @Test
    @DisplayName("has to return true if identifier is complete correct")
    public void testIdentifierIsCompleteCorrect(){
        assertTrue(identifier.validateIdentifier("abcdef"));
    }

    @Test
    @DisplayName("has to return false if identifier has special caracters")
    public void testIdentifierHasSpecialCaracters(){
        assertFalse(identifier.validateIdentifier("ab&%$ef"));
    }
}
