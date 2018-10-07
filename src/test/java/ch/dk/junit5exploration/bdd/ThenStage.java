package ch.dk.junit5exploration.bdd;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenStage extends Stage<ThenStage> {
    @ScenarioState(required = true)
    private Integer result;

    public ThenStage shouldResult(Integer expectedResult) {
        assertThat(result).isEqualTo(expectedResult);
        return this;
    }
}