package com.exercise.answer.util;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.exercise.answer.util.RandomAnswer.parseAnswer;

public class RandomAnswerTest {
    @Test
    public void assertTrue () {
        String question = "aa";
        String actual = parseAnswer(question);
        String expected = "No";
        assertEquals("assert even", expected, actual);
    }
    @Test
    public void assertFalse () {
        String question = "a";
        String actual = parseAnswer(question);
        String expected = "Yes";
        assertEquals("assert not even", expected, actual);
    }
}
