package tasks;

import configInterface.EnvironmentConfiguration;
import configInterface.RunConfiguration;
import lombok.Getter;
import org.aeonbits.owner.ConfigFactory;

@Getter
public class ConfigObjectProvider {

    private final String browser;
    private final int browserWidth;
    private final int browserHeight;
    private final String seleniumVer;
    private final String chromeDriver;
    private final int timeout;
    private final String email;
    private final String password;
    private final String homepageUrl;

    public ConfigObjectProvider() {

        RunConfiguration cfgRun = ConfigFactory.create(RunConfiguration.class);
        EnvironmentConfiguration cfgEnv = ConfigFactory.create(EnvironmentConfiguration.class);

        this.browser = cfgRun.browser();
        this.browserWidth = cfgRun.browserWidth();
        this.browserHeight = cfgRun.browserHeight();
        this.seleniumVer = cfgRun.seleniumVer();
        this. chromeDriver = cfgRun.chromeDriver();
        this.timeout = cfgRun.timeout();
        this.email = cfgRun.email();
        this.password = cfgRun.password();
        this.homepageUrl = cfgEnv.homepageUrl();
    }

    public String collectAllToString() {

        return "Browser: " + browser
                + "\nbrowserWidth: " + browserWidth
                + "\nbrowserHeight: " + browserHeight
                + "\nseleniumVer: " + seleniumVer
                +"\nchromeDriver: " + chromeDriver
                + "\ntimeout: " + timeout
                + "\nemail: " + email
                + "\npassword: " + password
                + "\nhomepageUrl: " + homepageUrl;
    }
}