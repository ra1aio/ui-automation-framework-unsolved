# Integrate WebDriverManager from bonigarcia dependency in WebDriverProvider class

As mentioned in previous assignments use bonigarcia WebDriverManager to pull your WebDriver dynamically in your Сhrome and Firefox classes.

Create a WebDriverFactory class in the same package as the browser classes and create an initialize(String typeOfBrowser, String version) method in it,
which will initialize the given browser with the required parameters

See [WebDriverManager](https://github.com/bonigarcia/webdrivermanager/blob/master/README.md) documentation.


# Создать реализацию WebDriverFactory.class

1. Создайте класс WebDriverFactory в одном пакете с файлами Chrome и Firefox 

2. Создайте в нем следующие public методы:
   * `initialize(String typeOfBrowser, String version)`
   * `end()`
   * `getDriver()`
3. Перенесите реализацию метода initialize и остальных из классов Chrome и Firefox - только тепрерь метод initialize будет возвращать 
   необходимый тип браузера в зависимости от входного параметра typeOfBrowser

Напишите тесты, которые будут открывать браузер(опционально разные браузеры) с разными заданными параметрами

# Создать реализацию WebDriverFactoryProvider.class

Здесь вы познакомитесь с паттерном Singletone - он позволяет оперировать одной сущностью объекта, не позволяя плодить их множество - 
почитайте про него в интернете или [здесь](https://habr.com/ru/articles/27108/)

1. Создайте класс в том же пакете и назовите его WebDriverFactoryProvider (класс будет статическим)
2. Создайте в классе поле private static WebDriverFactory INSTANCE; и метод public static WebDriverFactory getInstance()
3. Релизуйте возвращение инстанса WebDriverFactory в формате паттерна синглтон