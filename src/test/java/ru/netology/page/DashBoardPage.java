package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import ru.netology.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class DashBoardPage {

    private final SelenideElement deposit1 = $$("button").get(1);
    private final SelenideElement deposit2 = $$("[data-test-id=action-deposit] [role=button]").get(2);
    private final SelenideElement sum = $("[data-test-id=amount] .input__control");
    private final SelenideElement from = $("[data-test-id=from] .input__control");
    private final SelenideElement action = $("[data-test-id=action-transfer]");

    public DashBoardPage() {
        deposit1.shouldBe(Condition.visible);
    }

    public DashBoardPage validDeposit (DataHelper.CardInfo cardInfo) throws InterruptedException {
        deposit1.click();
        Thread.sleep(5);
        sum.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        sum.setValue(String.valueOf(cardInfo.getSum()));
        from.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        from.setValue(String.valueOf(cardInfo.getNumber()));
        action.click();
        return new DashBoardPage();
    }

    public DashBoardPage validDeposit2 (DataHelper.CardInfo cardInfo) throws InterruptedException {
        deposit2.hover();
        deposit2.click();
        Thread.sleep(5);
        sum.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        sum.setValue(String.valueOf(cardInfo.getSum()));
        from.sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        from.setValue(String.valueOf(cardInfo.getNumber()));
        action.click();
        return new DashBoardPage();
    }
}
