package ch.dk.junit5exploration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SlowServiceJunit5Test {
    private SlowService testee = new SlowService();

    @Test
    public void sum() {
        System.out.println("SlowServiceJunit5Test started");
        Integer sum = testee.sum(1, 2);
        assertThat(sum).isEqualTo(3);
        System.out.println("SlowServiceJunit5Test finished");
    }
}