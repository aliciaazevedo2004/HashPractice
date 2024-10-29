/**
 * WordFrequency class to be used in a hash table.
 * 
 * @author Alicia Azevedo
 */
public class WordFrequency {

    private String word;
    private int count;

    /**
     * Description
     * @param w is parameter of the constructor.
     */
    public WordFrequency(String w) {
        word = w;
        count = 1;
    }

    /**
     * @return gets the word.
     */
    public String getWord() {
        return word;
    }

    /**
     * @return gets the count.
     */
    public int getCount() {
        return count;
    }

    /**
     * Increments the count of the object.
     */
    public void increment() {
        count++;
    }

    /**
     * equals() - compares two WordFrequency objects
     * checking to see if they are the same. Equality
     * is defined by string matching ignoring case.
     * 
     * @param other object to compare against
     * @return true if this and other are equals, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof String) {
            String w = (String) other;
            return getWord().equalsIgnoreCase(w);
        } else if (other instanceof WordFrequency) {
            WordFrequency wf = (WordFrequency) other;
            String w = wf.getWord();
            return getWord().equalsIgnoreCase(w);
        } else {
            return false;
        }
    }
}
