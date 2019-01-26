package iPhone;

import ButtonsPage.Buttons;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends Buttons {

Buttons buttons;

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        buttons = PageFactory.initElements(ad,Buttons.class);
        ui.getButtonPage();
    }
    @Test
    public void testUIButton() throws InterruptedException {
        buttons.checkUIButton();
        sleep(2);
    }
    @Test
    public void testBackgroundImage() throws InterruptedException {
        buttons.checkBackgroundImage();
        sleep(2);
    }
    @Test
    public void getButtonTest(){
        buttons.buttonTesting();
    }
    @Test
    public void getMoreInformation(){
        buttons.getMoreInfo();
    }

}
