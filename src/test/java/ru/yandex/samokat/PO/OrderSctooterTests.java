package ru.yandex.samokat.PO;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import com.codeborne.selenide.Configuration;
//import com.codeborne.selenide.WebDriverRunner;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class OrderSctooterTests {

    HomePageSamokatSelenide homepage;

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        homepage = open("https://qa-scooter.praktikum-services.ru/",
                HomePageSamokatSelenide.class);

    }

    @Test
    public void orderFromHeader() {
        OrderPageSamokatSelenide orderPage = homepage.orderButtonHeaderClick();
        orderPage.forWhomForm(
                "Алиса",
                "Кислова",
                "Петухова, 33",
                "89123456789");
        orderPage.setDeliveryTime();
        orderPage.setRentalTime();
        orderPage.colorClick();
        orderPage.setCommentFieldValue("Не звонить");
        orderPage.orderButtonClick();
        orderPage.getConfirmWindowHeader();
        orderPage.confirmButtonClick();
        orderPage.getSuccessWindow();
    }

    @Test
    public void orderFromButton() {
        homepage.acceptCookiesClick();
        OrderPageSamokatSelenide orderPage = homepage.orderButtonBottomClick();
        orderPage.forWhomForm(
                "Артамон",
                "Петров",
                "Линейная, 11",
                "87654321908");
        orderPage.setDeliveryTime();
        orderPage.setRentalTime();
        orderPage.colorClick();
        orderPage.setCommentFieldValue("Уходите");
        orderPage.orderButtonClick();
        orderPage.getConfirmWindowHeader();
        orderPage.confirmButtonClick();
        orderPage.getSuccessWindow();
    }

    @After
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }


}
