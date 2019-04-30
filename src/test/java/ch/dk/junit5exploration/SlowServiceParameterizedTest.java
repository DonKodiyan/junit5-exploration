package ch.dk.junit5exploration;

import io.qameta.allure.Lead;
import io.qameta.allure.Step;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SlowServiceParameterizedTest {
    private SlowService testee = new SlowService();

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "4,2,6",
            "8,-1,7",
            "-4,8,4"
    })
    public void sum(Integer a, Integer b, Integer expected) {
        System.out.println("SlowServiceParameterizedTest started");
        Integer sum = getSum(a, b);
        assertThat(sum).isEqualTo(expected);
        System.out.println("SlowServiceParameterizedTest finished");
    }

    @Step("calculating {a} + {b}.")
    @Lead("ATeam")
    private Integer getSum(Integer a, Integer b) {
        return testee.sum(a, b);
    }
}