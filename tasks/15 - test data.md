# Implementing data provider and using test data

One final thing we need to do is to make convenient way of using test data in our tests.

For our purpose we will store our test data as .json files in resources folder.

In create account tests we have a lot of hardcoded values that we input into create account form, our goal is to put them all in .json file and serialize them using gson.

You can reuse DataProvider class from JSON Manipulation task that uses gson to serialize json into map of objects.

Create Account.class data transfer object as you did in JSON Manipulation task Create accounts.json file in resources folder and fill it with several objects with all relevant fields that are used for creating new account.

Since all your test classes extend BaseTest class most convenient way to initialize data provider is in this class - since all tests have access to this class protected methods.

So far we used before test and after test annotations in BaseTest, it will be more efficient to initialize data provider only once at the beginning of test run - not before every separate test - find proper JUnit annotation and implement it.

Google a little bit about using test data in Junit tests and refactor create account test to use form input data from DataProvider.


# Реализация data provider и использование тестовых данных

И последнее, что нам нужно сделать, это создать удобный способ использования тестовых данных в наших тестах.

Для наших целей мы будем хранить наши тестовые данные в виде файлов .json в папке ресурсов.

В тестах создания учетной записи у нас есть много заданных значений, которые мы вводим в форму создания учетной записи, наша цель — 
поместить их все в файл .json и сериализовать их с помощью gson.

Вы можете использовать класс DataProvider, который использует gson для сериализации json в карту объектов.

Создайте объект передачи данных Account.class. Создайте файл account.json в папке ресурсов и заполните его несколькими объектами со всеми соответствующими полями, которые используются для создания новой учетной записи.

Поскольку все ваши тестовые классы расширяют класс BaseTest, наиболее удобный способ инициализации data provider находится в этом классе, поскольку все тесты имеют доступ к защищенным методам этого класса.

До сих пор мы использовали аннотации before after в BaseTes: будет более эффективно инициализировать поставщик данных только один 
раз в начале тестового прогона, а не перед каждым отдельным тестом — найдите подходящую аннотацию JUnit и реализуйте ее.

Попробуйте реализовать с помощью интернета применение DataProvider'а в ваших тестах по созданию пользователя