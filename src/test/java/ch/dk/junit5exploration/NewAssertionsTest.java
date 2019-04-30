package ch.dk.junit5exploration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import net.bytebuddy.build.ToStringPlugin.Enhance;
import org.junit.jupiter.api.Test;

public class NewAssertionsTest {

  @Test
  public void shouldThrowException() {
    IllegalStateException illegalStateException = assertThrows(IllegalStateException.class,
        () -> {
          throw new IllegalStateException();
        });
    assertThat(illegalStateException.getMessage()).isNull();
  }

  @Test
  public void shouldReturnCorrectMessageBeforeTimeoutIsExceeded() {
    final String message = assertTimeout(Duration.ofMillis(50), () -> {
      Thread.sleep(20);
      return "Hello World!";
    });
    assertThat(message).isEqualTo("Hello World!");
  }

  @Test
  public void shouldDoMultipleAsserts(){
    String foo = "bar";
    assertAll(
        () -> assertThat(foo).isNotNull(),
        () -> assertThat(foo).isNotEmpty(),
        () -> assertThat(foo).isEqualTo("bar")
    );
  }

  @Test
  public void shouldBeEquals(){
    assertEquals("Now the message comes first", "expected", "actual");
  }

  @Test
  public void shouldBeEqualsAssertJ(){
    assertThat("actual").as("Message").isEqualTo("expected");
  }
}
