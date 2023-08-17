# Create user account tests

Create new CreateAccountTest.class file in test.java and implement test:

Create valid account:

* Open homepage
* Accept privacy setting if displayed
* Click on account icon on header
* Click create account
* Enter valid credentials
* Verify user is created - user is logged in and user name is displayed on account sidebar

You will need to add several more page objects with their elements.

NOTE 1: For step 5 you need to generate unique email for each scenario. Create RandomUtils.class in project path src.main.java.utils and there implement static method `String generateRandomEmail(String domain)`, where domain will be domain that comes after @ character.

NOTE 2: Use hardcoded values in steps that fill input fields.

NOTE 3: Implement in this class also before and after steps for opening and closing browser.


# Создать тесты для системы лояльности

Создайте новый файл CreateAccountTest.class в test.java и выполните тест:

Создайте действующую учетную запись:

* Открыть домашнюю страницу
* Принять настройки конфиденциальности, если они отображаются
* Нажмите на значок учетной записи в заголовке
* Нажмите создать учетную запись
* Введите действительные учетные данные
* Убедитесь, что пользователь создан — пользователь вошел в систему, и имя пользователя отображается на боковой панели учетной записи.

Вам нужно будет добавить еще несколько объектов страницы со своими элементами.

ПРИМЕЧАНИЕ 1. Для шага 5 вам необходимо создать уникальный email для каждого сценария. Создайте RandomUtils.class в src.main.java.utils и 
реализуйте статический метод String generateRandomEmail (String domain) , где domain будет доменом, который идет после символа @.

ПРИМЕЧАНИЕ 2. Используйте свои заданные значения в шагах заполнения полей ввода.

ПРИМЕЧАНИЕ 3: Реализуйте в этом классе также before and after steps открытия и закрытия браузера.