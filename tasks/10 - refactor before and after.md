# Refactor test classes to avoid before and after step redundancy

You have probably noticed so far that your before and after test steps are redundant - you have same code in every Test class that opens and closes browser.

To avoid that we can use advantages of object oriented programming, create BaseTest.class and put it in java.test folder. There implement before and after test steps for opening and closing browser. Now let every Test class extend BaseTest.class - then you will have only one place with your precondition and postcondition steps.


# Рефакторинг тестовых классов, чтобы избежать избыточности шагов до и после

Допишите @Before & @After аннотации в классе TestBase - помните, что все тестовые классы должны его наследовать

Если уже реализовано - пропускаем данную таску