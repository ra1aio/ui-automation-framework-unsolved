# WebDriverFactory.class realisation

1. Create a WebDriverFactory class in the same package as Chrome and Firefox files

2. Create the following public methods in it:
   * `initialize(String typeOfBrowser, String version)`
   * `end()`
   * `getDriver()`
3. Move the implementation of the initialize method and others from the Chrome and Firefox classes - only now the initialize method will return
   required browser type depending on typeOfBrowser input parameter

Write tests that will open a browser (optionally different browsers) with different parameters given

# Create an implementation of WebDriverFactoryProvider.class

Here you will get acquainted with the Singletone pattern - it allows you to operate on one entity of an object, not allowing to produce many of them -
read about it on the Internet or [here] (https://habr.com/ru/articles/27108/)

1. Create a class in the same package and name it WebDriverFactoryProvider (the class will be static)
2. Create a private static WebDriverFactory INSTANCE field in the class; and public static WebDriverFactory getInstance() method
3. Implement the return of the WebDriverFactory instance as a singleton pattern


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