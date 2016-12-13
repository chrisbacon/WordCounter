package com.codeclan.example.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounterTest {
    WordCounter wc;

    @Before
    public void before() {
        String text =
                    "Wondering how endorphins travel via screen " +
                    "As I feel my withdrawal " +
                    "I understand them 90's songs " +
                    "Rap music has ruined me " +
                    "I always want to loop my favorite part";
        wc = new WordCounter(text);
    }

    @Test
    public void countWordsTest() {
        assertEquals(29, wc.countWords());
    }

    @Test
    public void frequencyTest() {
        assertEquals(3, wc.frequency("I"));
        assertEquals(2, wc.frequency("my"));
        assertEquals(1, wc.frequency("endorphins"));
    }

//    @Test
//    public void orderedWordsTest() {
//        WordCounter wordc = new WordCounter("Hello hello my name is Chris");
//        String[] words = new String[]{"hello", "Chris", "is", "my", "name"};
//        assertArrayEquals(words, wordc.orderedWords());
//    }
}
