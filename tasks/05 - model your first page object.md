# Model your first page objects

For testing purposes we will use www.ae.com site. Create HomePage, SearchSidebar and SearchResultsPage interfaces in main.java.htmlelements.pages package.

For identifying elements on page under test we will use XPath - Read this [XPath Tutorial](https://www.w3schools.com/xml/xpath_intro.asp) and/or play [Dinner locator game](https://topswagcode.com/xpath/).

You should follow following pattern in your page interfaces:

* HomePage (And every new page you will create) should extend ExtendedWebPage

* Every element from this page should be defined in the following way, see concrete example:

```java
    @FindBy(xpath = "//input[@type='email']")
    MyWebElement usernameInput;
```

* Go to www.ae.com, when homepage is opened, extract xpath from privacy settings modal (first modal opened) and account icon on header menu following example from above - NOTE: Since privacy settings is UI modal, it would be great to create new interface PrivacySettingsModal and here map "Accept" button (It is first thing you need to do when you open homepage of ae.com - accept privacy settings)

* Now do the same for search header button and cart icon

* When you click search button, search sidebar will open, map search input field and search button in SearchSidebar

* Enter valid product ID in search field - use 0119_5091_851

* SearchResultsPage is opened, map returned product in related interface - Use List structure as element type - since on search results page there can be multiple products returned.


# Смоделируйте объекты первой страницы

В целях тестирования мы будем использовать сайт https://www.ae.com/us/en (Или любой другой на ваше усмотрение - лучше всего подойдет 
какой-то онлайн-магазин). Создайте интерфейсы HomePage, SearchSidebar и SearchResultsPage в пакете main.java.htmlelements.pages. (В случае с 
выбором Вашего сайта смоделируйте классы для главной страницы, страницы поиска и страницы с результатами поиска)

Для идентификации элементов на тестируемой странице мы будем использовать XPath. Прочтите это [Учебное пособие по XPath] (https://www.w3schools.com/xml/xpath_intro.asp) и/или сыграйте в [Dinner locator game] (https://topswagcode.com/xpath/).

Вы должны следовать следующему шаблону в интерфейсах вашей страницы:

* Домашняя страница (и каждая новая страница, которую вы создадите) должна наследовать ExtendedWebPage.

* Каждый элемент с этой страницы должен быть определен следующим образом, см. конкретный пример(использовать FindBy из библиотеки 
  селениум - не htmlElements):

```java
     @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
     public WebElement acceptButton;
```

Рекомендуемые шаги:
* Перейдите на www.ae.com, когда домашняя страница открыта, извлеките xpath из модального окна настроек куки (первое открытое модальное 
  окно) и значок учетной записи в меню заголовка(верхняя часть страницы). ПРИМЕЧАНИЕ. Поскольку настройки 
  конфиденциальности являются модальными пользовательского интерфейса, было бы здорово создать новый интерфейс PrivacySettingsModal и здесь 
  сделайте элемент кнопки «Принять» (это первое, что вам нужно сделать, когда вы открываете домашнюю страницу ae.com — принять настройки 
  конфиденциальности)

* Теперь сделайте то же самое для кнопки поиска и значка корзины.

* Когда вы нажимаете кнопку поиска, открывается боковая панель поиска, отображается поле ввода поиска и кнопка поиска в SearchSidebar

* Введите действительный идентификатор продукта в поле поиска(артикул продукта) - пример 0115-6282

* Когда страница SearchResultsPage открыта, сопоставьте возвращенный продукт в соответствующем интерфейсе - Используйте список в качестве 
  типа элемента, поскольку на странице результатов поиска может быть возвращено несколько продуктов по заданному параметру.