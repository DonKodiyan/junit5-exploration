package ch.dk.junit5exploration.bdd;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioStage;
import com.tngtech.jgiven.annotation.ScenarioState;

public class GivenStageFirstNumber extends Stage<GivenStageFirstNumber> {

    @ScenarioState
    private Integer firstNumber;

    @ScenarioStage
    private GivenStage givenStage;

    public GivenStage firstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
        return givenStage;
    }


}
