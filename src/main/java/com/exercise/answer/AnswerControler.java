package com.exercise.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class AnswerControler {

    @GetMapping("/answer")
    @ResponseBody
    public String answer(@RequestParam(required = false) String question){

        Random rnd = new Random();

        String randomAnswer = "";
        int randomId = rnd.nextInt(3);
        switch (randomId){
            case 0 : randomAnswer = "Yes";
            break;
            case 1 : randomAnswer = "Maybe";
            break;
            case 2 : randomAnswer = "No";
        }

        if (question == "") {
            randomAnswer = "Please enter a question.";
        }
        return randomAnswer;
    }

    @RequestMapping("/")
    public String Home() {
        return "index.html";
    }
}
