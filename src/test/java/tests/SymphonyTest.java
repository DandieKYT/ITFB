package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

public class SymphonyTest extends TestBase {
    @Tag("controlProgramAndAgroindustry")
    @CsvSource(value = {
            "Инструкция по эксплуатации ПО  ,      ИНСТРУКЦИЯ ПО ЭКСПЛУАТАЦИИ",
            "Отраслевые решения,   Агропромышленность",

    })
    @Owner("Кудрявцев")
    @Feature("Управление программами и Агропромышленность")
    @Story("Открытие страниц Управление программами, Агропромышленность и проверка их содержимого")
    @ParameterizedTest
    public void controlProgramAndAgroindustry(String param, String expectedText) throws IOException {
        basePage.openPage();
        symphonyPage.openSymphony();
        symphonyPage.openTitle(param);
        symphonyPage.pdfFileInstrictions(expectedText);

    }
}
