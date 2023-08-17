# Create test class with first test

Your tests should be present in test.java package. First test you will write is related to testing www.ae.com search functionality. Therefore name your test class: SearchTest.java

Here we will use JUnit testing framework which you already had opportunity to use in Unit testing part.

Basically here you will see advantages of using simplified "builder" pattern in implementing our test steps.

Your first test method implementation should look like this:

```java
new OpenPagesSteps()
    .openHomepage()
    .acceptPrivacyModal()
    .clickSearchButton()
    .inputSearchTerm("0119_5091_851")
    .clickSearchIcon()
    .verifyNumberOfProductIsDisplayed(1)
```

Use JUnit annotations to create your first test. Also notice that selenium web driver instance is getting passed to page objects in method `getDriver()` from MyPageFactory.class - Your TODO assignment asked you to use `WebDriverFactory.get()` method, it will return null to you because you have never actually called `initialize()` method. So other then using `@test` annotation in your test class you need to implement so called precondition and postcondition actions - see [@Before vs @BeforeClass vs @BeforeEach vs @BeforeAll](https://www.baeldung.com/junit-before-beforeclass-beforeeach-beforeall). What we want to achieve is that before every test we call WebDriverFactory `initialize()` method - that will open fresh session of browser and after every test we will call WebDriverFactory `end()` method - that will close browser window. Implement it.

Run this test using maven run command - `mvn test`
Make sure that test is stable.

# Создаем тестовый класс с первым тестом

Ваши тесты должны быть написаны в пакете test.java. Первый тест, который вы напишете, связан с тестированием функциональности поиска на 
www.ae.com. Поэтому назовите свой тестовый класс: SearchTest.java

Здесь мы будем использовать тест-раннер JUnit.

В основном здесь вы научитесь работе с паттерном «builder» при реализации наших тестовых степов.

Ваша первая реализация тестового метода должна выглядеть так:

```java
new OpenPagesSteps()
        .openHomepage()
        .acceptPrivacyModal()
        .clickSearchButton()
        .inputSearchTerm("0119_5091_851")
        .clickSearchIcon()
        .verifyNumberOfProductIsDisplayed(1)
```

Используйте аннотации JUnit, чтобы создать свой первый тест. Также обратите внимание, что экземпляр веб-драйвера selenium передается объектам страницы в методе `getDriver()` из MyPageFactory.class.
Одно из TODO попросило вас использовать метод `WebDriverFactory.get()`, однако он вернул вам значение null, потому что Вы не вызывали 
метод `initialize()`. Таким образом, кроме использования аннотации `@Test` в вашем тестовом классе вам необходимо реализовать так 
называемые precondition and postcondition actions - см. [@Before vs @BeforeClass vs @BeforeEach vs @BeforeAll](https://www.baeldung.com/junit -до-докласса-докаждого-прежде). 
Чего мы хотим добиться, так это того, что перед каждым тестом мы вызываем метод WebDriverFactory `initialize()`, 
который будет открывать новую сессию браузера, и после каждого теста мы будем вызывать метод `end()` WebDriverFactory, который закроет окно браузера. 
Реализуйте это.

Запустите этот тест, используя команду запуска maven — `mvn test` или же средва запуска IntelliJ IDEA
Убедитесь, что тест стабилен.