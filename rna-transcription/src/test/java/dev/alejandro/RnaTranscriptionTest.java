package dev.alejandro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitarios para la clase RnaTranscription
 * Usamos JUnit 5
 */
class RnaTranscriptionTest {

    @Test
    void transcribesGToC() {
        assertEquals("C", RnaTranscription.toRna("G"));
    }

    @Test
    void transcribesCToG() {
        assertEquals("G", RnaTranscription.toRna("C"));
    }

    @Test
    void transcribesTToA() {
        assertEquals("A", RnaTranscription.toRna("T"));
    }

    @Test
    void transcribesAToU() {
        assertEquals("U", RnaTranscription.toRna("A"));
    }

    @Test
    void transcribesFullStrand() {
        // Verificamos que una cadena completa se traduce correctamente
        assertEquals("CGAU", RnaTranscription.toRna("GCTA"));
    }

    @Test
    void invalidNucleotideThrowsException() {
        // Si el ADN contiene un caracter inválido, debe lanzar excepción
        assertThrows(IllegalArgumentException.class, () -> RnaTranscription.toRna("BXZ"));
    }
}