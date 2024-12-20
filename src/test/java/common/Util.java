package common;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driverFactory.DriverConfig;

public class Util {
    WebDriver driver;

    String excelPath = "src/test/resources/TestData/ExcelData.xlsx";

    public Util() {
        this.driver = DriverConfig.getDriverInstance();
    }
    public String getCodeFromExcel(String sheetName, int rowIndex, String columnName) throws InvalidFormatException, IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelPath, sheetName);

        // Return the code from the specified column and row index
        return testData.get(rowIndex).get(columnName);
    }

    public String getResultFromExcel(String sheetName, int rowIndex, String columnName) throws InvalidFormatException, IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(excelPath, sheetName);

        // Return the result from the specified column and row index
        return testData.get(rowIndex).get(columnName);
    }

    public void enterCode(String code, WebElement element) {
        new Actions(driver).sendKeys(element, code).perform();
    }
    public void enterCodePractice(String code, WebElement element) {
        try {
            boolean isMac = System.getProperty("os.name").toLowerCase().contains("mac");
            Keys commandKey = isMac ? Keys.COMMAND : Keys.CONTROL;

            // Clear existing code
            new Actions(driver)
                .keyDown(commandKey)
                .sendKeys("a")
                .keyUp(commandKey)
                .sendKeys(Keys.DELETE)
                .perform();
            String[] codeLines = code.split("\n");               

           for (String line : codeLines) {
                if (line.equalsIgnoreCase("\\b")) {
                    element.sendKeys(Keys.BACK_SPACE);  
                } else {
                    element.sendKeys(line);
                    element.sendKeys(Keys.RETURN);  
                }
            }
        } catch (Exception e) {
            System.err.println("Error while entering code: " + e.getMessage());
        }
    }
}
