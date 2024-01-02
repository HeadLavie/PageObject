package ru.netology.data;

import lombok.Value;

import java.util.Random;

public class DataHelper {

    private DataHelper() {
    }

    public static AuthInfo getAuthInfo() {
        // AuthInfo authInfo = new AuthInfo("vasya", "qwerty123");
        // return authInfo;
        return new AuthInfo("vasya", "qwerty123");
    }

    public static VerificationCode getVerificationCode() {
        return new VerificationCode("12345");
    }

    public static CardInfo getCardInfo() {
        return new CardInfo("5559000000000002", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static CardInfo getCard2Info() {
        return new CardInfo("5559000000000001", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    public static int generateValidAmount (int balance) {
        return new Random().nextInt(Math.abs(balance)) + 1;
    }

    public static int generateInvalidAmount (int balance) {
        return Math.abs(balance) + new Random().nextInt(10000);
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    @Value
    public static class CardInfo {
        private String number;
        private String id;

    }
}
