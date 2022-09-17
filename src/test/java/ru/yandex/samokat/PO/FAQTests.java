package ru.yandex.samokat.PO;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;



public class FAQTests {

    HomePageSamokatSelenide homepage;

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        homepage = open("https://qa-scooter.praktikum-services.ru/",
                HomePageSamokatSelenide.class);
        homepage.acceptCookiesClick();
        homepage.scrollToFQA();


    }

    @Test
    public void testCheckFirstQuestion() {

        homepage.FQAFirstQuestionClick();
        String expectedAnswer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualAnswer1 = homepage.getAnswerOneText();
        Assert.assertEquals(expectedAnswer1, actualAnswer1);
    }

    @Test
    public void testCheckSecondQuestion() {
        homepage.FQASecondQuestionClick();
        String expectedAnswer2 = "Пока что у нас так: один заказ — один самокат. " +
                "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualAnswer2 = homepage.getAnswerTwoText();
        Assert.assertEquals(expectedAnswer2, actualAnswer2);
    }

    @Test
    public void testCheckThirdQuestion() {

        homepage.FQAThirdQuestionClick();
        String expectedAnswer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. " +
                "Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

        String actualAnswer3 = homepage.getAnswerThreeText();
        Assert.assertEquals(expectedAnswer3, actualAnswer3);
    }

    @Test
    public void testCheckFourQuestion() {

        homepage.FQAFourQuestionClick();
        String expectedAnswer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualAnswer4 = homepage.getAnswerFourText();
        Assert.assertEquals(expectedAnswer4, actualAnswer4);
    }

    @Test
    public void testCheckFiveQuestion() {

        homepage.FQAFiveQuestionClick();
        String expectedAnswer5 = "Пока что нет! " +
                "Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

        String actualAnswer5 = homepage.getAnswerFiveText();
        Assert.assertEquals(expectedAnswer5, actualAnswer5);
    }

    @Test
    public void testCheckSixQuestion() {

        homepage.FQASixQuestionClick();
        String expectedAnswer6 = "Самокат приезжает к вам с полной зарядкой. " +
                "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                "Зарядка не понадобится.";

        String actualAnswer6 = homepage.getAnswerSixText();
        Assert.assertEquals(expectedAnswer6, actualAnswer6);
    }

    @Test
    public void testCheckSevenQuestion() {

        homepage.FQASevenQuestionClick();
        String expectedAnswer7 = "Да, пока самокат не привезли. Штрафа не будет, " +
                "объяснительной записки тоже не попросим. Все же свои.";
        String actualAnswer7 = homepage.getAnswerSevenText();
        Assert.assertEquals(expectedAnswer7, actualAnswer7);
    }

    @Test
    public void testCheckEightQuestion() {

        homepage.FQAEightQuestionClick();
        String expectedAnswer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualAnswer8 = homepage.getAnswerEightText();
        Assert.assertEquals(expectedAnswer8, actualAnswer8);
    }

    @After
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
