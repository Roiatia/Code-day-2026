package VibeASCII_Art;

import java.util.HashMap;
import java.util.Map;

public class AsciiArtText {

    // 5-row tall font dictionary
    private static final Map<Character, String[]> FONT = new HashMap<>();

    static {
        // Letters (A-Z)
        FONT.put('A', new String[]{" ### ", "#   #", "#####", "#   #", "#   #"});
        FONT.put('B', new String[]{"#### ", "#   #", "#### ", "#   #", "#### "});
        FONT.put('C', new String[]{" ####", "#    ", "#    ", "#    ", " ####"});
        FONT.put('D', new String[]{"#### ", "#   #", "#   #", "#   #", "#### "});
        FONT.put('E', new String[]{"#####", "#    ", "#### ", "#    ", "#####"});
        FONT.put('F', new String[]{"#####", "#    ", "#### ", "#    ", "#    "});
        FONT.put('G', new String[]{" ####", "#    ", "# ###", "#   #", " ####"});
        FONT.put('H', new String[]{"#   #", "#   #", "#####", "#   #", "#   #"});
        FONT.put('I', new String[]{"#####", "  #  ", "  #  ", "  #  ", "#####"});
        FONT.put('J', new String[]{"#####", "   # ", "   # ", "#  # ", " ##  "});
        FONT.put('K', new String[]{"#   #", "#  # ", "###  ", "#  # ", "#   #"});
        FONT.put('L', new String[]{"#    ", "#    ", "#    ", "#    ", "#####"});
        FONT.put('M', new String[]{"#   #", "## ##", "# # #", "#   #", "#   #"});
        FONT.put('N', new String[]{"#   #", "##  #", "# # #", "#  ##", "#   #"});
        FONT.put('O', new String[]{" ### ", "#   #", "#   #", "#   #", " ### "});
        FONT.put('P', new String[]{"#### ", "#   #", "#### ", "#    ", "#    "});
        FONT.put('Q', new String[]{" ### ", "#   #", "#   #", "#  ##", " ####"});
        FONT.put('R', new String[]{"#### ", "#   #", "#### ", "#  # ", "#   #"});
        FONT.put('S', new String[]{" ####", "#    ", " ### ", "    #", "#### "});
        FONT.put('T', new String[]{"#####", "  #  ", "  #  ", "  #  ", "  #  "});
        FONT.put('U', new String[]{"#   #", "#   #", "#   #", "#   #", " ### "});
        FONT.put('V', new String[]{"#   #", "#   #", "#   #", " # # ", "  #  "});
        FONT.put('W', new String[]{"#   #", "#   #", "# # #", "## ##", "#   #"});
        FONT.put('X', new String[]{"#   #", " # # ", "  #  ", " # # ", "#   #"});
        FONT.put('Y', new String[]{"#   #", " # # ", "  #  ", "  #  ", "  #  "});
        FONT.put('Z', new String[]{"#####", "   # ", "  #  ", " #   ", "#####"});

        // Digits (0-9)
        FONT.put('0', new String[]{" ### ", "#  ##", "# # #", "##  #", " ### "});
        FONT.put('1', new String[]{"  #  ", " ##  ", "  #  ", "  #  ", "#####"});
        FONT.put('2', new String[]{" ### ", "#   #", "   # ", "  #  ", "#####"});
        FONT.put('3', new String[]{"#### ", "    #", " ### ", "    #", "#### "});
        FONT.put('4', new String[]{"#   #", "#   #", "#####", "    #", "    #"});
        FONT.put('5', new String[]{"#####", "#    ", "#### ", "    #", "#### "});
        FONT.put('6', new String[]{" ### ", "#    ", "#### ", "#   #", " ### "});
        FONT.put('7', new String[]{"#####", "   # ", "  #  ", " #   ", "#    "});
        FONT.put('8', new String[]{" ### ", "#   #", " ### ", "#   #", " ### "});
        FONT.put('9', new String[]{" ### ", "#   #", " ####", "    #", " ### "});

        // Space and unknown
        FONT.put(' ', new String[]{"     ", "     ", "     ", "     ", "     "});
        FONT.put('?', new String[]{" ### ", "#   #", "  ## ", "     ", "  #  "});
    }

    // Changed to public so MainAscii can access it
    public static String[] glyphFor(char ch) {
        char up = Character.toUpperCase(ch);
        if (FONT.containsKey(up)) return FONT.get(up);
        return FONT.get('?');
    }
}