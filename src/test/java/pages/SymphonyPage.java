package pages;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;


public class SymphonyPage {
    private SelenideElement openSymphony = $x("//a[text()='Symphony']"),
            pdfFileInstrictions = $x("//*[contains(@class, 't142A__wraptwo')]/a");

    public SelenideElement openTitle(String param) {
        return $(byTagAndText("span", (param)));
    }

    public SymphonyPage pdfFileInstrictions(String expectedText) throws IOException {
        File download = pdfFileInstrictions.download();
        PDF pdf = new PDF(download);
        assertThat(pdf, containsText(expectedText));
        return this;
    }


    public SymphonyPage openSymphony() {
        step("Открытие страницы симфонии", () -> {
            openSymphony.scrollIntoView(true);
            openSymphony.click();
        });
        return this;
    }

}
