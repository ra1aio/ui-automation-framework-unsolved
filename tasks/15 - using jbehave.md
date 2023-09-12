# Using JBehave

So far our tests used JUnit engine and chaining test steps to create test cases. We have also created way of filtering test suits and executing them using maven sure fire plugin through maven run configuration.

This approach is good but there are technologies that can help our test implementation and ways of filtering tests even more convenient.

One way is integrating BDD (Behavior driven development) framework, most popular are Cucumber and JBehave. These frameworks enable us to write tests in so called Gherkin syntax which is written in plain language and makes our test cases readable to non technical people.

Read about Gherkin syntax - https://enginiety.com/knowledge/behaviour-driven-development-in-automated-tests.

There are several steps you need to do in order to implement JBehave in your testing framework.

## Step 1: Install JBehave plugin in your IDEA

It will make .story files that contain test implementation visible to IDE - Go to file, settings, plugins, search for JBehave Syntax support version 1.62 (Version may vary depending on your IDEA version).

## Step 2: Create class JBehaveStoriesRunner in src.main.java.framework package - this class should extend JUnitStories abstract class

You need to implement/override following methods:

* `protected List storyPaths()` - In this method you will define path to your .story files using `StoryFinder().findPaths()`.

NOTE: You will put your story files in src.main.resources.stories folder.

* `public org.jbehave.core.configuration.Configuration configuration()` - Here you should make configurations to JBehave framework - you should return `MostUsefulConfiguration()` object cofigured with methods:

  * useStoryLoader()
  * useStoryReporterBuilder()

Google examples where this code is implemented and integrate into your code.

* `public InjectableStepsFactory stepsFactory()`

Here you should return `new InstanceStepsFactory()` that has as first parameter your `configuration()` method and all steps implemented using JBehave (You will rewrite your existing steps soon).

## Step 3: Rewrite existing steps to use JBehave annotations Given, When and Then

Example:

```java
@Given("I have an empty stack")
public void givenIHaveAnEmptyStack() { stack = new CustomStack(); }

@When("I push an item $item")
public void whenIPushAnItem(@named("item") String item) { stack.push(item); }

@Then("I should count $expected")
public void thenIShouldCount(@named("expected") int expected) {
    int actual = stack.count();

    if (actual != expected)
        throw new RuntimeException("expected:"+expected+";actual:"+actual);
}
```

Given is used when you want to perform some precondition operation - e.g. open homepage.

When is used when you want to perform actions on application under test in order to reach goal of your test.

Then is used for asserting some behavior - like you have been asserting username of logged in user.

## Step 4: Create new .story files in src.main.resources.stories folder

Follow JBehave story syntax - Something like https://jbehave.org/reference/stable/story-syntax.html Implement all tests you have in JUnit

## Step 5: Refactor Before and After JUnit annotations to JBehave compatible annotations

After you have completed with implementing steps and stories, update annotations you have used for opening and closing browser before and after every test to appropriate JBehave annotations - they are similar, take special attention to imports in related class.

## Step 6: Erase all JUnit related code that you no longer need, also erase maven surefire plugin from pom.xml file

## Step 7: For running JBehave stories we will use jbehave-maven-plugin that has same version as jbehave.core dependency in pom.xml

Just copy paste following:

```xml
<plugin>
    <groupId>org.jbehave</groupId>
    <artifactId>jbehave-maven-plugin</artifactId>
    <version>4.6.2</version>
    <executions>
        <execution>
            <id>run-stories-as-embeddables</id>
            <phase>test</phase>
            <configuration>
                <includes>
                    <include>**/JBehaveStoriesRunner.java</include>
                </includes>
                <ignoreFailureInStories>true</ignoreFailureInStories>
                <ignoreFailureInView>false</ignoreFailureInView>
            </configuration>
            <goals>
                <goal>run-stories-as-embeddables</goal>
            </goals>
        </execution>
    </executions>
    <dependencies>
        <dependency>
            <groupId>org.codehaus.groovy</groupId>
            <artifactId>groovy-all</artifactId>
            <version>2.4.15</version>
        </dependency>
    </dependencies>
</plugin>
```

