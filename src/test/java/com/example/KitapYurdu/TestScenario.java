package com.example.KitapYurdu;
import com.codeborne.selenide.Selectors;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.Assert;
import java.io.IOException;



public class TestScenario extends Methods {

    @Test
    public void TestScenario() throws CsvValidationException, IOException, InterruptedException {
        isElementExist(By.className("content-home"));
        DataReadFromCsv("search-input");
        RandomItem();
        clickBy(By.id("button-cart"));
        clickBy(By.id("cart"));
        clickBy(By.id("js-cart"));
        SelectQuantity();
        clickBy(By.cssSelector("i[title='Güncelle']"));
        isElementExist(By.className("swal2-header"));
        Thread.sleep(1000);
        clickBy(By.className("red-icon"));
        isElementExist(By.xpath("//*[@class=\"button\"]"));
    }
}
