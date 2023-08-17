# Refactor test classes to avoid before and after step redundancy

You have probably noticed so far that your before and after test steps are redundant - you have same code in every Test class that opens and closes browser.

To avoid that we can use advantages of object oriented programming, create BaseTest.class and put it in java.test folder. There implement before and after test steps for opening and closing browser. Now let every Test class extend BaseTest.class - then you will have only one place with your precondition and postcondition steps.


# Рефакторинг тестовых классов, чтобы избежать избыточности шагов до и после

Вы, вероятно, уже заметили, что ваши шаги before and after избыточны - у вас есть один и тот же код в каждом тестовом классе, который открывает и закрывает браузер.

Чтобы избежать этого, мы можем использовать преимущества объектно-ориентированного программирования, создав BaseTest.class и поместив его в папку java.test. 
Там реализовать тестовые шаги before and after открытия и закрытия браузера. Теперь пусть каждый класс Test наследует BaseTest.class - 
тогда у вас будет одно общее место во фрейворке с шагами предусловия и постусловия.