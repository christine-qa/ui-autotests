package ru.yandex.samokat.PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPageSamokatSelenide {

    // Заголовок формы
    @FindBy(how = How.CLASS_NAME, using = "Order_Header__BZXOb")
    private SelenideElement formHeader;

    // Поле ввода имени
    @FindBy(how = How.CSS, using = "[placeholder='* Имя']")
    private SelenideElement nameField;

    // Поле ввода фамилии
    @FindBy(how = How.CSS, using = "[placeholder='* Фамилия']")
    private SelenideElement surnameField;

    // Поле ввода адреса
    @FindBy(how = How.CSS, using = "[placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressField;

    // Поле ввода метро
    @FindBy(how = How.CSS, using = "[placeholder='* Станция метро']")
    private SelenideElement metroField;

    // Станция метро
    @FindBy(how = How.XPATH, using = ".//div[text()='Сокольники']")
    private SelenideElement metroStation;

    // Поле ввода адреса
    @FindBy(how = How.CSS, using = "[placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneField;

    // Кнопка "Далее"
    @FindBy(how = How.XPATH, using = ".//button[text()='Далее']")
    private SelenideElement nextButton;

    // Поле даты доставки самоката
    @FindBy(how = How.CSS, using = "[placeholder='* Когда привезти самокат']")
    private SelenideElement deliveryDateField;


    // Дата доставки в календаре
    @FindBy(how = How.CSS, using = "[aria-label = 'Choose воскресенье, 29-е мая 2022 г.']")
    private SelenideElement calendarDeliveryDate;


    // Поле ввода "Срок аренды самоката"
    @FindBy(how = How.CLASS_NAME, using = "Dropdown-placeholder")
    private SelenideElement rentalTime;

    @FindBy(how = How.XPATH, using = ".//div[text()='пятеро суток']")
    private SelenideElement rentalOption;

    // Чек-бокс выбора цвета "Серый"
    @FindBy(how = How.CSS, using = "[for='grey']")
    private SelenideElement greyColor;


    // Поле ввода комментария
    @FindBy(how = How.CSS, using = "[placeholder='Комментарий для курьера']")
    private SelenideElement commentField;


    // Кнопка "Заказать" под формой заказа

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderButton;

    // Заголовок окна подтверждения заказа
    @FindBy(how = How.XPATH, using = ".//div[text()='Хотите оформить заказ?']")
    private SelenideElement confirmWindowHeader;

    // Кнопка "Да"
    @FindBy(how = How.XPATH, using = ".//button[text()='Да']")
    private SelenideElement confirmButton;

    // Заголовок успешного оформления заказа

    @FindBy(how = How.XPATH, using = ".//div[text()='Заказ оформлен']")
    private SelenideElement successWindowHeader;

    public void setName(String name) {
        nameField.setValue(name);
    }

    public void setSurname(String surname) {
        surnameField.setValue(surname);
    }

    public void setAddress(String address) {
        addressField.setValue(address);
    }

    public void setMetro() {
        metroField.click();
        metroStation.click();
    }

    public void setPhone(String phone){
        phoneField.setValue(phone);
    }


    public void setDeliveryTime() {
        deliveryDateField.click();
        calendarDeliveryDate.click();
    }

    public void setRentalTime() {
        rentalTime.click();
        rentalOption.click();
    }

    public void colorClick() {
        greyColor.click();
    }

    public void setCommentFieldValue(String comment) {
        commentField.setValue(comment);
    }

    public void forWhomForm(String name, String surname, String address, String phone) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setMetro();
        setPhone(phone);
        nextButton.click();
    }

    public void getConfirmWindowHeader() {
        confirmWindowHeader.shouldBe(Condition.visible);
    }


    public void orderButtonClick() {
        orderButton.click();
    }

    public void confirmButtonClick() {
        confirmButton.click();
    }

    public void getSuccessWindow() {
        successWindowHeader.shouldBe(Condition.visible);
    }

    public void waitForLoadOrderPage() {
        formHeader.shouldBe(Condition.visible);
    }
}

