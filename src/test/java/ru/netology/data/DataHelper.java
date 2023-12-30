package ru.netology.data;

import lombok.Value;

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
        return new CardInfo(5559000000000002L, 10000);
    }

    public static CardInfo getCard2Info() {
        return new CardInfo(5559000000000001L, 10000);
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
        private long number;
        private int sum;

    }
}
