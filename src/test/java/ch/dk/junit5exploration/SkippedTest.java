package ch.dk.junit5exploration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class SkippedTest {

  @Test
  @ExtendWith(SkipExtension.class)
  public void skipMe() {
    Assertions.fail();
  }

  @Target({ElementType.TYPE, ElementType.METHOD})
  @Retention(RetentionPolicy.RUNTIME)
  @ExtendWith(SkipExtension.class)
  public @interface Skip {}

  @Test
  @Skip
  public void skipMeToo() {
    Assertions.fail();
  }

}
