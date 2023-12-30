package ru.netology.test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.DashBoardPage;
import ru.netology.page.LoginPageV1;
import ru.netology.page.VerificationPage;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MoneyTransferTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");

    }

    @Test
    void ShouldTransferMoneyBetweenCardsV1() throws InterruptedException {
        var authInfo = DataHelper.getAuthInfo();
        var cardInfo = DataHelper.getCardInfo();
        var validCode = DataHelper.getVerificationCode();

        LoginPageV1 login = new LoginPageV1();
        login.validLogin(authInfo);

        VerificationPage verification = new VerificationPage();
        verification.validCode(validCode);

        DashBoardPage dashboard = new DashBoardPage();
        dashboard.validDeposit(cardInfo);
    }

    @Test
    void ShouldTransferMoneyBetweenCardsV2() throws InterruptedException {
        var authInfo = DataHelper.getAuthInfo();
        var cardInfo = DataHelper.getCardInfo();
        var validCode = DataHelper.getVerificationCode();

        LoginPageV1 login = new LoginPageV1();
        login.validLogin(authInfo);

        VerificationPage verification = new VerificationPage();
        verification.validCode(validCode);

        DashBoardPage dashboard = new DashBoardPage();
        dashboard.validDeposit2(cardInfo);
    }
}


