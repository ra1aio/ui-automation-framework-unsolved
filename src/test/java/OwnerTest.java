import configInterface.EnvironmentConfiguration;
import configInterface.RunConfiguration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasks.ConfigObjectProvider;

public class OwnerTest {

    ConfigObjectProvider cop = new ConfigObjectProvider();

    @Test
    @DisplayName("Проверка работоспособности класса ConfigObjectProvider")
    void checkConfigObjectProvider() {
        RunConfiguration cfgRun = ConfigFactory.create(RunConfiguration.class);
        EnvironmentConfiguration cfgEnv = ConfigFactory.create(EnvironmentConfiguration.class);

        System.out.println("Browser: " + cfgRun.browser());
        System.out.println("browserWidth: " + cfgRun.browserWidth());
        System.out.println("seleniumVer: " + cfgRun.seleniumVer());
        System.out.println("timeout: " + cfgRun.timeout());
        System.out.println("email: " + cfgRun.email());
        System.out.println("password: " + cfgRun.password());
        System.out.println("Browser: " + cfgRun.browser());
        System.out.println("homepageUrl: " + cfgEnv.homepageUrl());
    }

    @Test
    @DisplayName("Проверка работоспособности метода collectAllToString")
    void checkMethodCollectAllToString() {
        System.out.println(cop.collectAllToString());
    }
}