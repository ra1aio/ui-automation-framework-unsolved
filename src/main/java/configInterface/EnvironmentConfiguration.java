package configInterface;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;

@Sources({"file:src/main/resources/environment.properties"})
public interface EnvironmentConfiguration extends Config {

    @Key("homepage.url")
    String homepageUrl();
}