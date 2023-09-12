# Implement JBehave test suites management functionality

In assignment 12 you have implemented test suite management functionality in core JUnit technology using configuration tag in maven surefire plugin - value of includes tag was parameterized so that exact suites file can be managed through run configuration parameter.

We need to implement same functionality now that we have additional JBehave layer.

For running JBehave tests using maven run commands we are using `<artifactId>jbehave-maven-plugin</artifactId>` plugin, notice that `<include>\*\*/JBehaveStoriesRunner.java</include>` tag inside this plugin from assignment 16 specifies path to our runner which runs stories as paths defined in JBehaveStoriesRunner.java class.

If we want to extend this functionality with creating new Suites classes that will have their own class paths of relevant stories we want to run for specific test suite we need to do the following:

* Create JBehaveStoriesRunner.java to be abstract class

* Write abstract methods in JBehaveStoriesRunner.java abstract class:

  * `protected abstract List<String> includeStories()`
  * `protected abstract List<String> excludeStories()`

* Create new method `protected List<String> storiesForRunning(List<String> includeStories, List<String> excludeStories)`

That will manage lists in includeStories and excludeStories to return final list of stories we want to run

* Reimplement `storyPaths()` method from assignment 16 so it will use method from step 3 to actually list all desired stories

NOTE: Step 3 can be optional, you can perform paths management directly in storyPaths() method.

* Implement SmokeSuite.java and other suites you have used in assignment 12

These suites classes should extend JBehaveStoriesRunner.java abstract class and implement abstract methods so they will include proper sets of stories for related suite.

Same as we did in assignment 12, refactor `<artifactId>jbehave-maven-plugin</artifactId>`, `<include>\*\*/JBehaveStoriesRunner.java</include>` so it will be configurable from command line.

Test your implementation.

# Реализовать функциональность управления наборами тестов JBehave

В задании 12 вы реализовали test suite management c использованием технологии JUnit и тэга configuration модуля maven 
surefire — значение тега include было параметризовано, чтобы можно было управлять конкретным файлом сьюта при помощи параметров run 
configuration(управление конфигурациями в выпадающем списке наборов конфигураций)

Нам нужно реализовать ту же функциональность теперь, когда у нас есть дополнительный слой JBehave.

Для запуска тестов JBehave с использованием команд запуска maven мы используем плагин `<artifactId>jbehave-maven-plugin</artifactId>`, 
обратите внимание на тег `<include>\*\*/JBehaveStoriesRunner.java</include>` внутри этого плагина, упомянутого в рамках задания 16 
указывает путь к нашему тест-раннеру, который запускает истории, указанные путями к файлам в классе JBehaveStoriesRunner.java.

Если мы хотим расширить эту функциональность, создав новые классы Suites, которые будут иметь свои собственные пути к классам 
соответствующих историй, то нам нужно сделать следующее:

* Создайте JBehaveStoriesRunner.java как абстрактный класс

* Напишите абстрактные методы в абстрактном классе JBehaveStoriesRunner.java:

  * `protected abstract List<String> includeStories()`
  * `protected abstract List<String> excludeStories()`

* Создать новый метод `protected List<String> storiesForRunning(List<String> includeStories, List<String> excludeStories)`

Это будет управлять списками в includeStories и excludeStories, чтобы вернуть окончательный список историй, которые мы хотим запустить.

* Переопределите метод `storyPaths()` из задания 16, чтобы он использовал метод из шага 3, чтобы фактически перечислить все нужные истории.

ПРИМЕЧАНИЕ. Шаг 3 может быть необязательным, вы можете выполнять управление путями непосредственно в методе storyPaths().

* Реализуйте SmokeSuite.java и другие пакеты, которые вы использовали в задании 12.

Эти классы наборов должны расширять абстрактный класс JBehaveStoriesRunner.java и реализовывать абстрактные методы, чтобы они включали надлежащие наборы историй для связанного набора.

Как и в задании 12, отрефакторьте `<artifactId>jbehave-maven-plugin</artifactId>`, `<include>\*\*/JBehaveStoriesRunner.java</include>`, 
чтобы его можно было настроить из командной строки.

Протестируйте свою реализацию.