Analyze this plugin xml code a little bit, try to understand what is happening there. org.codehaus.groovy dependency of this plugin is used for managing meta filters on story and scenario level using groovy script - we will cover that soon.

## Step 8: Implement meta filtering ability

Meta filters in JBehave can be added under scenario definition in story file or on the story level. Just write Meta: on desired place - lets use only scenario level for our example.

Implement in RunConfiguration file (From aeonbits.owner dependency) meta.filters with `metaFilters()` method parameter.

In JBehaveStoriesRunner, `storyPaths()` method write `configuredEmbedder().useMetaFilters(asList(runConfig.metaFilters().split(",")))`

`runConfig.metaFilters()` is property from RunConfiguration file.

This will enable you to use metafilters when executing your stories:

In maven run configuration add: "-Dmeta.filters=groovy: debug"

And add Meta: @debug under scenario you want to run, test your implementation now.

Groovy filters will enable you to use various boolean expressions when filtering your scenarios - e.g. if you have set of several scenarios with Meta: @debug annotation and several with Meta: @debug @Skip, with "-Dmeta.filters=groovy: debug && !skip" you will be able to run all scenarios that have debug meta and not skip meta.

## Step 9: Refactor storyPaths() method from step 2

So you can make story paths you want to run configurable also - Notice that you have used relative paths to stories, you can implement another property in RunConfiguration called stories.to.run and use it in generating this path dynamically.



# Использование JBehave

До сих пор в наших тестах использовался раннер JUnit и цепочки этапов тестирования для создания тестовых примеров. Мы также создали способ 
менеджмента тест-сьютов и их выполнения с помощью плагина maven-SureFire через конфигурацию запуска maven.

Этот подход хорош, но существуют технологии, которые могут помочь нашей реализации тестов и сделать результат более человеко-читаемым.

Одним из способов является интеграция инфраструктуры BDD (Behavior driven development), наиболее популярными являются Cucumber и JBehave.
Эти инструменты позволяют нам писать тесты с использованием так называемого синтаксиса Gherkin, который написан человеко-читаемым языком и 
делает наши тест-кейсы понятными не только инженерам.

Прочтите о синтаксисе Gherkin — https://testgrow.ru/article18.

Чтобы реализовать JBehave в своей среде тестирования, необходимо выполнить несколько шагов.

## Шаг 1: Установите плагин JBehave в свою IDEA

Это сделает файлы .story, содержащие тестовую реализацию, читаемыми для IDE. Перейдите Intellij IDEA -> settings -> plugins найдите плагин 
поддержки
синтаксиса JBehave Support новейшей версии (версия может отличаться в зависимости от вашей версии IDEA).

## Шаг 2. Создайте класс JBehaveStoriesRunner в пакете src.main.java.framework — этот класс должен наследовать(extend) абстрактный класс JUnitStories

Вам необходимо реализовать/переопределить следующие методы:

* `protected List StoryPaths()`. В этом методе вы определите путь к вашим файлам .story, используя `StoryFinder().findPaths()`.

ПРИМЕЧАНИЕ. Файлы story поместите в папку src.main.resources.stories.

* `public org.jbehave.core.configuration.Configuration Configuration()` — здесь вы должны настроить структуру JBehave — вы должны вернуть объект `MostUsefulConfiguration()`, настроенный с помощью методов:

  * useStoryLoader()
  * useStoryReporterBuilder()

Поищите примеры их реализации в интернете самостоятельно и попробуйте интегрировать.

* `public InjectableStepsFactory stepsFactory()`

Здесь вы должны вернуть `new InstanceStepsFactory()`, который имеет в качестве первого параметра ваш метод `configuration()` и все 
тест-степы реализованны с помощью JBehave (об этом далее).

## Шаг 3. Перепишите существующие шаги для использования аннотаций JBehave «Дано», «Когда» и «Тогда»

Пример:

```Java
@Given("I have an empty stack")
public void givenIHaveAnEmptyStack() { stack = new CustomStack(); }

@When("I push an item $item")
public void whenIPushAnItem(@named("item") String item) { stack.push(item); }

@Then("I should count $expected")
public void thenIShouldCount(@named("expected") int expected) {
        int actual = stack.count();

        if (actual != expected)
        throw new RuntimeException("expected:"+expected+";actual:"+actual);
        }
```

