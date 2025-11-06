import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class TextShifter {
    public static void main(String [] args) throws IOException {
        String source = readFile();
        Map<Character, Character> charMap = populateMap();
//        Map<Character, Character> charMap = populateReversedMap();
        char[] result = source.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if(charMap.containsKey(result[i])) {
                result[i] = charMap.get(result[i]);
            }
        }
        String destString = new String(result);
        System.out.println(destString);
    }

    private static String readFile() throws IOException {
        String path = "<ABSOLUTE_PATH>";
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append("\n");
            }
        }
        return content.toString();
    }

    private static Map<Character, Character> populateMap() {
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('a', 'b');
        charMap.put('b', 'c');
        charMap.put('c', 'd');
        charMap.put('d', 'e');
        charMap.put('e', 'f');
        charMap.put('f', 'g');
        charMap.put('g', 'h');
        charMap.put('h', 'i');
        charMap.put('i', 'j');
        charMap.put('j', 'k');
        charMap.put('k', 'l');
        charMap.put('l', 'm');
        charMap.put('m', 'n');
        charMap.put('n', 'o');
        charMap.put('o', 'p');
        charMap.put('p', 'r');
        charMap.put('r', 's');
        charMap.put('s', 't');
        charMap.put('t', 'u');
        charMap.put('u', 'w');
        charMap.put('w', 'x');
        charMap.put('x', 'y');
        charMap.put('y', 'z');
        charMap.put('z', 'a');

        charMap.put('A', 'B');
        charMap.put('B', 'C');
        charMap.put('C', 'D');
        charMap.put('D', 'E');
        charMap.put('E', 'F');
        charMap.put('F', 'G');
        charMap.put('G', 'H');
        charMap.put('H', 'I');
        charMap.put('I', 'J');
        charMap.put('J', 'K');
        charMap.put('K', 'L');
        charMap.put('L', 'M');
        charMap.put('M', 'N');
        charMap.put('N', 'O');
        charMap.put('O', 'P');
        charMap.put('P', 'R');
        charMap.put('R', 'S');
        charMap.put('S', 'T');
        charMap.put('T', 'U');
        charMap.put('U', 'W');
        charMap.put('W', 'X');
        charMap.put('X', 'Y');
        charMap.put('Y', 'Z');
        charMap.put('Z', 'A');
        return charMap;
    }

    private static Map<Character, Character> populateReversedMap() {
        Map<Character, Character> reversedMap = new HashMap<>();
        reversedMap.put('b', 'a');
        reversedMap.put('c', 'b');
        reversedMap.put('d', 'c');
        reversedMap.put('e', 'd');
        reversedMap.put('f', 'e');
        reversedMap.put('g', 'f');
        reversedMap.put('h', 'g');
        reversedMap.put('i', 'h');
        reversedMap.put('j', 'i');
        reversedMap.put('k', 'j');
        reversedMap.put('l', 'k');
        reversedMap.put('m', 'l');
        reversedMap.put('n', 'm');
        reversedMap.put('o', 'n');
        reversedMap.put('p', 'o');
        reversedMap.put('r', 'p');
        reversedMap.put('s', 'r');
        reversedMap.put('t', 's');
        reversedMap.put('u', 't');
        reversedMap.put('w', 'u');
        reversedMap.put('x', 'w');
        reversedMap.put('y', 'x');
        reversedMap.put('z', 'y');
        reversedMap.put('a', 'z');

        reversedMap.put('B', 'A');
        reversedMap.put('C', 'B');
        reversedMap.put('D', 'C');
        reversedMap.put('E', 'D');
        reversedMap.put('F', 'E');
        reversedMap.put('G', 'F');
        reversedMap.put('H', 'G');
        reversedMap.put('I', 'H');
        reversedMap.put('J', 'I');
        reversedMap.put('K', 'J');
        reversedMap.put('L', 'K');
        reversedMap.put('M', 'L');
        reversedMap.put('N', 'M');
        reversedMap.put('O', 'N');
        reversedMap.put('P', 'O');
        reversedMap.put('R', 'P');
        reversedMap.put('S', 'R');
        reversedMap.put('T', 'S');
        reversedMap.put('U', 'T');
        reversedMap.put('W', 'U');
        reversedMap.put('X', 'W');
        reversedMap.put('Y', 'X');
        reversedMap.put('Z', 'Y');
        reversedMap.put('A', 'Z');
        return reversedMap;
    }


}
