package tests;

import org.junit.jupiter.api.Test;

public class EasyDocTest extends TestBase {
    @Test
    public void easyDocTest(){
        basePage.openPage();
        easyDocPage.openEasyDoc();
        easyDocPage.checkoutLogoEasyDoc();
    }
}
