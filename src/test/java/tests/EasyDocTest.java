package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class EasyDocTest extends TestBase {
    @Test
    @Owner("Кудрявцев")
    @Feature("Проверка EasyDoc")
    @Story("Открытие и проверка страницы EasyDoc")
    public void easyDocTest() {
        basePage.openPage();
        easyDocPage.openEasyDoc();
        easyDocPage.checkoutLogoEasyDoc();
    }
}
