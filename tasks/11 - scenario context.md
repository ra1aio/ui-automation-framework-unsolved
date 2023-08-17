# Implement ScenarioContext class

In create account test you are creating new random email using generate random email utility class. Every time you call this method you will get new random email, therefore for creating e.g. test that creates new account with random email and then you want to use this email for logging in into this account you need to save this email address in order to reuse it in following steps of this long scenario.

This is simple example for data we need to share between scenario steps, usually when tests become complicated and long we want to share a lot of data between steps.

For this purpose we need ScenarioContext.class, it should have private class variable as HasMap<String, Object> type that will store values.

Implement this class in java.main package with following methods:

* Make constructor private, and create this class as singleton - `public ScenarioContext getInstance()` - Will return instance of context.

* Initialize empty class variable HashMap as static block.

* `public T get(String key, Class clazz)` - This method should return T type object from internal HashMap with key

* `public void put(String key, Object value)` - This method will save in internal HashMap context Object as key

* `public void remove(String key)` - Will remove key object in internal HashMap

* `public void removeAll()` - Will erase all data in internal HashMap - usually this will be called when test is completed.

Since context is used in one test run to share data between steps, you want to erase all data when test is completed and initialize context before first scenario is run - implement in appropriate before and after steps this functionality.

For testing purposes, create following scenario:

* Reuse steps for creating new account, put email in context (Put some other data in context if you think it is appropriate)
* Logout after account is created
* Log back in with data from step one - use data from context to login
* Verify user is logged in with proper account

HINT: When putting values in context e.g. email address, it would be good to create new class called ContextConstants that will have all needed key values you are putting in context (It is a good practice to have such approach because when a lot of people are working on same code it will reduce inconsistency and code redundancy)


# Реализовать класс ScenarioContext

В тесте создания учетной записи вы создаете новую случайную электронную почту, используя служебный класс генерации случайной электронной 
почты. Каждый раз, когда вы вызываете этот метод, вы будете получать новый email, поэтому для написания теста, где создается
новая учетная запись со случайным адресом электронной почты и после используется другим тестом для входа в эту учетную запись, вам необходимо 
сохранить этот адрес электронной почты, чтобы повторно использовать его в следующих шагах этого длинного сценария.

Это простой пример данных, которыми мы должны делиться между этапами сценария. Обычно, когда тесты становятся сложными и длинными, мы будем 
обмениваться большим количеством данных между этапами.

Для этого нам понадобится ScenarioContext.class, он должен иметь приватную переменную класса типа HasMap<String, Object>, которая будет 
хранить эти значения.

Реализуйте этот класс в пакете java.main следующим образом:

* Сделайте конструктор private и создайте этот класс как singleton(Почитайте про этот паттерн) — `public ScenarioContext getInstance()` — 
  вернет экземпляр контекста.

* Инициализировать пустую переменную класса HashMap как static блок.

* `public T get(String key, Class clazz)` - этот метод должен возвращать объект типа T из внутреннего HashMap по ключу

* `public void put(String key, Object value)` - сохранит обект в массиве под заданным ключом

* `public void remove(String key)` - удалит объект по ключу HashMap.

* `public void removeAll()` — удалит все данные во внутренней HashMap — обычно должен вызывается после завершения теста.

Поскольку контекст используется в одном тестовом прогоне для обмена данными между этапами, вы должны стереть все данные после завершения 
теста и инициализировать контекст перед запуском нового сценария — реализовать эту функциональность в соответствующих шагах before after.

В целях тестирования создайте следующий сценарий:

* Повторно используйте шаги для создания новой учетной записи, поместите электронную почту в контекст (поместите некоторые другие данные в контекст, если вы считаете это уместным)
* Выход после создания учетной записи
* Войдите снова, используя данные с первого шага — используйте данные из контекста для входа
* Убедитесь, что пользователь вошел в систему с правильной учетной записью

СОВЕТ: при размещении значений в контексте, например. адрес электронной почты, было бы хорошо создать новый класс с именем ContextConstants, 
который будет хранить все необходимые пары ключ-значение, которые вы помещаете в контекст (это хорошая практика, потому что, когда много 
людей работают над одним и тем же кодом, это уменьшит несогласованность и избыточность кода)