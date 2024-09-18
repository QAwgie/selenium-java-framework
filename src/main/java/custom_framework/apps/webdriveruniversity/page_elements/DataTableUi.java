package custom_framework.apps.webdriveruniversity.page_elements;

import custom_framework.apps.webdriveruniversity.CommonFlows;
import org.openqa.selenium.By;

public class DataTableUi extends CommonFlows {
    public By theSecondRowFirstTable(){
        return By.cssSelector("#t01 tbody tr:nth-child(2)");
    }

    public By firstNameInput(){
        return By.name("firstname");
    }

    public By lastNameInput(){
        return By.name("lastname");
    }

    public By textAreaInput(){
        return By.tagName("textarea");
    }

    public By randomTextFooter(){
        return By.tagName("footer");
    }

    public By lastVegetableItem(){
        return By.xpath("//li[@id='veggie']/following-sibling::li[last()]");
    }
}