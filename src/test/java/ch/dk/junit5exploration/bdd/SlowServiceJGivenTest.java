package ch.dk.junit5exploration.bdd;

import com.tngtech.jgiven.junit5.JGivenExtension;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(JGivenExtension.class)
public class SlowServiceJGivenTest extends ScenarioTest<GivenStage, WhenStage, ThenStage> {

    @Test
    public void my_scenario() {
        given()
                .firstNumber()
                .firstNumber(12)
                .givenStageSecondNumber()
                .secondNumber(10);
        when()
                .sum();
        then()
                .shouldResult(22);

    }

}
