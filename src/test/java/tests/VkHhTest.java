package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VkHhTest extends TestBase {
    @CsvSource(value = {
            "Мы на Хабр Карьере  ,      ITFB Group",
            "Мы на HeadHunter,   ITFB Group"
    })
    @ParameterizedTest
    public void testVkHh(String param, String expectedText) {
        basePage.openPage();
        vkHhPage.openTitle(param);
        vkHhPage.checkTitle(expectedText);
    }
}
