package custom_framework.apps.webdriveruniversity.page_flows;

import custom_framework.apps.webdriveruniversity.page_elements.DropdownUi;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownFlow extends DropdownUi {

    public List<WebElement> getFirstDropdownOptions(){
        return getOptions(firstDropdown());
    }
    public List<WebElement> getSecondDropdownOptions(){
        return getOptions(secondDropdown());
    }
    public List<WebElement> getThirdDropdownOptions(){
        return getOptions(thirdDropdown());
    }
    public List<WebElement> getFruitDropdownOptions(){
        return getOptions(fruitDropdown());
    }
}
