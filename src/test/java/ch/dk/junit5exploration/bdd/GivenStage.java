package ch.dk.junit5exploration.bdd;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioStage;

public class GivenStage extends Stage<GivenStage> {
    @ScenarioStage
    private GivenStageFirstNumber givenStageFirstNumber;

    @ScenarioStage
    private GivenStageSecondNumber givenStageSecondNumber;

    public GivenStageFirstNumber firstNumber() {
        return givenStageFirstNumber;
    }

    public GivenStageSecondNumber givenStageSecondNumber() {
        return givenStageSecondNumber;
    }
}
