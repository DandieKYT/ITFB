package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class ProjectTest extends TestBase {
    @Test
    @Owner("Кудрявцев")
    @Feature("Проверка страницы проекты")
    @Story("Открытие старницы проекты и проверка резульатата после введения данных")
    public void testProject() {
        basePage.openPage();
        projectPage.openCases();
        projectPage.industryCheckBox();
        projectPage.backEndCheckBox();
        projectPage.turnkeySolutions();
        projectPage.checkoutResult();
    }
}
