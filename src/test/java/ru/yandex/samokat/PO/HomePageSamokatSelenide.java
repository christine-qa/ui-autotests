package ru.yandex.samokat.PO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class HomePageSamokatSelenide {

    // локаторы шапки страницы

    // локаторы для логотипа шапки

    // локатор для первой части лого - "Яндекс"
    @FindBy(how = How.CSS, using = "[alt='Yandex']")
    private SelenideElement YandexLogoIcon;

    // локатор для второй части лого - "Самокат"
    @FindBy(how = How.CSS, using = "[alt ='Scooter']")
    private SelenideElement SamokatLogoIcon;

    // локатор для третьей части лого - "Учебный тренажер"
    @FindBy(how = How.XPATH, using = ".//div[text()='Учебный тренажер']")
    private SelenideElement simulatorLogoIcon;


    // локаторы кнопок шапки

    // локатор кнопки "Заказать"
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g' and text()='Заказать']")
    private SelenideElement headerOrderButton;

    // локатор кнопки "Статус заказа"
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g']/button[text()='Статус заказа']")
    private SelenideElement headerStatusButton;

    // локатор для снэкбара про куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieText__1sbqp")
    private SelenideElement cookiesText;

    // локатор кнопки согласия на сбор куки
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookiesButton;



    // локаторы для заголовков


    // локатор первой строки заголовка
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']/text()[1]")
    private SelenideElement headerFirstString;

    // локатор второй строки заголовка
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']/text()[2]")
    private SelenideElement headerSecondString;


    // локатор первой строки подзаголовка №1
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E'][1]/text()[1]")
    private SelenideElement subHeaderOneFirstString;

    // локатор второй строки подзаголовка №1
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']/div[@class='Home_SubHeader__zwi_E'][1]/text()[2]")
    private SelenideElement subHeaderOneSecondString;

    // локатор подзаголовка №2
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Он лёгкий')]")
    private SelenideElement subHeaderTwoSecondString;

    // локатор изображения самоката
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Scooter__3YdJy']/img")
    private SelenideElement scooterImage;

    // локатор стрелки-подсказки
    @FindBy(how = How.CSS, using = ".Home_ArrowDown__fnDme")
    private SelenideElement arrowHint;

    // локатор параметра "Модель"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Модель')]")
    private SelenideElement modelParam;

    // локатор первого дивайдера в таблице параметров
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Separator__3cWAk'][1]")
    private SelenideElement firstTableSeparator;

    // локатор имени параметра "Максимальная скорость"
    @FindBy(how = How.XPATH, using = ".//div[text()='Максимальная скорость']")
    private SelenideElement maxSpeedParamName;

    // локатор значения параметра "Максимальная скорость"
    @FindBy(how = How.XPATH, using = ".//div[text()='40 км/ч']")
    private SelenideElement maxSpeedParamValue;

    // локатор имени параметра "Мощность заряда"
    @FindBy(how = How.XPATH, using = ".//div[text()='Проедет без подзарядки']")
    private SelenideElement chargingPowerParamName;


    // локатор значения параметра "Мощность заряда"
    @FindBy(how = How.XPATH, using = ".//div[text()='80 км']")
    private SelenideElement chargingPowerParamValue;

    // локатор имени параметра "Максимальный вес"
    @FindBy(how = How.XPATH, using = ".//div[text()='Выдерживает вес']")
    private SelenideElement maxWeightParamName;

    // локатор имени параметра "Максимальный вес"
    @FindBy(how = How.XPATH, using = ".//div[text()='120 кг']")
    private SelenideElement maxWeightParamValue;

    // локатор второго дивайдера в таблице параметров
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Separator__3cWAk'][2]")
    private SelenideElement secondTableSeparator;


    // локаторы Роадмапа "как это работает"

    // локатор заголовка в разделе "Как это работает"
    @FindBy(how = How.XPATH, using = ".//div[text()='Как это работает']")
    private SelenideElement howItWorksHeader;


    // локаторы 1 шага роадмапа

    // локатор иконки с номером шага 1
    @FindBy(how = How.XPATH, using = ".//div[text()='1']")
    private SelenideElement stepOneCircle;

    // локатор заголовка первого шага
    @FindBy(how = How.XPATH, using = ".//div[text()='Заказываете самокат']")
    private SelenideElement stepOneHeader;

    // локатор описания первого шага
    @FindBy(how = How.XPATH, using = ".//div[contains(text(), 'Выбираете')]")
    private SelenideElement stepOneDescription;


    // локаторы 2 шага роадмапа

    // локатор иконки с номером шага 2
    @FindBy(how = How.XPATH, using = ".//div[text()='2']")
    private SelenideElement stepTwoCircle;

    // локатор заголовка второго шага
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер привозит самокат']")
    private SelenideElement stepTwoHeader;

    // локатор описания второго шага
    @FindBy(how = How.XPATH, using = ".//div[contains(text(), 'А вы')]")
    private SelenideElement stepTwoDescription;


    // локаторы 3 шага роадмапа

    // локатор иконки с номером шага 3
    @FindBy(how = How.XPATH, using = ".//div[text()='3']")
    private SelenideElement stepThreeCircle;

    // локатор заголовка третьего шага
    @FindBy(how = How.XPATH, using = ".//div[text()='Катаетесь']")
    private SelenideElement stepThreeHeader;

    // локатор описания третьего шага
    @FindBy(how = How.XPATH, using = ".//div[contains(text(), 'Сколько часов')]")
    private SelenideElement stepThreeDescription;


    // локаторы 4 шага роадмапа

    // локатор иконки с номером шага 4
    @FindBy(how = How.XPATH, using = ".//div[text()='4']")
    private SelenideElement stepFourCircle;

    // локатор заголовка четвертого шага
    @FindBy(how = How.XPATH, using = ".//div[text()='Курьер забирает самокат']")
    private SelenideElement stepFourHeader;

    // локатор описания четвертого шага
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_StatusInfo__HrjoZ']/" +
            "div[@class='Home_StatusDescription__3WGl5' " +
            "and text()='Когда аренда ' " +
            "and  text()='заканчивается']")
    private SelenideElement stepFourDescription;


    // локатор кнопки заказать внизу страницы
    @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
    private SelenideElement bottomOrderButton;


    // локаторы раздела FQA

    // локатор заголовка раздела
    @FindBy(how = How.XPATH, using = ".//div[text()='Вопросы о важном']")
    private SelenideElement FQAHeader;

    // локатор 1 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-0']")
    private SelenideElement questionOne;

    // локатор ответа на 1 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-0'] p")
    private SelenideElement answerOne;

    // локатор 2 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-1']")
    private SelenideElement questionTwo;

    // локатор ответа на 2 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-1'] p")
    private SelenideElement answerTwo;

    // локатор 3 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-2']")
    private SelenideElement questionThree;

    // локатор ответа на 3 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-2'] p")
    private SelenideElement answerThree;

    // локатор 4 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-3']")
    private SelenideElement questionFour;

    // локатор ответа на 4 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-3'] p")
    private SelenideElement answerFour;

    // локатор 5 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-4']")
    private SelenideElement questionFive;

    // локатор ответа на 5 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-4'] p")
    private SelenideElement answerFive;

    // локатор 6 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-5']")
    private SelenideElement questionSix;

    // локатор ответа на 6 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-5'] p")
    private SelenideElement answerSix;

    // локатор 7 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-6']")
    private SelenideElement questionSeven;

    // локатор ответа на 7 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-6'] p")
    private SelenideElement answerSeven;

    // локатор 8 вопроса
    @FindBy(how = How.CSS, using = ".accordion__button[id='accordion__heading-7']")
    private SelenideElement questionEight;

    // локатор ответа на 8 вопрос
    @FindBy(how = How.CSS, using = ".accordion__panel[id='accordion__panel-7'] p")
    private SelenideElement answerEight;

    public void acceptCookiesClick() {
        cookiesButton.click();
    }

    public void openDropDownList1() {
        questionOne.click();
    }

    public void scrollToFQA () {
        $(FQAHeader).scrollIntoView(true);
    }

    public void FQAFirstQuestionClick() {
        questionOne.click();
    }

    public String getAnswerOneText() {
        return answerOne.getText();
    }

    public void FQASecondQuestionClick() {
        questionTwo.click();
    }

    public String getAnswerTwoText() {
        return answerTwo.getText();
    }


    public void FQAThirdQuestionClick() {
        questionThree.click();
    }

    public String getAnswerThreeText() {
        return answerThree.getText();
    }

    public void FQAFourQuestionClick() {
        questionFour.click();
    }

    public String getAnswerFourText() {
        return answerFour.getText();
    }


    public void FQAFiveQuestionClick() {
        questionFive.click();
    }

    public String getAnswerFiveText() {
        return answerFive.getText();
    }

    public void FQASixQuestionClick() {
        questionSix.click();
    }

    public String getAnswerSixText() {
        return answerSix.getText();
    }


    public void FQASevenQuestionClick() {
        questionSeven.click();
    }

    public String getAnswerSevenText() {
        return answerSeven.getText();
    }

    public void FQAEightQuestionClick() {
        questionEight.click();
    }

    public String getAnswerEightText() {
        return answerEight.getText();
    }

    public OrderPageSamokatSelenide orderButtonHeaderClick() {
        headerOrderButton.click();
        OrderPageSamokatSelenide orderPage = page(OrderPageSamokatSelenide.class);
        orderPage.waitForLoadOrderPage();
        return orderPage;
    }

    public OrderPageSamokatSelenide orderButtonBottomClick() {
        bottomOrderButton.click();
        OrderPageSamokatSelenide orderPage = page(OrderPageSamokatSelenide.class);
        orderPage.waitForLoadOrderPage();
        return orderPage;
    }


}


