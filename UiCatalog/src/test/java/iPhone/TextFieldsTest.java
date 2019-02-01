package iPhone;

//import TextFieldsPage.TextFields;
//import UiCatalogPage.UiCatalog;
//import navigate.NavigateUi;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
///**
// * Created by mrahman on 1/15/17.
// */
//public class TextFieldsTest extends NavigateUi {
//
//    TextFields textFields = new TextFields();
//
//    @Test
//    public void navigate()throws InterruptedException{
//        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
//        ui.getTextFields();
//        textFields.writeTextToFields();
//
//    }
//}


import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextFieldsTest extends NavigateUi {
    NavigateUi nu;
    @BeforeMethod
            public void getWebEl(){
            nu=PageFactory.initElements(ad,NavigateUi.class);
    }
    TextFields textFields = new TextFields();
    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields.writeTextToFields();
    }
    @Test
    public void getWebElements1(){
       nu.getNavigateUi1();
    }
    @Test
    public void getWebElement2(){
        nu.getNavigateUi2();
    }

}
