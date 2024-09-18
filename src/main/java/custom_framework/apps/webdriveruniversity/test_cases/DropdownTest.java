package custom_framework.apps.webdriveruniversity.test_cases;

import custom_framework.apps.webdriveruniversity.page_flows.DropdownFlow;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropdownTest extends DropdownFlow {
    @Test
    public void testDropdown(){
        navDropdown();
        //Zajednicka prazna lista za sve dropdown opcije
        List<String> allDropdownOptions = new ArrayList<>();

        //Uzimanje svih opcija iz dropdown-a
        List<WebElement> firstOptions = getFirstDropdownOptions();
        addOptionToList(firstOptions, allDropdownOptions);

        List<WebElement> secondOptions = getSecondDropdownOptions();
        addOptionToList(secondOptions, allDropdownOptions);

        List<WebElement> thirdOptions = getThirdDropdownOptions();
        addOptionToList(thirdOptions, allDropdownOptions);

        List<WebElement> fruitOptions = getFruitDropdownOptions();
        addOptionToList(fruitOptions, allDropdownOptions);

        System.out.println("All dropdown options in one list: ");
            for (String option : allDropdownOptions){
                System.out.println(option);
            }
        System.out.println("Total number of options is: " + allDropdownOptions.size());
    }
    @Test
    public void testCountSelectedItems(){
        navDropdown();
        int selectedCount = 0;
        //Prvi dropdown
        Select firstDropdown = new Select(driver().findElement(firstDropdown()));
        WebElement selectedOptionOne = firstDropdown.getFirstSelectedOption();
            if(selectedOptionOne != null){
                System.out.println("Selected in first section: " + selectedOptionOne.getText());
                selectedCount++;
            }
        //Drugi dropdown
        Select secondDropdown = new Select(driver().findElement(secondDropdown()));
        WebElement selectedOptionTwo = secondDropdown.getFirstSelectedOption();
            if(selectedOptionTwo != null){
                System.out.println("Selected in second section: " + selectedOptionTwo.getText());
            selectedCount++;
            }
        //Treci dropdown
        Select thirdDropdown = new Select(driver().findElement(thirdDropdown()));
        WebElement selectedOptionThree = thirdDropdown.getFirstSelectedOption();
            if(selectedOptionThree != null){
                System.out.println("Selected in third section: " + selectedOptionThree.getText());
            selectedCount++;
            }
        //Voće dropdown
        Select fruitDropdown = new Select(driver().findElement(fruitDropdown()));
        WebElement selectedOptionFruit = fruitDropdown.getFirstSelectedOption();
        if(selectedOptionFruit != null){
            System.out.println("Selected in third section: " + selectedOptionFruit.getText());
            selectedCount++;
        }

        List<WebElement> checkboxes = driver().findElements(checkboxes());
            for(WebElement checkbox : checkboxes){
                if(checkbox.isSelected()){
                    System.out.println("Selected checkbox: " + checkbox.getAttribute("value"));
                    selectedCount++;
                }
            }
        List<WebElement> radioButtons = driver().findElements(radioButtons());
        for(WebElement radioButton : radioButtons){
            if(radioButton.isSelected()){
                System.out.println("Selected checkbox: " + radioButton.getAttribute("value"));
                selectedCount++;
            }
        }
        System.out.println("Total amount of selected items: " + selectedCount);
    }
    private void addOptionToList(List<WebElement> options, List<String> allOptionsList){
        for (WebElement option : options) {
            allOptionsList.add(option.getText());
        }
    }
}
