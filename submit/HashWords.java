//import itsc2214.*; // not needed now, but you might in your projects

/**
 * Class implements a hash table.
 * Uses an array of WordFrequency Objects.
 */
public class HashWords {

    private int size;
    private WordFrequency[] hashArray;
    private int totalWords;
    private int uniqueWords;

    /**
     * Constructor of the class.
     * @param initialSize is the initial size of the array.
     */
    public HashWords(int initialSize) {
        this.size = initialSize;
        this.hashArray = new WordFrequency[initialSize];
        this.totalWords = 0;
        this.uniqueWords = 0;

    }

    /**
     * Returns size of hash table.
     * @return the initial size of the hash table.
     */
    public int size() {
        return this.size;
    }

    /**
     * Makes a hash key for given word.
     * @param w is the given word.
     * @return the hash key.
     */
    public int hashKey(String w) {
        return Math.abs(w.toLowerCase().hashCode()) % size;

    }


    /**
     * Returns the frequency of he given word in the hash table.
     * @param w is the word we to find the frquency of.
     * @return the frequency, or 0 if not found in table
     */
    public int frequency(String w) {
        int k = hashKey(w);
        int start = k;
        while (hashArray[k] != null) {
            WordFrequency f = hashArray[k];
            if (f.getWord().equals(w)) {
                return f.getCount();
            }
            k = (k + 1) % size;
            if (k == start) {
                break;
            }
        }
        return 0;
    }



    /**
     * Adds a word to the table.
     * @param w is the word to add.
     */
    public void addWord(String w) {
        int k = hashKey(w);
        while (hashArray[k] != null && !hashArray[k].getWord().equals(w)) {
            k = (k + 1) % size;

        }
        if (hashArray[k] != null && hashArray[k].getWord().equals(w)) {
            hashArray[k].increment();
        } else {
            hashArray[k] = new WordFrequency(w);
        }
        totalWords++;

    }
    
    /**
     * Checks if the table has the given word.
     * @param w the given word.
     * @return true if in table, false otherwise.
     */
    public boolean contains(String w) {
        return frequency(w) > 0;
    }


    /**
     * Returns the total number of unique words in the table.
     * @return total number of unique words.
     */
    public int numUniqueWordsInTable() {
        return this.uniqueWords;
    }

    /**
     * Returns total number of words(includes duplicates).
     * @return total number of words.
     */
    public int totalNumOfWords() {
        return this.totalWords;
    }

    /**
     * Returns the most common word in table.
     * @return the most common word.
     */
    public String mostCommonWord() {
        String common = null;
        int maxFreq = 0;
        for (WordFrequency f : hashArray) {
            if (f != null && f.getCount() > maxFreq) {
                maxFreq = f.getCount();
                common = f.getWord();
            }
        }
        return common;
    }

    /**
     * Calculates frequency of a given word.
     * @param w is th given word.
     * @return term frequency as a double.
     */
    public double termFrequency(String w) {
        int wordNum = frequency(w);
        return totalWords == 0 ? 0.0 : (double) wordNum / totalWords;
    }
    
}
