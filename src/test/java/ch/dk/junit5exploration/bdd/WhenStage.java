package ch.dk.junit5exploration.bdd;

import ch.dk.junit5exploration.SlowService;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;

public class WhenStage extends Stage<WhenStage> {
    @ScenarioState(required = true)
    private Integer firstNumber;

    @ScenarioState(required = true)
    private Integer secondNumber;

    @ScenarioState
    private Integer result;

    private SlowService slowService = new SlowService();

    public WhenStage sum() {
        this.result = slowService.sum(firstNumber, secondNumber);
        return this;
    }
}
