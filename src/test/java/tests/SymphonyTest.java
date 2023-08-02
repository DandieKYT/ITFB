package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SymphonyTest extends TestBase {
    @Tag("productsAndCompany")
    @CsvSource(value = {
            "Инструкция по эксплуатации ПО ,     Инструкция по эксплуатации ПО Симфония.pdf",
            "Описание ПО,            Описание программного обеспечения Симфония.pdf",
            "Описание процессов ПО,    Описание процессов поддержки жизненного цикла ПО Cимфония.pdf"
    })
    @Owner("Kudryavtsev")
    @Feature("Продукты и Компания")
    @Story("Открытие страниц Продукты и Компания и проверка их содержимого")
    @ParameterizedTest
    public void pdfTest(String param, String expectedText)  {
        basePage.openPage();
        symphonyPage.openSymphony();
        symphonyPage.openIstructions();
        symphonyPage.openTitle(param);
        symphonyPage.checkTitle(expectedText);
    }
}
