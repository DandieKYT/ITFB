package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class VacationTest extends TestBase {
    @Test
    @Owner("Кудрявцев")
    @Feature("Проверка вакансии QA")
    @Story("Открытие и проверка страницы c вакансиями на наличие QA")
    public void qaTest() {
        basePage.openPage();
        vacationPage.openCareer();
        vacationPage.openVacations();
        vacationPage.checkQaVacation();
    }
}
