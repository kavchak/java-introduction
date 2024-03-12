package com.hillel.homework.lesson11;

public class PasswordGenerator {

    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        String password = generatePassword();
        System.out.println("Generated password: " + password);
    }

    public static String generatePassword() {
        char[] password = CharacterValidator.generateRandomPasswordChars(PASSWORD_LENGTH);

        if (!CharacterValidator.isValid(password)) return generatePassword();

        return new String(password);
    }
}

