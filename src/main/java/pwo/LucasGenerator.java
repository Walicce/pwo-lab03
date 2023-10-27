/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

/**
 *
 * @author nadyasimakovich
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LucasGenerator {

    public static void main(String[] args) {
        int n = 100; // Liczba wyrazów do wygenerowania
        long[] lucasSequence = new long[n];

        // Generowanie ciągu Lucasa
        lucasSequence[0] = 2;
        lucasSequence[1] = 1;
        for (int i = 2; i < n; i++) {
            lucasSequence[i] = lucasSequence[i - 1] + lucasSequence[i - 2];
        }

        // Zapisywanie ciągu Lucasa do pliku tekstowego
        String fileName = "lucas_sequence.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < n; i++) {
                writer.write(String.valueOf(lucasSequence[i]));
                writer.newLine();
            }
            System.out.println("Ciąg Lucasa został zapisany do pliku " + fileName);
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania do pliku: " + e.getMessage());
        }
    }
}
