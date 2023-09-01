package configInterface;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;

@Sources({"file:src/main/resources/runConfiguration.properties"})
public interface RunConfiguration extends Config {

    @Key("browser.name")
    @DefaultValue("Chrome")
    String browser();

    @Key("browser.width")
    int browserWidth();

    @Key("browser.height")
    int browserHeight();

    @Key("selenium.version")
    String  seleniumVer();

    @Key("chromedriver.version")
    String chromeDriver();

    @Key("timeout.settings")
    int timeout();

    @Key("my.email")
    String email();

    @Key("my.password")
    String password();
}