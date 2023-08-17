# Create test steps

One of important things to keep in mind when creating automated tests and developing testing frameworks is to keep modeled pages of application under test and test steps separate - to increase code scalability maintainability and readability.

So every set of steps step you will create you will put in corresponding test step class - since here we will take actions only on homepage and performing search, you should first create OpenPageSteps.class - Steps related to opening pages, HomePageSteps.class - Steps related to homepage actions, SearchSteps.class - Steps related to search functionality - on site sidebar, SearchResultsPageSteps.class - Steps that take place on page where search results are displayed, put it in: main.java.steps package.

To make our final tests more readable we will use simplified "builder" pattern - every public method of steps class will return this (Instance of this class) - therefore we will be able to "chain" step calls in our tests - It will be more clear soon.

In OpenPageSteps.class implementation will look something like this:

```java
private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

private HomePage homePage() { return pageFactory.on(HomePage.class); } // use .on method of MyPageFactoryProvider

public HomePageSteps openHomepage() {
    homePage().open(/* Use homepage value from .properties file */);
    return new HomePageSteps(); // since homepage is opened after opening page, openHomepage() will give you access to HomePageSteps }
```

In HomePageSteps.class you should have:

```java
private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

private HomePage homePage() { return pageFactory.on(HomePage.class); }

public HomePageSteps acceptPrivacyModal() {
    homePage().acceptPrivacyButton().waitUntil(displayed()).click()
    return this;
}
```

So `acceptPrivacyModal()` step waits for acceptPrivacyButton to be displayed and clicks it - first thing you need to do when homepage is opened - such convenient way of writing your steps is coming from html elements dependency.

Following pattern from above implement `clickSearchButton()` step - Note when you click search button you should perform actions on search.

In SearchSteps.class implement methods:

* `inputSearchTerm(String term)` - HINT: Use sendKeys method from html elements.
* `clickSearchIcon()`

When you have performed search using product ID you are presented with search results page. Here you need to verify that only one product is present - use JUnit assertions you have already encountered them in Unit testing part. Step method should have signature:

`public SearchSteps verifyNumberOfProductIsDisplayed(int numProducts);`

# Создаем тестовые степы

Одна из важных вещей, о которой следует помнить при создании автоматизированных тестов и разработке фреймворков тестирования: необходимо 
разделять смоделированные страницы тестируемого приложения и шаги тестов, чтобы повысить масштабируемость кода, удобство 
сопровождения и читаемость.

Таким образом, каждый набор степов, который вы создадите, вы поместите в соответствующий класс тестовых степов. Например потому что в 
данном контексте мы будем выполнять действия только на домашней странице и выполнять поиск на ней же - поэтому Вы должны сначала создать 
- OpenPageSteps.class - в нем будут шаги связанные с открытием страниц, 
- HomePageSteps.class - Шаги связанные с действиями на главной странице, 
- SearchSteps.class — шаги, связанные с функциями поиска — на боковой панели сайта, 
- SearchResultsPageSteps.class — шаги, которые выполняются на странице результатов поиска.
Поместите все вышеуказанные классы в пакет main.java.steps.

Чтобы сделать наши тесты более читабельными, мы будем использовать упрощенный паттерн «builder» — каждый общедоступный метод класса шагов 
будет возвращать this (экземпляр этого класса) — поэтому мы сможем «цеплять» вызовы шагов в наших тестах — это будет пояснено ниже.

В OpenPageSteps.class реализация будет выглядеть примерно так:

```java
private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

private HomePage homePage() { return pageFactory.on(HomePage.class); } //используем метод .on MyPageFactoryProvider

public HomePageSteps openHomepage() {
        homePage().open(/* Использовать значение главной страницы из файла .properties */);
        return new HomePageSteps(); //так как домашняя страница открывается после открытия страницы, openHomepage() предоставит вам 
        //доступ к HomePageSteps
}
```

В HomePageSteps.class у вас должно быть:

```java
private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

private HomePage homePage() { return pageFactory.on(HomePage.class); }

public HomePageSteps acceptPrivacyModal() {
        homePage().acceptPrivacyButton().waitUntil(displayed()).click()
        return this;
        }
```

Таким образом, шаг `acceptPrivacyModal()` ожидает отображения acceptPrivacyButton и щелкает по нему — первое, что вам нужно сделать, когда 
открыта домашняя страница. Такой удобный способ исходит из депенденси html-elements.

По заданному шаблону реализуйте метод `clickSearchButton()`. Учтите, что это - действие, осуществляемое со страницей поиска, а поэтому 
должно быть имплементировано в соответствующем странице классе

В SearchSteps.class реализуйте методы:

* `inputSearchTerm(String term)` - ПОДСКАЗКА: используйте метод sendKeys из html-элементов. Метод должен осуществлять ввод текста в поле 
  поиска
* `clickSearchIcon()` - Нажатие на иконку лупы

Когда вы выполнили поиск с использованием идентификатора продукта, вам будет представлена страница результатов поиска. Здесь вам нужно 
убедиться, что присутствует только один продукт — используйте assertions JUnit, с которыми вы уже сталкивались в части модульного 
тестирования. Метод для этого теста должен иметь сигнатуру:

`public SearchSteps verifyNumberOfProductIsDisplayed (int numProducts);`