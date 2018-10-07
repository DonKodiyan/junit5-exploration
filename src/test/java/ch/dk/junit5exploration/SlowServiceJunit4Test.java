package ch.dk.junit5exploration;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SlowServiceJunit4Test {
    private SlowService testee = new SlowService();

    @Test
    public void sum() {
        System.out.println("SlowServiceJunit4Test started");
        Integer sum = testee.sum(1,2);
        assertThat(sum).isEqualTo(3);
        System.out.println("SlowServiceJunit4Test finished");
    }
}