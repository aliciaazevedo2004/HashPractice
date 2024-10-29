import org.junit.*;
import static org.junit.Assert.*;

/**
 * Thes will be used to test the fuctions of the WordFrequency class.
 */
public class WordFrequencyTest {

    private WordFrequency runner;
    private WordFrequency runner2;
    private WordFrequency runner3;
    private WordFrequency runner4;
    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        runner = new WordFrequency("Hello");
        runner2 = new WordFrequency("Hey");

        runner3 = new WordFrequency("Hi");
        runner4 = new WordFrequency("Hi");


    }


    /**
     * testOne(): testing to see that it gets the word. 
     */
    @Test
    public void getWord() {
        assertEquals("Hello", runner.getWord());
        assertEquals("Hey", runner2.getWord());
        
    }

    /**
     * testTwo(): testing to see that it gets the count.
     */
    @Test
    public void getCount() {
        //should the first one return 1?

        assertEquals(1, runner.getCount());
        runner.increment();
        assertEquals(2, runner.getCount());
       
    }

    /**
     * testThree(): testing that it increments count.
     */
    @Test
    public void increment() {
        runner2.increment();
        assertEquals(2, runner2.getCount());
    }

    /**
     * testFour(): testing to see the different ways in which the objects are equal.
     */
    @Test
    public void equals() 
    {
 
        String some = "Hi";
        assertTrue(runner4.equals(some));

        int number = 9;
        assertFalse(runner.equals(number));

        assertTrue(runner3.equals(runner4));

        assertTrue(runner4.equals(runner4));

    }
}
