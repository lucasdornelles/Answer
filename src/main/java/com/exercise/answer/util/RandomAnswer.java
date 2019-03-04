package com.exercise.answer.util;

public class RandomAnswer {

    public static String parseAnswer (String question) {
        int questionLength = question.length();
        if (isEven(questionLength)) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    private static boolean isEven (int number) {
        int module = number%2;
        return module == 0;
    }
}
