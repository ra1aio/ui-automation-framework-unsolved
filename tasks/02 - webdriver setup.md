# Create WebDriverFactory.class implementation

Purpose of this class is to provide convenient methods for configurable WebDriver initialization.

* Create this class in new package called selenium in main.java folder
* Public Methods to be exposed:
  * `initialize()`
  * `end()`
  * `get()`

## Create Browser enum class in main.java.enums package - So far we will cover Chrome and Firefox

**`initialize()`** - Will initialize WebDriver instance according to browser (browser.name) that is set in runConfiguration.properties file. Probably it will have switch state according to chosen browser. Create two private methods that return WebDriver object - createChromeDriver() and createFirefoxDriver(). Inside these two methods you will instantiate for the beginning corresponding instances of ChromeDriver and FirefoxDriver.

NOTE: Here you will use **bonigarcia** dependency

If selenium version is stated run config file use this:

`ChromeDriverManager.chromedriver().version(Version from runConfiguration.properties file - selenium.version).setup();`

If selenium version is not stated run config file use this - latest selenium:

`ChromeDriverManager.chromedriver().setup();`

Also use values from runConfiguration.properties file browser.width and browser.height to open browser with given size.

Lines above are actually downloading .exe files for Selenium drivers dynamically.

**`end()`** - Will quit current instance of WebDriver - close browser

**`get()`** - Will simply return instance of WebDriver that is stored as private class variable.

NOTE: Add for now System.out.println("") lines of code on places where something crucial happens - e.g. driver successfully initialized (We will replace all of these with proper logging system later), put `//TODO: Change with log4j logger` comment.

Test your implementation in temporary main class: initialize() should open Chrome or Firefox browser according to values in properties file mentioned with browser size from file also.


# Создать реализацию WebDriverFactory.class

Цель этого класса — предоставить удобные методы для настраиваемой инициализации WebDriver.

* Создайте этот класс в новом пакете с именем selenium в папке main.java.
* Открытые общедоступные методы:
  * `инициализировать()`
  * `конец()`
  * `получить()`

## Создайте класс перечисления браузера в пакете main.java.enums. Пока мы рассмотрим Chrome и Firefox.

**`initialize()`** — инициализирует экземпляр WebDriver в соответствии с браузером (browser.name), который установлен в файле runConfiguration.properties. Создайте два приватных метода, которые возвращают объект WebDriver — createChromeDriver() и createFirefoxDriver(). Внутри этих двух методов вы создадите для начала соответствующие экземпляры ChromeDriver и FirefoxDriver.

ПРИМЕЧАНИЕ. Здесь вы будете использовать зависимость **bonigarcia**.

Если указана версия Selenium в файле конфигурации, используйте эту команду:

`ChromeDriverManager.chromedriver().version (версия из файла runConfiguration.properties - selenium.version).setup();`

Если не указана версия Selenium в файле конфигурации - пусть в методе будет это(будет взята последняя версия вебДрайвера):

`ChromeDriverManager.chromedriver().setup();`

Также используйте значения из файла runConfiguration.properties browser.width и browser.height, чтобы открыть браузер с заданным 
размером окна.

Строки выше фактически загружают файлы .exe для драйверов Selenium динамически.

Некоторые полезные методы:

**`end()`** - Выйти из текущего экземпляра WebDriver - закрыть браузер

**`get()`** — просто вернет экземпляр WebDriver, который хранится как частная переменная класса.

ПРИМЕЧАНИЕ. Пока что используйте System.out.println("") в местах, где происходит что-то важное, например, 'Драйвер успешно 
инициализирован' (позже мы заменим все это системой логирования), и поместите комментарий после строки с выводом текста `//TODO: Change 
with log4j logger`.

Протестируйте свою реализацию во временном основном классе: initialize() должен открывать браузер Chrome или Firefox в соответствии со 
значениями в файле свойств: размером браузера.