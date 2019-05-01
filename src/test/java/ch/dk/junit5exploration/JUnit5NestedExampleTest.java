package ch.dk.junit5exploration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Nested Example")
class JUnit5NestedExampleTest {

  @Nested
  @DisplayName("Tests for the method A")
  class A {
    @Test
    @DisplayName("Example test for method A")
    void sampleTestForMethodA() {
      System.out.println("Example test for method A");
    }
  }

  @Nested
  @DisplayName("Tests for the method B")
  class B {
    @Test
    @DisplayName("Example test for method B")
    void sampleTestForMethodB() {
      System.out.println("Example test for method B");
    }
  }
}
