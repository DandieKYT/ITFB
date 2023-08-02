package pages;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class VkTelegramPage {

    private SelenideElement vkOpen = $x("//*[contains(@class, 'tn-elem__4462814441658821923454')]//*[contains(@class, 'tn-atom__img')]"),
            telegramOpen = $x("//*[contains(@class, 'tn-elem__4462814441658821923459')]//*[contains(@class, 'tn-atom__img')]");

    public VkTelegramPage vkOpen() {
        step("Открытие вкладки карьера", () -> {
            vkOpen.scrollIntoView(true).click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public VkTelegramPage telegramOpen() {
        step("Открытие вкладки карьера", () -> {
            telegramOpen.scrollIntoView(true).click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public VkTelegramPage checkOutResult() {
        step("Проверка содержимого страницы", () -> {
            $(byTagAndText( "h1","ITFB"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }

}

