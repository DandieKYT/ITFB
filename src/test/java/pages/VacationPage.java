package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class VacationPage {
    private SelenideElement
            openCareer = $x("//*[contains(@class, 'tn-elem__4462814441651239770556')]//a[text()='Карьера']"),
            openVacations = $x("//*[@id='sbs-448294744-1651217946276']//*[contains(@class, 'tn-atom')]"),
            checkQaVacation = $x("//span[text()='QA-специалист (АТ+ФТ)']");


    public VacationPage openCareer() {
        step("Открытие вкладки карьера", () -> {
            openCareer.scrollIntoView(true).click();
        });
        return this;
    }

    public VacationPage openVacations() {
        step("Нажатие на кнопку СМОТРЕТЬ ВАКАНСИИ", () -> {
            openVacations.click();
        });
        return this;
    }

    public VacationPage checkQaVacation() {
        step("Проверка наличия вакансии QA", () -> {
            checkQaVacation.shouldBe(Condition.visible);
        });
        return this;
    }
}
