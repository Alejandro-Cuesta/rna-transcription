package dev.alejandro;

/**
 * Clase que se encarga de transcribir una cadena de ADN a ARN.
 * Cada nucleótido de ADN se reemplaza por su complemento en ARN:
 * G -> C, C -> G, T -> A, A -> U
 */
public class RnaTranscription {

    // Método que recibe una cadena de ADN y devuelve su transcripción a ARN
     
    public static String toRna(String dna) {
        StringBuilder rna = new StringBuilder(dna.length());

        // Recorremos cada nucleótido de la cadena DNA
        for (char c : dna.toCharArray()) {
            switch (c) {
                case 'G': rna.append('C'); break; // G -> C
                case 'C': rna.append('G'); break; // C -> G
                case 'T': rna.append('A'); break; // T -> A
                case 'A': rna.append('U'); break; // A -> U
                default: 
                    // Si el caracter no es válido, lanzamos excepción
                    throw new IllegalArgumentException("Nucleótido inválido: " + c);
            }
        }

        return rna.toString();
    }
}