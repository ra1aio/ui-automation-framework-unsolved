package main;

import java.util.HashMap;

public class ScenarioContext {

    private HashMap<String, Object> dataContext;

    ScenarioContext() {
        dataContext = new HashMap<>();
    }

    public <T> T get(String key) {

        return (T) dataContext.get(key);
    }

    public void put(String key, Object value) {
        dataContext.put(key, value);
    }

    public void remove(String key) {
        dataContext.remove(key);
    }

    public void removeAll() {
        dataContext.clear();
    }
}
