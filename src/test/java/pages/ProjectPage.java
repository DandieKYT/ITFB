package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class ProjectPage {
    private SelenideElement
            openCases = $x("//*[@id='sbs-435207823-1651217946276']//*[contains(@class, 'tn-atom')]"),
            industryCheckBox = $x("//*[contains(@class, 't-store__filter__options')]/div/div[2]/div/label/div"),
            backEndCheckBox = $x("//*[contains(@class, 't-store__filter__options')]/div[2]/div[2]/div/label/div"),
            turnkeySolutions = $x("//*[contains(@class, 't-store__filter__options')]/div[3]/div[2]/div/label/div"),
            checkoutResult = $x("//div[contains(text(), 'Сервис оплаты платежного поручения по фото в мобильном банке')]");

    public ProjectPage openCases() {
        step("Нажатие иконки смотреть кейсы", () -> {
            openCases.click();
        });
        return this;
    }

    public ProjectPage industryCheckBox() {
        step("Проставление отметки в чек-бокс Банки", () -> {
            industryCheckBox.click();
        });
        return this;
    }

    public ProjectPage backEndCheckBox() {
        step("Проставление отметки в чек-бокс Backend разработка", () -> {
            backEndCheckBox.click();
        });
        return this;
    }

    public ProjectPage turnkeySolutions() {
        step("Проставление отметки в чек-бокс Внедрение готовых решений", () -> {
            turnkeySolutions.click();
        });
        return this;
    }

    public ProjectPage checkoutResult() {
        step("Проверка резульатата выдачи", () -> {
            checkoutResult.shouldBe(Condition.text("Сервис оплаты платежного поручения по фото в мобильном банке"));
        });
        return this;
    }

}

