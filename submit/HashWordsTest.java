import org.junit.*;
import static org.junit.Assert.*;

/**
 * This test class has a runner object that will be used for testing.
 */
public class HashWordsTest {
    // Object to be tested.
    private HashWords runner;

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        runner = new HashWords(10);
        runner.addWord("Hi");
        runner.addWord("Hi");
        runner.addWord("Yo");
        runner.addWord("Hello");
        runner.addWord("Hello");
        runner.addWord("Hello");

        
    }
    /**
     * Testing to see that it returns the size of the table.
     */
    @Test
    public void addWordAndContatains() {

        assertTrue(runner.contains("Hi"));
        assertTrue(runner.contains("Yo"));
        assertTrue(runner.contains("Hello"));
        assertFalse(runner.contains("Cheese"));
    }

    /**
     * Testing to see that it returns the
     * correct number of times a word appears
     * in the array.
     */
    @Test
    public void frequency() {
        assertEquals(3, runner.frequency("Hello"));
        assertEquals(2, runner.frequency("Hi"));
        assertEquals(1, runner.frequency("Yo"));
        assertEquals(0, runner.frequency("Cheese"));

    }

    /**
     * Testing that the correct most common word is returned.
     */
    @Test
    public void mostCommonWord() {
        assertEquals("Hello", runner.mostCommonWord());
    }

    /**
     * Testing that the correct size of the array is returned.
     */
    @Test
    public void size() {
        assertEquals(10, runner.size());
    }

    /**
     * Testing that is returns the total
     * number of words(includes duplicates).
     */
    @Test
    public void totalNumOfWords() {
        assertEquals(6, runner.totalNumOfWords());
    }








}
