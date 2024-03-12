package com.hillel.homework.lesson11;

public class CharacterValidator {

    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String UNDERSCORE_CHAR = "_";

    private static final String ALL_ALLOWED_CHARS = UPPERCASE_CHARS + LOWERCASE_CHARS + DIGITS + UNDERSCORE_CHAR;

    public static char[] generateRandomPasswordChars(int passwordLength) {
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int randomIndex = (int) (Math.random() * ALL_ALLOWED_CHARS.length());
            password[i] = ALL_ALLOWED_CHARS.charAt(randomIndex);
        }
        return password;
    }

    public static boolean isValid(char[] password) {
        return containsCharacter(password, UPPERCASE_CHARS) &&
                containsCharacter(password, LOWERCASE_CHARS) &&
                containsCharacter(password, DIGITS) &&
                containsCharacter(password, UNDERSCORE_CHAR);
    }

    private static boolean containsCharacter(char[] password, String charactersToCheck) {
        for (int i = 0; i < password.length; i++) {
            if (charactersToCheck.indexOf(password[i]) != -1) return true;
        }
        return false;
    }
}
