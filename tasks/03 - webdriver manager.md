# Integrate WebDriverManager from bonigarcia dependency in WebDriverProvider class

As mentioned in previous assignments use bonigarcia WebDriverManager to pull your WebDriver dynamically in your Сhrome and Firefox classes.

Create a WebDriverFactory class in the same package as the browser classes and create an initialize(String typeOfBrowser, String version) method in it,
which will initialize the given browser with the required parameters

See [WebDriverManager](https://github.com/bonigarcia/webdrivermanager/blob/master/README.md) documentation.


# Интеграция WebDriverManager из зависимости bonigarcia в класс WebDriverProvider

Как упоминалось в предыдущих заданиях, используйте bonigarcia WebDriverManager для динамического извлечения WebDriver в классе каждого 
браузера.

Реализуйте класс WebDriverFactory в одном пакете с классами браузеров и создайте в нем метод initialize(String typeOfBrowser, String 
version),
который будет инициализировать заданный браузер с необходимыми параметрами

См. документацию [WebDriverManager](https://github.com/bonigarcia/webdrivermanager/blob/master/README.md).

Напишите тесты, которые будут открывать браузер(опционально разные браузеры) с разными заданными параметрами