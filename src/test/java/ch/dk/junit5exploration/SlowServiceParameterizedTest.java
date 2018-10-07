package ch.dk.junit5exploration;

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
        Integer sum = testee.sum(a, b);
        assertThat(sum).isEqualTo(expected);
        System.out.println("SlowServiceParameterizedTest finished");
    }
}