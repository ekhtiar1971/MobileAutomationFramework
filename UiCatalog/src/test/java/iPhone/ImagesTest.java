package iPhone;

import ImgesPage.Images;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImagesTest extends Images {
    Images im;
    @BeforeMethod
    public void getImageinfo()throws InterruptedException{
        UiCatalog uc= PageFactory.initElements(ad,UiCatalog.class);
    }

    @Test
    public void getImages(){
        im.getImages();
    }
    @Test
    public void getUiImages(){
        im.getUiImage();
    }

}
