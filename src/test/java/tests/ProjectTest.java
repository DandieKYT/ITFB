package tests;

import org.junit.jupiter.api.Test;

public class ProjectTest extends TestBase {
    @Test
    public void testProject() {
        basePage.openPage();
        projectPage.openCases();
        projectPage.industryCheckBox();
        projectPage.backEndCheckBox();
        projectPage.turnkeySolutions();
        projectPage.checkoutResult();
    }
}
