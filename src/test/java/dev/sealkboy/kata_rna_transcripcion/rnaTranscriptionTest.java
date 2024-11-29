package dev.sealkboy.kata_rna_transcripcion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RnaTranscriptionTest {

    @Test
    void testTranscribeValidDnaStrand() {
        RnaTranscription rnaTranscription = new RnaTranscription();

        String dna = "ACGT";
        String expectedRna = "UGCA";

        String result = rnaTranscription.transcribe(dna);

        assertEquals(expectedRna, result);
    }

    @Test
    void testTranscribeWithUnknownCharacters() {
        RnaTranscription rnaTranscription = new RnaTranscription();

        String dna = "ACGTX";
        String expectedRna = "UGCAX";

        String result = rnaTranscription.transcribe(dna);

        assertEquals(expectedRna, result);
    }

    @Test
    void testTranscribeEmptyString() {
        RnaTranscription rnaTranscription = new RnaTranscription();

        String dna = "";
        String expectedRna = "";

        String result = rnaTranscription.transcribe(dna);

        assertEquals(expectedRna, result);
    }

    @Test
    void testTranscribeWithLowercaseInput() {
        RnaTranscription rnaTranscription = new RnaTranscription();

        String dna = "acgt";
        String expectedRna = "acgt"; // Assuming case-sensitive handling

        String result = rnaTranscription.transcribe(dna);

        assertEquals(expectedRna, result);
    }
}
