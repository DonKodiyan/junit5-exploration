package ch.dk.junit5exploration;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SlowServiceDynamicTest {
    private SlowService testee = new SlowService();

    @TestFactory
    public Stream<DynamicTest> dynamicTestsFromStreamInJava8() {
        return IntStream.range(0, 100)
                .mapToObj(i -> DynamicTest.dynamicTest("Test " + 1,
                        () -> {
                            assertThat(testee.sum(i, i)).isEqualTo(i * 2);
                        }));
    }
}