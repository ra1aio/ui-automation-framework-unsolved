# Login tests

Following pattern from before, automate several more tests in LoginTest.java class in java.test:

For debugging purposes run each test independently.

## Negative test

Test: Empty email and password input

* Open homepage and close accept privacy settings modal
* Click on account icon in ae.com header
* Wait for account side tray to open
* On account side tray click sign in button
* When email and password input fields are displayed, leave them empty and click sign in button
* Verify proper error messages are displayed (Use JUnit assertions)

Figure out some more relevant negative scenarios and automate them.

## Positive test

Test: Valid email and password input

Prerequisite: Create manually one account and remember username and password

* Open homepage and close accept privacy settings modal
* Click on account icon in ae.com header
* Wait for account side tray to open
* On account side tray click sign in button
* When email and password input fields are displayed, enter valid credentials and click sign in button
* Verify that user is logged in - e.g. Sign out button is now displayed and user's name is displayed on top of account side tray (Use JUnit assertions)

You will need to add several more page objects with their elements. Add in this test class before and after methods with appropriate annotations for opening and closing browser before and after each test.


# Тесты логина

Следуя предыдущему шаблону, автоматизируйте еще несколько тестов в классе LoginTest.java в java.test:

В целях отладки запускайте каждый тест независимо друг от друга.

## Negative test

Тестируем что будет если поле пароля и логина оставить пустым

* Откройте домашнюю страницу и закройте модальное окно принятия настроек конфиденциальности.
* Нажмите на значок учетной записи в заголовке ae.com
* Подождите, пока откроется боковая панель учетной записи.
* На боковой панели учетной записи нажмите кнопку входа
* Когда отображаются поля ввода электронной почты и пароля, оставьте их пустыми и нажмите кнопку входа
* Убедитесь, что отображаются правильные сообщения об ошибках (используйте JUnit assertions)

Придумайте еще несколько релевантных негативных сценариев и автоматизируйте их.

## Positive test

Тестируем что будет если ввести верный пароль и логин

Предусловие: Создайте вручную одну учетную запись и запомните имя пользователя и пароль.

* Откройте домашнюю страницу и закройте модальное окно принятия настроек конфиденциальности.
* Нажмите на значок учетной записи в заголовке ae.com
* Подождите, пока откроется боковая панель учетной записи.
* На боковой панели учетной записи нажмите кнопку входа
* Когда отобразятся поля ввода электронной почты и пароля, введите действительные учетные данные и нажмите кнопку входа.
* Убедитесь, что пользователь вошел в систему - например. Кнопка выхода теперь отображается, а имя пользователя отображается в верхней 
  части боковой панели учетной записи (используйте JUnit assertions).

Вам нужно будет добавить еще несколько page object классов со своими элементами. 
Добавьте в этот тестовый класс @before и @after аннотации снова для получения инстанса веб-драйвера