Given используется, когда вы хотите выполнить некоторую операцию предварительного условия, например. открыть домашнюю страницу.

When используется, когда вы хотите выполнить действия над тестируемым приложением для достижения определенной цели.

Then используется для подтверждения некоторого поведения - например, вы подтверждаете имя пользователя, вошедшего в систему(то есть для 
ассертов).

## Шаг 4. Создайте новые файлы .story в папке src.main.resources.stories.

Следуйте синтаксису истории JBehave. Что-то вроде https://jbehave.org/reference/stable/story-syntax.html. Реализуйте все тесты, которые у вас есть в JUnit.

## Шаг 5. Рефакторинг аннотаций JUnit «До» и «После» в аннотации, совместимые с JBehave

После завершения реализации шагов и историй обновите аннотации, которые вы использовали для открытия и закрытия браузера, до и после каждого теста, чтобы они соответствовали аннотациям JBehave — они похожи, обратите особое внимание на импорт в связанном классе.

## Шаг 6. Удалите весь код, связанный с JUnit, который вам больше не нужен(можете сохранить изменения как новый проект), а также удалите плагин maven Surefire из файла pom.xml.

## Шаг 7. Для запуска историй JBehave мы будем использовать плагин jbehave-maven, имеющий ту же версию, что и зависимость jbehave.core в pom.xml.

Просто скопируйте и вставьте следующее:

```xml
<plugin>
  <groupId>org.jbehave</groupId>
  <artifactId>jbehave-maven-plugin</artifactId>
  <version>4.6.2</version>
  <executions>
    <execution>
      <id>run-stories-as-embeddables</id>
      <phase>test</phase>
      <configuration>
        <includes>
          <include>**/JBehaveStoriesRunner.java</include>
        </includes>
        <ignoreFailureInStories>true</ignoreFailureInStories>
        <ignoreFailureInView>false</ignoreFailureInView>
      </configuration>
      <goals>
        <goal>run-stories-as-embeddables</goal>
      </goals>
    </execution>
  </executions>
  <dependencies>
    <dependency>
      <groupId>org.apache.groovy</groupId>
      <artifactId>groovy-all</artifactId>
      <version>4.0.14</version>
      <type>pom</type>
    </dependency>
  </dependencies>
</plugin>
```

Проанализируйте немного xml-код этого плагина, попытайтесь понять, что там происходит. Зависимость этого плагина от org.codehaus.groovy 
используется для управления метафильтрами на уровне истории и сценария с помощью скрипта groovy — об этом также позже.

## Шаг 8. Внедрите возможность метафильтрации (опционально)

Мета-фильтры в JBehave можно добавить при определении сценария в файле истории или на уровне истории. Просто напишите Meta: в нужном 
месте — в нашем примере будем использовать только уровень сценария.

Внедрите в файл RunConfiguration (из зависимости aeonbits.owner) мета-фильтры с параметром метода `metaFilters()`.

В JBehaveStoriesRunner в методе StoryPaths() напишите `configuredEmbedder().useMetaFilters(asList(runConfig.metaFilters().split(",")))`

`runConfig.metaFilters()` — это свойство из файла RunConfiguration.

Это позволит вам использовать метафильтры при выполнении ваших историй:

В конфигурации запуска maven добавьте: «-Dmeta.filters=groovy: debug»

И добавьте Meta: @debug в сценарий, который вы хотите запустить, протестируйте свою реализацию сейчас.

Фильтры Groovy позволят вам использовать различные логические выражения при фильтрации сценариев, например: если у вас есть набор из 
нескольких сценариев с аннотацией Meta: @debug и нескольких с аннотацией Meta: @debug @Skip, с помощью "-Dmeta.filters=groovy: debug && !
skip" вы сможете запускать все сценарии, в которых есть мета-фильтр debug и пропускать все кейсы, помеченные Skip.

## Шаг 9: Рефакторинг метода StoryPaths() из шага 2 (опционально)

Таким образом, вы также можете сделать пути к историям, которые хотите запускать, настраиваемыми. Обратите внимание, что вы использовали относительные пути к историям. Вы можете реализовать в RunConfiguration еще одно свойство, называемое Stories.to.run, и использовать его для динамического создания этого пути.
