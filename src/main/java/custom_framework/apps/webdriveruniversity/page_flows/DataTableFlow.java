package custom_framework.apps.webdriveruniversity.page_flows;

import custom_framework.apps.webdriveruniversity.page_elements.DataTableUi;

public class DataTableFlow extends DataTableUi {
    public void writeTextSecondRowFirstTable(){
        String text = getText(theSecondRowFirstTable());
        System.out.println("First row text reads: " + text);
    }

    public void fillNameAndLastName(String firstName, String lastName){
        input(firstNameInput(), firstName);
        input(lastNameInput(), lastName);
    }

    public void fillTextArea(String text){
        input(textAreaInput(), text);
    }

    public String getFooterText(){
        return getText(randomTextFooter());
    }

    public String getLastVegetableItem(){
        return getText(lastVegetableItem());
    }
}
