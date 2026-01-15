package VibeASCII_Art;

import java.util.Scanner;

public class MainAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Print 5 rows; each character contributes one row of its glyph
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                // Accessing the static method from the other class
                String[] glyph = AsciiArtText.glyphFor(input.charAt(i));
                line.append(glyph[row]).append("  "); // spacing between letters
            }
            System.out.println(line);
        }

        sc.close();
    }
}