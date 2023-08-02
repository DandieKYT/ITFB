package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SymphonyTest extends TestBase {
    @CsvSource(value = {
            "Инструкция по эксплуатации ПО ,     Инструкция по эксплуатации ПО Симфония.pdf",
            "Описание ПО,            Описание программного обеспечения Симфония.pdf",
            "Описание процессов ПО,    Описание процессов поддержки жизненного цикла ПО Cимфония.pdf"
    })
    @Owner("Kudryavtsev")
    @Feature("Проверка PDF документа")
    @Story("Открытие страницы с PDF файлом и проверка его содержимого")
    @ParameterizedTest
    public void pdfTest(String param, String expectedText) {
        basePage.openPage();
        symphonyPage.openSymphony();
        symphonyPage.openIstructions();
        symphonyPage.openTitle(param);
        symphonyPage.checkTitle(expectedText);
    }
}
