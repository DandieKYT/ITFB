package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class VkTelegramTest extends TestBase {
    @Test
    @Owner("Кудрявцев")
    @Feature("Проверка социальных страниц ВК и Telegram")
    @Story("Открытие и проверка содержимого страниц ВК/Telegram")
    public void testVkTelegram() {
        basePage.openPage();
        vkTelegramPage.vkOpen();
        vkTelegramPage.checkOutResult();
        vkTelegramPage.telegramOpen();
        vkTelegramPage.checkOutResult();
    }
}
