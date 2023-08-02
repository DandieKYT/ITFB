package tests;

import org.junit.jupiter.api.Test;

public class VkTelegramTest extends TestBase {
   @Test
    public void testVkTelegram() {
        basePage.openPage();
        vkTelegramPage.vkOpen();
        vkTelegramPage.checkOutResult();
        vkTelegramPage.telegramOpen();
        vkTelegramPage.checkOutResult();
    }
}
