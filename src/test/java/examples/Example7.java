package examples;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class Example7 {

    @Rule
    public TemporaryFolder folder= new TemporaryFolder();

    @Test
    public void testSimple() {
        List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,5);
        assertThat(listOfIntegers).isNotEmpty();
        assertThat(listOfIntegers).startsWith(1);
        assertThat(listOfIntegers).contains(4);
        assertThat(listOfIntegers).doesNotContain(7);
        assertThat(listOfIntegers).doesNotContainNull();
        assertThat(listOfIntegers).containsSequence(2,3,4);
    }

    @Test
    public void testFiles() throws IOException {
        File createdFile= folder.newFile("myfile.txt");
        File createdFolder= folder.newFolder("subfolder");
        FileWriter myWriter = new FileWriter(createdFile);
        myWriter.write("Java is cool");
        myWriter.close();

        assertThat(createdFile)
                .exists()
                .isFile()
                .canRead()
                .canWrite()
                .hasContent("Java is cool");
        assertThat(createdFolder).exists();
    }

    @Test
    public void testAssertJMachers() {
        // given
        String text = "abc";
        String[] stringArray = {"abc", "cde", "efg"};

        // then
        assertThat(text)
                .isEqualTo("abc");

        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }

    @Test
    public void testHobbit() {
        Hobbit frodo = new Hobbit();
        frodo.setName("Frodo");
        Hobbit sam = new Hobbit();
        sam.setName("Sam");
        Villain sauron = new Villain();
        List<Object> fellowshipOfTheRing = Arrays.asList((Object) frodo, sam);
        assertThat(frodo).isNotEqualTo(sauron).isIn(fellowshipOfTheRing);
        assertThat(sam).isNotEqualTo(sauron).isIn(fellowshipOfTheRing);
        assertThat(sauron).isNotIn(fellowshipOfTheRing);

        assertThat(frodo.getName())
                .startsWith("Fro")
                .endsWith("do")
                .isEqualToIgnoringCase("frodo");

        assertThat(fellowshipOfTheRing)
                .hasSize(2)
                .contains(frodo, sam)
                .doesNotContain(sauron);
    }
}

class Hobbit {

    private String name = "Frodo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Villain {

    private String name = "Sauron";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
