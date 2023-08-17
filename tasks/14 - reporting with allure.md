# Reporting with Allure

When tests are executed we need convenient way for reviewing what are results - when we have thousands of tests having fancy test framework without good reporting is not very useful.

As now you are running tests using maven, maven surefire plugin generates xml file with results in `target/surefire-reports` folder. This xml file is not very useful for human to be analyzed it is not so readable as you can see.

We will use very good reporting tool called allure reporter that will use this xml file and represent it in very nice report.

See: http://allure.qatools.ru/.

Allure documentation is very good so use it for installing allure on your system (Use brew for this purpose since it is most convenient) and for generating first allure report after running some set of test.


# Тест-репорты с Allure

Когда тесты выполнятся, нам нужен удобный способ для просмотра результатов - ведь когда запускаются тысячи тестов с причудливой тестовой 
структурой без хорошей отчетности это очень тяжело разобрать впоследствии.

Поскольку теперь вы запускаете тесты с использованием maven, плагин maven surefire генерирует файл xml с результатами в папке `target/surefire-reports`.
Этот xml-файл не очень подходит для анализа человеком, он не так удобен для чтения, как вы видите.

Мы будем использовать очень хороший инструмент отчетности под названием allure reporter, который будет использовать этот XML-файл и 
представлять его в виде отчета.

См.: http://allure.qatools.ru/.

Документация Allure очень хороша, поэтому используйте ее для установки allure в вашей системе (используйте brew для этой цели, так как 
это наиболее удобно, если у вас мак) и для создания первого allure репорта после выполнения некоторого набора тестов.