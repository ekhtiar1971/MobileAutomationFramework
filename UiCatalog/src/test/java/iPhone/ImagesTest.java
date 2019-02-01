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
        //UiCatalog uc= PageFactory.initElements(ad,UiCatalog.class);
        im=PageFactory.initElements(ad,Images.class);
    }
    @Test
    public void getImages() {
        im.getImages();
    }
    @Test
    public void getUiImages(){
        im.getUiImage();
    }
    @Test
    public void testMoreInfo(){
        im.moreInfo7();
    }

}
