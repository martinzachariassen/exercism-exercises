import java.util.*;

class SqueakyClean {
    static String clean(String identifier) {
        String result = identifier.replaceAll("\\s", "_");

        Map<Character, Character> replacementMap = Map.of(
                '4', 'a',
                '3', 'e',
                '0', 'o',
                '1', 'l',
                '7', 't'
        );

        StringBuilder cleanedIdentifier = new StringBuilder();

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);

            // Handle kebab-case to camelCase conversion
            if (currentChar == '-' && i + 1 < result.length() && Character.isLetter(result.charAt(i + 1))) {
                cleanedIdentifier.append(Character.toUpperCase(result.charAt(i + 1)));
                i++; // Skip the next character since it's already processed
            }
            // Replace characters based on the map
            else if (replacementMap.containsKey(currentChar)) {
                cleanedIdentifier.append(replacementMap.get(currentChar));
            }
            // Append valid characters
            else if (Character.isLetterOrDigit(currentChar) || currentChar == '_') {
                cleanedIdentifier.append(currentChar);
            }
        }

        return cleanedIdentifier.toString();
    }
}
