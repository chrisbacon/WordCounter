package com.codeclan.example.wordcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter {
    private String[] words;
    private HashMap<String, Integer> frequencies;

    public WordCounter(String text) {
        this.words = text.split(" ");

        this.frequencies = new HashMap<String, Integer>();

        for(int i=0; (i<countWords()); i++) {
            String word = words[i];
            if (frequencies.containsKey(word)) {
                int old_count = frequencies.get(word);
                frequencies.put(word, old_count+1);
            } else {
                frequencies.put(word, 1);
            }
        }
    }

    public int countWords() {
        return this.words.length;
    }

    public int frequency(String word) {
        return this.frequencies.get(word);
    }

    public String wordCounts() {
        String output = "";
        Set<String> keys = frequencies.keySet();
        for (String key : keys) {
            output += (key + ": " + frequencies.get(key) + ", ");
        }
        return output;
    }
}
