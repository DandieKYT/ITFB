package tests;

import org.junit.jupiter.api.Test;

public class VacationTest extends TestBase {
    @Test
    public void qaTest() {
        basePage.openPage();
        vacationPage.openCareer();
        vacationPage.openVacations();
        vacationPage.openCareer();
    }
}
