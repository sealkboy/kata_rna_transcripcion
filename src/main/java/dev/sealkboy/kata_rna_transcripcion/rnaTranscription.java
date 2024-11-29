package dev.sealkboy.kata_rna_transcripcion;

import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {

    private static final Map<Character, Character> DNA_TO_RNA_MAP = new HashMap<>();

    static {
        DNA_TO_RNA_MAP.put('C', 'G');
        DNA_TO_RNA_MAP.put('G', 'C');
        DNA_TO_RNA_MAP.put('T', 'A');
        DNA_TO_RNA_MAP.put('A', 'U');
    }

    public String transcribe(String dnaStrand) {
        StringBuilder rnaTranscripted = new StringBuilder();

        for (char dnaChar : dnaStrand.toCharArray()) {
            rnaTranscripted.append(DNA_TO_RNA_MAP.getOrDefault(dnaChar, dnaChar));
        }

        return rnaTranscripted.toString();
    }
}
