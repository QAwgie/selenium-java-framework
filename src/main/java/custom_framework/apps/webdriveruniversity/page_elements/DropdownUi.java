package custom_framework.apps.webdriveruniversity.page_elements;

import custom_framework.apps.webdriveruniversity.CommonFlows;
import org.openqa.selenium.By;

public class DropdownUi extends CommonFlows {

    public By firstDropdown(){
        return By.id("dropdowm-menu-1");
    }
    public By secondDropdown(){
        return By.id("dropdowm-menu-2");
    }
    public By thirdDropdown(){
        return By.id("dropdowm-menu-3");
    }
    public By fruitDropdown(){
        return By.id("fruit-selects");
    }
    public By checkboxes(){
        return By.cssSelector("input[type='checkbox']");
    }
    public By radioButtons(){
        return By.cssSelector("input[type='radio']");
    }
    public By disabledCabbage() {return By.cssSelector("input[value='cabbage']");}
    public By radioOrange() {return By.cssSelector("input[value='orange']");}
}
