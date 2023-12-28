package ru.netology.data;

import lombok.Value;

public class DataHelper {

    private DataHelper(){}

    @Value
    public static class AuthInfo{
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    @Value
    private static class VerificationCode {
        private String code;
    }
    public static VerificationCode getVerificationCode(AuthInfo authinfo) {
        return new VerificationCode("12345");
    }
}
