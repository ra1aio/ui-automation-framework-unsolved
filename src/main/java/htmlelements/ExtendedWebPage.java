package htmlelements;

import org.hamcrest.Matcher;

/**
 * This is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public abstract class ExtendedWebPage {

    void isAt(Matcher<String> url) {
        isAt(url);
    }
}
