package ch.dk.junit5exploration.bdd;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ScenarioState;

public class GivenStageSecondNumber extends Stage<GivenStageSecondNumber> {

    @ScenarioState
    private Integer secondNumber;

    public GivenStageSecondNumber secondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
        return this;
    }
}
