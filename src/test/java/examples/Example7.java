package examples;

import org.junit.Test;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Example7 {

    @Test
    public void testAssertJMachers() {
        // given
        String text = "abc";
        String[] stringArray = {"abc", "cde", "efg"};

        // then
        Assertions.assertThat(text)
                .isEqualTo("abc");

        Assertions.assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}
