package info.seleniumcucumber.steps;

import info.seleniumcucumber.utils.ScreenShotMethods;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Hooks {
    private final Logger log = LoggerFactory.getLogger(Hooks.class);

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        endOfTest(scenario);
    }

    public void endOfTest(Scenario scenario) throws IOException {
        if (scenario.getStatus() != null && scenario.isFailed()) {
            ScreenShotMethods screenshotObj = new ScreenShotMethods();
            screenshotObj.takeScreenShot();
            log.info("" + scenario.isFailed());
        }


        log.info("==========================================================================");
        log.info("================================Test " + scenario.getStatus().toString() +"===============================");
        log.info("==========================================================================");
        log.info("");
    }
}
