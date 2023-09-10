package main;

public class ScenarioContextProvider {

    private static ScenarioContext INSTANCE;

    private ScenarioContextProvider(){
    }

    public static ScenarioContext getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ScenarioContext();
        }

        return INSTANCE;
    }
}
