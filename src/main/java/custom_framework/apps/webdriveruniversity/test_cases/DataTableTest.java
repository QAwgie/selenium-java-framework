package custom_framework.apps.webdriveruniversity.test_cases;

import custom_framework.apps.webdriveruniversity.page_flows.DataTableFlow;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTableTest extends DataTableFlow {
    @Test
    public void testDataTable(){
        navDataTable();
        writeTextSecondRowFirstTable();
        fillNameAndLastName("Tester", "Testerovic");
        fillTextArea("Nešto nešto, neki text");
        sleepTime(1200);
        refreshPage();
        sleepTime(1200);

        String actualText = getFooterText();
        String expectedText = "Platea dictumst quisque sagittis purus sit amet volutpat consequat.";

        String actualLastVegetable = getLastVegetableItem();
        String expectedLastVegetable = "Lentils";

        Assert.assertEquals(actualText, expectedText, "Text does not match!");
        Assert.assertEquals(actualLastVegetable, expectedLastVegetable, "The last vegetable does not match!");
    }
}
